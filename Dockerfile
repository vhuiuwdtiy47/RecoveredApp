# syntax=docker/dockerfile:1
# 基于精简版 OpenJDK 17 提供 Linux 构建环境
FROM eclipse-temurin:17-jdk-jammy

# 环境变量
ENV ANDROID_HOME=/opt/android-sdk \
    ANDROID_SDK_ROOT=/opt/android-sdk \
    DEBIAN_FRONTEND=noninteractive \
    PATH="/opt/android-sdk/cmdline-tools/latest/bin:/opt/android-sdk/platform-tools:${PATH}"

# 安装必要工具
RUN apt-get update && apt-get install -y --no-install-recommends wget unzip ca-certificates git bash && \
    rm -rf /var/lib/apt/lists/*

# 下载并安装 Android commandline tools (latest)
RUN mkdir -p $ANDROID_HOME/cmdline-tools && \
    cd /tmp && \
    wget -q https://dl.google.com/android/repository/commandlinetools-linux-10406996_latest.zip -O cmdline-tools.zip && \
    unzip cmdline-tools.zip -d $ANDROID_HOME/cmdline-tools && \
    mv $ANDROID_HOME/cmdline-tools/cmdline-tools $ANDROID_HOME/cmdline-tools/latest && \
    rm cmdline-tools.zip

# 预安装必须的组件：平台33 + build-tools 30.0.3 + platform-tools
# 使用 yes 管道接受许可
RUN yes | sdkmanager --licenses && \
    sdkmanager "platform-tools" "platforms;android-33" "build-tools;30.0.3"

WORKDIR /workspace

# 默认进入 bash 方便交互；构建时使用 docker run ... ./gradlew assembleDebug
CMD ["/bin/bash"]

#!/usr/bin/env bash
set -euo pipefail

# 接受全部许可并安装指定组件（若Dockerfile预安装失败，可在容器内手动执行）
YES="yes"
$YES | sdkmanager --licenses || true
sdkmanager "platform-tools" "platforms;android-33" "build-tools;30.0.3"

echo "Android SDK 初始化完成"

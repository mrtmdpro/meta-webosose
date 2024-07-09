# Copyright (c) 2021-2024 LG Electronics, Inc.

inherit features_check
REQUIRED_DISTRO_FEATURES = "webos-qt"

# Pre-defined macro for OS identification
TARGET_CFLAGS:append = " -D__WEBOS__"
TARGET_CXXFLAGS:append = " -D__WEBOS__"

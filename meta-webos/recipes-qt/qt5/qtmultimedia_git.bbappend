# Copyright (c) 2016-2019 LG Electronics, Inc.

EXTENDPRAUTO_append = "webos4"

FILESEXTRAPATHS_prepend := "${THISDIR}/${BPN}:"

# Patches based on 5.12.meta-qt5.2
SRC_URI += " \
    file://0001-Add-QMediaPlayerControl-accessor.patch \
"

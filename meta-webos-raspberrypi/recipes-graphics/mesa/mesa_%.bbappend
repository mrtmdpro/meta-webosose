# Copyright (c) 2020 LG Electronics, Inc.

EXTENDPRAUTO_append = "webosrpi1"

FILESEXTRAPATHS_prepend := "${THISDIR}/${BPN}:"

SRC_URI_append_rpi = " \
    file://0001-Use-format-mod-liner-for-RGB565.patch \
"

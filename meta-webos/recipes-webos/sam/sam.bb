# Copyright (c) 2013-2019 LG Electronics, Inc.

DESCRIPTION = "System Application Manager"
AUTHOR = "Sangwoo Kang <sangwoo82.kang@lge.com>"
SECTION = "webos/base"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS = "gtest glib-2.0 luna-service2 libpbnjson boost icu pmloglib librolegen procps libwebosi18n"
RDEPENDS_${PN} = "ecryptfs-utils"
RDEPENDS_${PN} += "${VIRTUAL-RUNTIME_webos-customization}"

VIRTUAL-RUNTIME_webos-customization ?= ""

WEBOS_VERSION = "2.0.0-8_5850f576c4daed1a08d57ae9d8f68955bb3c54a9"
PR = "r22"

inherit webos_component
inherit webos_cmake
inherit webos_enhanced_submissions
inherit webos_daemon
inherit webos_system_bus
inherit webos_public_repo

SRC_URI = "${WEBOSOSE_GIT_REPO_COMPLETE}"
S = "${WORKDIR}/git"

PACKAGES =+ "${PN}-tests"
ALLOW_EMPTY_${PN}-tests = "1"
FILES_${PN}-tests = "${libexecdir}/tests/*"

SRC_URI += "file://0001-CMakeLists.txt-don-t-check-for-signals-Boost-library.patch \
            file://0002-Remove-prerequisite-for-sam-initialize.patch"

# Copyright (c) 2013-2020 LG Electronics, Inc.

SUMMARY = "Wayland protocol extensions for webOS"
AUTHOR = "Anupam Kaul <anupam.kaul@lge.com>"
SECTION = "webos/base"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS = "wayland wayland-native"

WEBOS_VERSION = "1.0.0-35_ed1fb41db78451e64d702b9324db81dcddd83233"
PR = "r2"

inherit webos_component
inherit webos_cmake
inherit webos_enhanced_submissions
inherit webos_public_repo

SRC_URI = "${WEBOSOSE_GIT_REPO_COMPLETE}"
S = "${WORKDIR}/git"

FILES_${PN}-dev += "${datadir}/*"

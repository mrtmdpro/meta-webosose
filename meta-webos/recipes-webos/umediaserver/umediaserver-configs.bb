# Copyright (c) 2014-2020 LG Electronics, Inc.

SUMMARY = "umediaserver configs installation"
AUTHOR = "Peter Nordström <peter.nordstrom@lge.com>"
SECTION = "webos/base"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e3fc50a88d0a364313df4b21ef20c29e"

WEBOS_VERSION = "1.0.0-9_0b17d8082add82a8040e591481544a0b2e35fe96"
PR = "r6"

inherit webos_cmake
inherit webos_machine_dep
inherit webos_enhanced_submissions
inherit webos_distro_dep
inherit webos_distro_variant_dep
inherit webos_filesystem_paths
inherit webos_public_repo

EXTRA_OECMAKE += "-DWEBOS_INSTALL_CONFCAPSDIR:STRING=${webos_frameworksdir}"

SRC_URI = "${WEBOSOSE_GIT_REPO_COMPLETE}"
S = "${WORKDIR}/git"

FILES_${PN} += "${webos_frameworksdir}/umediaserver/*"

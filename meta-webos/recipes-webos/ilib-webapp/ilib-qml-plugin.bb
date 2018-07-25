# Copyright (c) 2017-2018 LG Electronics, Inc.

SUMMARY = "iLib Qml loader"
AUTHOR = "Goun Lee <goun.lee@lge.com>"
SECTION = "libs/qtplugin"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS = "qtdeclarative"

WEBOS_VERSION = "11.0.0-2_1d8cff6dcb5cd95114f19316be776b02b1bea773"
PR = "r3"

inherit webos_qmake5
inherit webos_enhanced_submissions
inherit webos_public_repo

SRC_URI = "${WEBOSOSE_GIT_REPO_COMPLETE}"
S = "${WORKDIR}/git"

FILE_READER_PROJECT = "filereader-webos.pro"
QMAKE_PROFILES = "${S}/${FILE_READER_PROJECT}"

OE_QMAKE_PATH_HEADERS = "${OE_QMAKE_PATH_QT_HEADERS}"

FILES_${PN} += "${OE_QMAKE_PATH_QML}/*"

# until pseudo is completely fixed
# PLAT-48507 pseudo: random package_qa failures
# ERROR: ilib-qml-plugin-11.0.0-2-r2 do_package_qa: QA Issue: ilib-qml-plugin: /ilib-qml-plugin/usr/lib/qml/iLib/qmldir is owned by uid 1101, which is the same as the user running bitbake. This may be due to host contamination [host-user-contaminated]
INSANE_SKIP_${PN} += "host-user-contaminated"

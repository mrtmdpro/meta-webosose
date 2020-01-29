# Copyright (c) 2013-2020 LG Electronics, Inc.

EXTENDPRAUTO_append = "webos71"

# Remove LGPL3-only files
python do_patch_append() {
    bb.build.exec_func('remove_LGPL3', d)
}

remove_LGPL3() {
    rm -vf ${S}/src/plugins/platforms/andr*oid/extract.cpp
}

# Disable features we don't use in all webOS products
PACKAGECONFIG_DEFAULT_remove = "dbus"

# Enable accessibility for qtquickcontrols
PACKAGECONFIG_append = " accessibility"

# Disable widget features
PACKAGECONFIG_remove = "widgets"

# Configure qt5 to use platform harfbuzz
PACKAGECONFIG_append = " harfbuzz"
PACKAGECONFIG[harfbuzz] = "-system-harfbuzz,-qt-harfbuzz,harfbuzz"

# Configure qt5 to compile with GL ES2 instead of default desktop GL
PACKAGECONFIG_GL = "gles2"
# We have alsa in DISTRO_FEATURES so it was enabled before
#PACKAGECONFIG_append = " alsa"
# We had this enabled in our old gpro/meta-qt5 recipe
#PACKAGECONFIG_append = " iconv"
# We had this enabled in our old gpro/meta-qt5 recipe
PACKAGECONFIG_append = " xkb"
# We had this enabled in our old gpro/meta-qt5 recipe
PACKAGECONFIG_append = " icu"
# We had this enabled in our old gpro/meta-qt5 recipe
PACKAGECONFIG_append = " glib"
# We had this enabled in our old gpro/meta-qt5 recipe
PACKAGECONFIG_append = " fontconfig"
# We had this enabled in our old gpro/meta-qt5 recipe
PACKAGECONFIG_append = " sql-sqlite"
# No longer added automatically
PACKAGECONFIG_append = " gif"
# Needed since qtwayland 5.12
PACKAGECONFIG_append = " xkbcommon"

# XXX Change --linuxfb => -no-linuxfb
# PACKAGECONFIG_append = " linuxfb"
# remove linuxfb dependency
# PACKAGECONFIG[linuxfb] = "-linuxfb,-no-linuxfb,"

# we know we're not building any QPA now
PACKAGECONFIG_append = " no-qpa-platform"
PACKAGECONFIG[no-qpa-platform] = "-no-qpa-platform-guard,,"

# XXX Perhaps change -qt-pcre => -system-pcre (as it's already part of webOS)
# PACKAGECONFIG_append = " pcre"

# Depending on whether LTTNG support is enabled or not for the build we need to
# depend on the LTTNG providers to not let the build fail
inherit webos_lttng
PACKAGECONFIG[lttng] = "-trace lttng,-trace no,lttng-ust"
PACKAGECONFIG_append = "${@ ' lttng' if '${WEBOS_LTTNG_ENABLED}' == '1' else '' }"

# XXX Try -reduce-exports

# XXX maliit-framework-webos currently requires --dbus; change to -no-dbus and
#      remove dbus from PACKAGECONFIG variable once [GF-8182] is implemented.
# PACKAGECONFIG = " \
#    release \
#    udev \
#    evdev \
#    widgets \
#    openssl \
#    ${PACKAGECONFIG_GL} \
#    ${PACKAGECONFIG_FB} \
#    ${PACKAGECONFIG_X11} \
#    ${PACKAGECONFIG_FONTS} \
#    ${PACKAGECONFIG_SYSTEM} \
#    ${PACKAGECONFIG_MULTIMEDIA} \
#    ${PACKAGECONFIG_DISTRO} \
#"

FILESEXTRAPATHS_prepend := "${THISDIR}/qtbase:"

# Emulator eglfs support with NYX input subsystem
inherit webos_machine_impl_dep
PACKAGECONFIG[webos-emulator] = "-webos-emulator,-no-webos-emulator,nyx-lib"
PACKAGECONFIG_append_emulator = " gbm kms eglfs webos-emulator"

# Patches from 5.12.meta-webos.14 based on 5.12.meta-qt5-shared.9
SRC_URI_append = " \
    file://0001-WebOS-platform-expects-filenames-in-UTF-8.patch \
    file://0002-DisableCertificateVerificationCheck.patch \
    file://0003-ChangeTheGlyphCacheSize.patch \
    file://0004-QOpenGL2PaintEngineEx-must-makeCurrent-own-context.patch \
    file://0005-Decrease-the-size-of-QFontCache.patch \
    file://0006-platformsupport.pro-Add-MESA_EGL_NO_X11_HEADERS.patch \
    file://0007-Fix-floating-point-clip-rectangle-rounding-in-OpenGL.patch \
    file://0008-network-Send-SslHandShakeError-more-in-detail.patch \
    file://0009-Add-support-for-local-zh-Hant-MY.patch \
    file://0010-network-SSL-Handle-Multiple-Client-Certificates.patch \
    file://0011-Expose-new-QSystemSemaphore-resetOwner-API.patch \
    file://0012-Fix-allocateTimerId.patch \
    file://0013-Disable-code-cache-of-video-and-audio-file.patch \
    file://0014-LTTNG-tracing-support-in-QtGUI.patch \
    file://0015-QOpenGLTextureCache-size-setting.patch \
    file://0016-QOpenGLTextureGlyphCache-limits.patch \
    file://0017-QFontEngine-glyph-cache-count.patch \
    file://0018-QNetworkDiskCache-Disable-disk-cache-if-content-have.patch \
    file://0019-Revert-Don-t-accept-json-strings-with-trailing-garba.patch \
    file://0020-Revert-Make-QElapsedTimer-default-to-invalid-and-now.patch \
    file://0021-Preserve-OpenGL-context-on-window-close.patch \
    file://0022-Add-the-accessiblebridge-as-a-plugintype-of-gui-modu.patch \
    file://0023-Fix-HarfBuzz-NG-regression.patch \
    file://0024-Support-wrapMode-wordWrap-for-QML-Text-type-for-Kore.patch \
    file://0025-Check-if-combined-glyph-exists-in-font-s-charmap-tab.patch \
    file://0026-Prevent-rare-segfault-crashes-in-QNetworkConfigurati.patch \
    file://0027-Disable-Faux-bolding-in-Qts-FreeType-FontEngine.patch \
    file://0028-Avoid-loading-comments-from-JPEG-and-PNG-files.patch \
    file://0029-Workaround-for-SGX-clipping-bug.patch \
    file://0030-Workaround-for-RGX-broken-render-to-texture-with-siz.patch \
    file://0031-Fix-bug-of-calculate-xsize-for-fonts.patch \
    file://0032-Keyboard-Mouse-eglfs-patch-for-Emulator.patch \
    file://0033-Modify-the-touch-event-for-emulator.patch \
"

SRC_URI_append_hardware = " \
    file://0034-eglfs-Support-multiple-device-integration.patch \
    file://0035-eglfs-Support-multiple-display.patch \
    file://0036-eglfs-Associate-keyboard-touch-device-with-window.patch \
"

# Do not include Qt testability patch for release
inherit webos_prerelease_dep
SRC_URI_append = "${@'' if '${WEBOS_DISTRO_PRERELEASE}' == '' else ' file://0099-Move-testability-loading-code-to-the-QGuiApplication.patch'}"

VIRTUAL-RUNTIME_gpu-libs ?= ""
RDEPENDS_${PN} += "${VIRTUAL-RUNTIME_gpu-libs}"

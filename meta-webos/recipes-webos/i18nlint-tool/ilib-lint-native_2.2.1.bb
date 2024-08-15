# Copyright (c) 2024 LG Electronics, Inc.

SUMMARY = "A linter for i18n issues for any type of project"
HOMEPAGE = "https://github.com/iLib-js/ilib-lint"
# NOTE: multiple licenses have been detected; they have been separated with &
# in the LICENSE value for now since it is a reasonable assumption that all
# of the licenses apply. If instead there is a choice between the multiple
# licenses then you should change the value to separate the licenses with |
# instead of &. If there is any doubt, check the accompanying documentation
# to determine which situation is applicable.
LICENSE = "0BSD & Apache-2.0 & ISC & MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327 \
                    file://node_modules/@formatjs/ecma402-abstract/LICENSE.md;md5=0a72329692ab7427e8a455db571e399d \
                    file://node_modules/@formatjs/fast-memoize/LICENSE.md;md5=03a30bc23ca9fba6908797a2c82b72e7 \
                    file://node_modules/@formatjs/icu-messageformat-parser/LICENSE.md;md5=0a72329692ab7427e8a455db571e399d \
                    file://node_modules/@formatjs/icu-skeleton-parser/LICENSE.md;md5=0a72329692ab7427e8a455db571e399d \
                    file://node_modules/@formatjs/intl-displaynames/LICENSE.md;md5=0a72329692ab7427e8a455db571e399d \
                    file://node_modules/@formatjs/intl-listformat/LICENSE.md;md5=0a72329692ab7427e8a455db571e399d \
                    file://node_modules/@formatjs/intl-localematcher/LICENSE.md;md5=0a72329692ab7427e8a455db571e399d \
                    file://node_modules/@formatjs/intl/LICENSE.md;md5=0a72329692ab7427e8a455db571e399d \
                    file://node_modules/@log4js-node/log4js-api/LICENSE;md5=d92e60ee98664c54f68aa515a6169708 \
                    file://node_modules/array-buffer-byte-length/LICENSE;md5=03c1a46f1c5121c7eb2cd13d6cb56831 \
                    file://node_modules/array.prototype.map/LICENSE;md5=375dc7ca936a14e9c29418d5263bd066 \
                    file://node_modules/arraybuffer.prototype.slice/LICENSE;md5=968ec55067e4739372aa780aab6b3f11 \
                    file://node_modules/available-typed-arrays/LICENSE;md5=838b75dc6028daf3e04e57871b7ad3ed \
                    file://node_modules/braces/LICENSE;md5=0f64900f8f30e53054962c9f1fc3205b \
                    file://node_modules/call-bind/LICENSE;md5=0eb2c73daa0ecf037cbdf3d0bb0c98d5 \
                    file://node_modules/data-view-buffer/LICENSE;md5=06aae85028f50ba69e6f83b6c9402b26 \
                    file://node_modules/data-view-byte-length/LICENSE;md5=8fe23ea421aaf9f9d687709f6a6a09b7 \
                    file://node_modules/data-view-byte-offset/LICENSE;md5=8fe23ea421aaf9f9d687709f6a6a09b7 \
                    file://node_modules/date-format/LICENSE;md5=11e69b4aa865a34554aefa2958c837cf \
                    file://node_modules/debug/LICENSE;md5=d85a365580888e9ee0a01fb53e8e9bf0 \
                    file://node_modules/define-data-property/LICENSE;md5=06aae85028f50ba69e6f83b6c9402b26 \
                    file://node_modules/define-properties/LICENSE;md5=53ffc646fdb83e45279cfe7105e5157b \
                    file://node_modules/es-abstract/LICENSE;md5=8eddf3932f9ef22313648669213a2e4b \
                    file://node_modules/es-array-method-boxes-properly/LICENSE;md5=375dc7ca936a14e9c29418d5263bd066 \
                    file://node_modules/es-define-property/LICENSE;md5=8fe23ea421aaf9f9d687709f6a6a09b7 \
                    file://node_modules/es-errors/LICENSE;md5=8fe23ea421aaf9f9d687709f6a6a09b7 \
                    file://node_modules/es-get-iterator/LICENSE;md5=375dc7ca936a14e9c29418d5263bd066 \
                    file://node_modules/es-object-atoms/LICENSE;md5=8fe23ea421aaf9f9d687709f6a6a09b7 \
                    file://node_modules/es-set-tostringtag/LICENSE;md5=92e9d482d23fb5be48580cb5e3d82a22 \
                    file://node_modules/es-to-primitive/LICENSE;md5=5db8fa3e421a3211e6a3dc68544da455 \
                    file://node_modules/fill-range/LICENSE;md5=0f64900f8f30e53054962c9f1fc3205b \
                    file://node_modules/flatted/LICENSE;md5=73d317079e156478653d02207ca984da \
                    file://node_modules/for-each/LICENSE;md5=726a37665a35c687bf935f1503efee20 \
                    file://node_modules/fs-extra/LICENSE;md5=ea817882455c03503f7d014a8f54f095 \
                    file://node_modules/function-bind/LICENSE;md5=e7417c1a8ad83f88bcac21ad440d48b2 \
                    file://node_modules/function.prototype.name/LICENSE;md5=7d84e54df3d29e3cbd74b7368b844db4 \
                    file://node_modules/functions-have-names/LICENSE;md5=375dc7ca936a14e9c29418d5263bd066 \
                    file://node_modules/get-intrinsic/LICENSE;md5=0eb2c73daa0ecf037cbdf3d0bb0c98d5 \
                    file://node_modules/get-symbol-description/LICENSE;md5=a026b78b6909aa5e21d77709fb6b5156 \
                    file://node_modules/globalthis/LICENSE;md5=7d84e54df3d29e3cbd74b7368b844db4 \
                    file://node_modules/gopd/LICENSE;md5=8478c87d16770f6d32a4578c475d3930 \
                    file://node_modules/graceful-fs/LICENSE;md5=163972d49c2f7a3d3b687aeb48e9e3c9 \
                    file://node_modules/has-bigints/LICENSE;md5=375dc7ca936a14e9c29418d5263bd066 \
                    file://node_modules/has-property-descriptors/LICENSE;md5=d237eac07663bde2409de740ba75ec97 \
                    file://node_modules/has-proto/LICENSE;md5=d237eac07663bde2409de740ba75ec97 \
                    file://node_modules/has-symbols/LICENSE;md5=afee57a289508ed4df3456667778aaf6 \
                    file://node_modules/has-tostringtag/LICENSE;md5=a026b78b6909aa5e21d77709fb6b5156 \
                    file://node_modules/hasown/LICENSE;md5=19283ee92f78c91154834571c1f05a94 \
                    file://node_modules/ilib-common/LICENSE;md5=86d3f3a95c324c9479bd8986968f4327 \
                    file://node_modules/ilib-common/docs/scripts/prettify/Apache-License-2.0.txt;md5=3b83ef96387f14655fc854ddc3c6bd57 \
                    file://node_modules/ilib-ctype/LICENSE;md5=86d3f3a95c324c9479bd8986968f4327 \
                    file://node_modules/ilib-env/LICENSE;md5=86d3f3a95c324c9479bd8986968f4327 \
                    file://node_modules/ilib-lint-common/LICENSE;md5=86d3f3a95c324c9479bd8986968f4327 \
                    file://node_modules/ilib-lint-common/docs/scripts/prettify/Apache-License-2.0.txt;md5=3b83ef96387f14655fc854ddc3c6bd57 \
                    file://node_modules/ilib-loader/LICENSE;md5=86d3f3a95c324c9479bd8986968f4327 \
                    file://node_modules/ilib-loader/docs/scripts/prettify/Apache-License-2.0.txt;md5=3b83ef96387f14655fc854ddc3c6bd57 \
                    file://node_modules/ilib-locale/LICENSE;md5=86d3f3a95c324c9479bd8986968f4327 \
                    file://node_modules/ilib-localedata/LICENSE;md5=86d3f3a95c324c9479bd8986968f4327 \
                    file://node_modules/ilib-localedata/docs/scripts/prettify/Apache-License-2.0.txt;md5=3b83ef96387f14655fc854ddc3c6bd57 \
                    file://node_modules/ilib-localeinfo/LICENSE;md5=86d3f3a95c324c9479bd8986968f4327 \
                    file://node_modules/ilib-localeinfo/docs/scripts/prettify/Apache-License-2.0.txt;md5=3b83ef96387f14655fc854ddc3c6bd57 \
                    file://node_modules/ilib-localematcher/LICENSE;md5=86d3f3a95c324c9479bd8986968f4327 \
                    file://node_modules/ilib-localematcher/docs/scripts/prettify/Apache-License-2.0.txt;md5=3b83ef96387f14655fc854ddc3c6bd57 \
                    file://node_modules/ilib-tools-common/LICENSE;md5=86d3f3a95c324c9479bd8986968f4327 \
                    file://node_modules/ilib-tools-common/docs/scripts/prettify/Apache-License-2.0.txt;md5=3b83ef96387f14655fc854ddc3c6bd57 \
                    file://node_modules/ilib-xliff/LICENSE;md5=86d3f3a95c324c9479bd8986968f4327 \
                    file://node_modules/ilib-xliff/docs/scripts/prettify/Apache-License-2.0.txt;md5=3b83ef96387f14655fc854ddc3c6bd57 \
                    file://node_modules/ilib-xml-js/LICENSE;md5=73732c4f53307b08429e65a483913738 \
                    file://node_modules/internal-slot/LICENSE;md5=375dc7ca936a14e9c29418d5263bd066 \
                    file://node_modules/intl-messageformat/LICENSE.md;md5=a93f41ed37d71934a82df1f5c939c27f \
                    file://node_modules/is-arguments/LICENSE;md5=d22b3eb619d81197fd4f3ca47c2c1ea5 \
                    file://node_modules/is-array-buffer/LICENSE;md5=db2b446565e5f8d6041d1c10fb307510 \
                    file://node_modules/is-bigint/LICENSE;md5=291be6f19f64188a89ffd5180aea06f7 \
                    file://node_modules/is-boolean-object/LICENSE;md5=5db8fa3e421a3211e6a3dc68544da455 \
                    file://node_modules/is-callable/LICENSE;md5=5db8fa3e421a3211e6a3dc68544da455 \
                    file://node_modules/is-data-view/LICENSE;md5=7b5e8558141b64e8475183ea02f2de77 \
                    file://node_modules/is-date-object/LICENSE;md5=5db8fa3e421a3211e6a3dc68544da455 \
                    file://node_modules/is-map/LICENSE;md5=c18cc44449ec61c93b216bf74e6c4fa4 \
                    file://node_modules/is-negative-zero/LICENSE;md5=d22b3eb619d81197fd4f3ca47c2c1ea5 \
                    file://node_modules/is-number-object/LICENSE;md5=5db8fa3e421a3211e6a3dc68544da455 \
                    file://node_modules/is-number/LICENSE;md5=0f64900f8f30e53054962c9f1fc3205b \
                    file://node_modules/is-regex/LICENSE;md5=d22b3eb619d81197fd4f3ca47c2c1ea5 \
                    file://node_modules/is-set/LICENSE;md5=c18cc44449ec61c93b216bf74e6c4fa4 \
                    file://node_modules/is-shared-array-buffer/LICENSE;md5=a026b78b6909aa5e21d77709fb6b5156 \
                    file://node_modules/is-string/LICENSE;md5=5db8fa3e421a3211e6a3dc68544da455 \
                    file://node_modules/is-symbol/LICENSE;md5=5db8fa3e421a3211e6a3dc68544da455 \
                    file://node_modules/is-typed-array/LICENSE;md5=5db8fa3e421a3211e6a3dc68544da455 \
                    file://node_modules/is-weakref/LICENSE;md5=838b75dc6028daf3e04e57871b7ad3ed \
                    file://node_modules/isarray/LICENSE;md5=a5df515ef062cc3affd8c0ae59c059ec \
                    file://node_modules/iterate-iterator/LICENSE;md5=0eb2c73daa0ecf037cbdf3d0bb0c98d5 \
                    file://node_modules/iterate-value/LICENSE;md5=375dc7ca936a14e9c29418d5263bd066 \
                    file://node_modules/json5/LICENSE.md;md5=d80f2808a405d641840b50a06f80e93c \
                    file://node_modules/jsonfile/LICENSE;md5=423f377ade95936f6fe009b1c137bfdb \
                    file://node_modules/log4js/LICENSE;md5=8a7df09be5dd1002c10a82f81acd84aa \
                    file://node_modules/micromatch/LICENSE;md5=0f64900f8f30e53054962c9f1fc3205b \
                    file://node_modules/ms/license.md;md5=fd56fd5f1860961dfa92d313167c37a6 \
                    file://node_modules/object-inspect/LICENSE;md5=288162f1d1bfa064f127f2b42d2a656f \
                    file://node_modules/object-keys/LICENSE;md5=0026e638d7d5c5f2768864ce0074f8ad \
                    file://node_modules/object.assign/LICENSE;md5=2b439ca9e99134dee172a7cc6d989174 \
                    file://node_modules/options-parser/LICENSE;md5=5ad3fcbea84f484e55aee18b3e9e18bf \
                    file://node_modules/picomatch/LICENSE;md5=abd0e25891525eb13d5a794f550a6ee4 \
                    file://node_modules/possible-typed-array-names/LICENSE;md5=8fe23ea421aaf9f9d687709f6a6a09b7 \
                    file://node_modules/promise.allsettled/LICENSE;md5=375dc7ca936a14e9c29418d5263bd066 \
                    file://node_modules/regexp.prototype.flags/LICENSE;md5=6009913822e586406a8cf459157e868a \
                    file://node_modules/rfdc/LICENSE;md5=fc2ea1f4c58a804909742c8eadede5ea \
                    file://node_modules/safe-array-concat/LICENSE;md5=06aae85028f50ba69e6f83b6c9402b26 \
                    file://node_modules/safe-regex-test/LICENSE;md5=8478c87d16770f6d32a4578c475d3930 \
                    file://node_modules/sax/LICENSE;md5=5f49410228c16917dacc5eab921004cb \
                    file://node_modules/set-function-length/LICENSE;md5=19283ee92f78c91154834571c1f05a94 \
                    file://node_modules/set-function-name/LICENSE;md5=19283ee92f78c91154834571c1f05a94 \
                    file://node_modules/side-channel/LICENSE;md5=375dc7ca936a14e9c29418d5263bd066 \
                    file://node_modules/stop-iteration-iterator/LICENSE;md5=06aae85028f50ba69e6f83b6c9402b26 \
                    file://node_modules/streamroller/LICENSE;md5=11e69b4aa865a34554aefa2958c837cf \
                    file://node_modules/string.prototype.trim/LICENSE;md5=6475e27670715f30f712326eeb195e93 \
                    file://node_modules/string.prototype.trimend/LICENSE;md5=1e241a19d2d112b1db1a5c1c23216939 \
                    file://node_modules/string.prototype.trimstart/LICENSE;md5=1e241a19d2d112b1db1a5c1c23216939 \
                    file://node_modules/to-regex-range/LICENSE;md5=b561e0a423bedc9d9ca9c8c67d40abb9 \
                    file://node_modules/tslib/CopyrightNotice.txt;md5=cb391e9e435b114c07bee8f6754c4f98 \
                    file://node_modules/tslib/LICENSE.txt;md5=f938d99cba29007eeae26d80a9a4cfa6 \
                    file://node_modules/typed-array-buffer/LICENSE;md5=06aae85028f50ba69e6f83b6c9402b26 \
                    file://node_modules/typed-array-byte-length/LICENSE;md5=838b75dc6028daf3e04e57871b7ad3ed \
                    file://node_modules/typed-array-byte-offset/LICENSE;md5=838b75dc6028daf3e04e57871b7ad3ed \
                    file://node_modules/typed-array-length/LICENSE;md5=838b75dc6028daf3e04e57871b7ad3ed \
                    file://node_modules/typescript/LICENSE.txt;md5=55a8748c7d5c7253f3e4bb7402ff04db \
                    file://node_modules/unbox-primitive/LICENSE;md5=375dc7ca936a14e9c29418d5263bd066 \
                    file://node_modules/universalify/LICENSE;md5=a734c6ad6e37a515025ac5e8e90ef786 \
                    file://node_modules/which-boxed-primitive/LICENSE;md5=375dc7ca936a14e9c29418d5263bd066 \
                    file://node_modules/which-typed-array/LICENSE;md5=5db8fa3e421a3211e6a3dc68544da455"

SRC_URI = " \
    npm://registry.npmjs.org/;package=ilib-lint;version=${PV} \
    npmsw://${THISDIR}/${BPN}/npm-shrinkwrap.json \
"

S = "${WORKDIR}/npm"

PR = "r0"

inherit npm
inherit native

do_install() {
    install -d ${D}${base_prefix}/opt/i18nlint-tool/node_modules/${BPN}
    cp -R --no-dereference --preserve=mode,links -v ${S}/* ${D}${base_prefix}/opt/i18nlint-tool/node_modules/${BPN}
}

SYSROOT_DIRS += "${base_prefix}/opt"

LICENSE:${PN} = "Apache-2.0"
LICENSE:${PN}-formatjs-ecma402-abstract = "MIT"
LICENSE:${PN}-formatjs-fast-memoize = "MIT"
LICENSE:${PN}-formatjs-icu-messageformat-parser = "MIT"
LICENSE:${PN}-formatjs-icu-skeleton-parser = "MIT"
LICENSE:${PN}-formatjs-intl = "MIT"
LICENSE:${PN}-formatjs-intl-displaynames = "MIT"
LICENSE:${PN}-formatjs-intl-listformat = "MIT"
LICENSE:${PN}-formatjs-intl-localematcher = "MIT"
LICENSE:${PN}-log4js-node-log4js-api = "Apache-2.0"
LICENSE:${PN}-array-buffer-byte-length = "MIT"
LICENSE:${PN}-arrayprototypemap = "MIT"
LICENSE:${PN}-arraybufferprototypeslice = "MIT"
LICENSE:${PN}-available-typed-arrays = "MIT"
LICENSE:${PN}-braces = "MIT"
LICENSE:${PN}-call-bind = "MIT"
LICENSE:${PN}-data-view-buffer = "MIT"
LICENSE:${PN}-data-view-byte-length = "MIT"
LICENSE:${PN}-data-view-byte-offset = "MIT"
LICENSE:${PN}-date-format = "MIT"
LICENSE:${PN}-debug = "MIT"
LICENSE:${PN}-define-data-property = "MIT"
LICENSE:${PN}-define-properties = "MIT"
LICENSE:${PN}-es-abstract = "MIT"
LICENSE:${PN}-es-array-method-boxes-properly = "MIT"
LICENSE:${PN}-es-define-property = "MIT"
LICENSE:${PN}-es-errors = "MIT"
LICENSE:${PN}-es-get-iterator = "MIT"
LICENSE:${PN}-es-object-atoms = "MIT"
LICENSE:${PN}-es-set-tostringtag = "MIT"
LICENSE:${PN}-es-to-primitive = "MIT"
LICENSE:${PN}-fill-range = "MIT"
LICENSE:${PN}-flatted = "ISC"
LICENSE:${PN}-for-each = "MIT"
LICENSE:${PN}-fs-extra = "MIT"
LICENSE:${PN}-function-bind = "MIT"
LICENSE:${PN}-functionprototypename = "MIT"
LICENSE:${PN}-functions-have-names = "MIT"
LICENSE:${PN}-get-intrinsic = "MIT"
LICENSE:${PN}-get-symbol-description = "MIT"
LICENSE:${PN}-globalthis = "MIT"
LICENSE:${PN}-gopd = "MIT"
LICENSE:${PN}-graceful-fs = "ISC"
LICENSE:${PN}-has-bigints = "MIT"
LICENSE:${PN}-has-property-descriptors = "MIT"
LICENSE:${PN}-has-proto = "MIT"
LICENSE:${PN}-has-symbols = "MIT"
LICENSE:${PN}-has-tostringtag = "MIT"
LICENSE:${PN}-hasown = "MIT"
LICENSE:${PN}-ilib-common = "Apache-2.0"
LICENSE:${PN}-ilib-ctype = "Apache-2.0"
LICENSE:${PN}-ilib-env = "Apache-2.0"
LICENSE:${PN}-ilib-lint-common = "Apache-2.0"
LICENSE:${PN}-ilib-loader = "Apache-2.0"
LICENSE:${PN}-ilib-locale = "Apache-2.0"
LICENSE:${PN}-ilib-localedata = "Apache-2.0"
LICENSE:${PN}-ilib-localeinfo = "Apache-2.0"
LICENSE:${PN}-ilib-localematcher = "Apache-2.0"
LICENSE:${PN}-ilib-tools-common = "Apache-2.0"
LICENSE:${PN}-ilib-xliff = "Apache-2.0"
LICENSE:${PN}-ilib-xml-js = "MIT"
LICENSE:${PN}-internal-slot = "MIT"
LICENSE:${PN}-intl-messageformat = "Apache-2.0"
LICENSE:${PN}-is-arguments = "MIT"
LICENSE:${PN}-is-array-buffer = "MIT"
LICENSE:${PN}-is-bigint = "MIT"
LICENSE:${PN}-is-boolean-object = "MIT"
LICENSE:${PN}-is-callable = "MIT"
LICENSE:${PN}-is-data-view = "MIT"
LICENSE:${PN}-is-date-object = "MIT"
LICENSE:${PN}-is-map = "MIT"
LICENSE:${PN}-is-negative-zero = "MIT"
LICENSE:${PN}-is-number = "MIT"
LICENSE:${PN}-is-number-object = "MIT"
LICENSE:${PN}-is-regex = "MIT"
LICENSE:${PN}-is-set = "MIT"
LICENSE:${PN}-is-shared-array-buffer = "MIT"
LICENSE:${PN}-is-string = "MIT"
LICENSE:${PN}-is-symbol = "MIT"
LICENSE:${PN}-is-typed-array = "MIT"
LICENSE:${PN}-is-weakref = "MIT"
LICENSE:${PN}-isarray = "MIT"
LICENSE:${PN}-iterate-iterator = "MIT"
LICENSE:${PN}-iterate-value = "MIT"
LICENSE:${PN}-json5 = "Apache-2.0"
LICENSE:${PN}-jsonfile = "MIT"
LICENSE:${PN}-log4js = "Apache-2.0"
LICENSE:${PN}-micromatch = "MIT"
LICENSE:${PN}-ms = "MIT"
LICENSE:${PN}-object-inspect = "MIT"
LICENSE:${PN}-object-keys = "MIT"
LICENSE:${PN}-objectassign = "MIT"
LICENSE:${PN}-options-parser = "Apache-2.0"
LICENSE:${PN}-picomatch = "MIT"
LICENSE:${PN}-possible-typed-array-names = "MIT"
LICENSE:${PN}-promiseallsettled = "MIT"
LICENSE:${PN}-regexpprototypeflags = "MIT"
LICENSE:${PN}-rfdc = "MIT"
LICENSE:${PN}-safe-array-concat = "MIT"
LICENSE:${PN}-safe-regex-test = "MIT"
LICENSE:${PN}-sax = "Apache-2.0"
LICENSE:${PN}-set-function-length = "MIT"
LICENSE:${PN}-set-function-name = "MIT"
LICENSE:${PN}-side-channel = "MIT"
LICENSE:${PN}-stop-iteration-iterator = "MIT"
LICENSE:${PN}-streamroller = "MIT"
LICENSE:${PN}-stringprototypetrim = "MIT"
LICENSE:${PN}-stringprototypetrimend = "MIT"
LICENSE:${PN}-stringprototypetrimstart = "MIT"
LICENSE:${PN}-to-regex-range = "MIT"
LICENSE:${PN}-tslib = "0BSD"
LICENSE:${PN}-typed-array-buffer = "MIT"
LICENSE:${PN}-typed-array-byte-length = "MIT"
LICENSE:${PN}-typed-array-byte-offset = "MIT"
LICENSE:${PN}-typed-array-length = "MIT"
LICENSE:${PN}-typescript = "Apache-2.0"
LICENSE:${PN}-unbox-primitive = "MIT"
LICENSE:${PN}-universalify = "MIT"
LICENSE:${PN}-which-boxed-primitive = "MIT"
LICENSE:${PN}-which-typed-array = "MIT"

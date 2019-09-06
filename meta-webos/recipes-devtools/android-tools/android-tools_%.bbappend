# Copyright (c) 2017-2019 LG Electronics, Inc.

EXTENDPRAUTO_append = "webos1"

VIRTUAL-RUNTIME_bash ?= "bash"
RDEPENDS_${BPN}_append_class-target = " ${VIRTUAL-RUNTIME_bash}"
RDEPENDS_${BPN}_remove_class-target = "${@oe.utils.conditional('WEBOS_PREFERRED_PROVIDER_FOR_BASH', 'busybox', 'bash', '', d)}"

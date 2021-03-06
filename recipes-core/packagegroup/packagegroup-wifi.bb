SUMMARY = "Wifi tools"
DESCRIPTION = "The minimal set of packages required to manupulate wifi"
LICENSE = "LGPL"
PR = "r0"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup


MACHINE_ESSENTIAL_EXTRA_RDEPENDS ?= ""
MACHINE_ESSENTIAL_EXTRA_RRECOMMENDS ?= ""


RDEPENDS_${PN} = "\
  netcat \
  avahi \
  wpa-supplicant \
  wireless-tools \
  hostap-daemon \
  ifplugd \
  lighttpd \
  tcpdump \
  ${MACHINE_ESSENTIAL_EXTRA_RDEPENDS} \
 "

RRECOMMENDS_${PN} = "\
  ${MACHINE_ESSENTIAL_EXTRA_RRECOMMENDS} \
 "


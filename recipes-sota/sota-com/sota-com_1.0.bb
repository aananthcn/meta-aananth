# Copyright (C) 2015 Aananth Chellapa Natarajan <c.n.aananth@gmail.com>
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Communication core for SOTA - Software update Over The Air."
HOMEPAGE = "https://gitlab.com/aananthcn/sota-com"
LICENSE = "GPLv2"
SECTION = ""
DEPENDS = "xdelta3 jansson"

LIC_FILES_CHKSUM = "file://LICENSE;md5=2c1c00f9d3ed9e24fa69b932b7e7aff2"

SRC_URI = "git://gitlab.com/aananthcn/sota-com.git;protocol=https"
#SRCREV = "13c746675f7518d8d2bc639cba446964781d1d52"

SRC_URI[md5sum] = "80b70cf716d7ccfc5e9b79a4fd014366"
SRC_URI[sha256sum] = "9b6b6a771c908adaadd078f4d128c00468ab49230d85b57658f04a0b9549e873"

SRCREV_default_pn-sota-com="${AUTOREV}"

S = "${WORKDIR}/git"


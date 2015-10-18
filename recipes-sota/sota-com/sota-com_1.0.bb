# Copyright (C) 2015 Aananth Chellapa Natarajan <c.n.aananth@gmail.com>
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Communication core for SOTA - Software update Over The Air."
HOMEPAGE = "https://gitlab.com/aananthcn/sota-com"
LICENSE = "GPLv2"

SRC_URI[md5sum] = "80b70cf716d7ccfc5e9b79a4fd014366"
SRC_URI[sha256sum] = "9b6b6a771c908adaadd078f4d128c00468ab49230d85b57658f04a0b9549e873"

SRCREV_default_pn-sota-com="${AUTOREV}"

LIC_FILES_CHKSUM = "file://LICENSE;md5=2c1c00f9d3ed9e24fa69b932b7e7aff2"



DEPENDS = " xdelta3 jansson openssl zlib"
RDEPENDS_sota-com += " libcrypto openssl bzip2 jansson"

S = "${WORKDIR}/git"

# Note: Please make sure you add gitlab.com in ~/.ssh/config with port value set to 22 
#       and gitlab user name like below
#      
# Host gitlab.com 
#        IdentityFile ~/.ssh/id_rsa
#        Port 22
#        User aananthcn
#        TCPKeepAlive yes
#        IdentitiesOnly yes
do_fetch() {
    git clone git@gitlab.com:aananthcn/sota-com.git ${WORKDIR}/git
}

do_install() {
    install -d ${D}/${bindir}
    install -m 0544 ${S}/sotaclient ${D}/${bindir}
    install -m 0544 ${S}/sota.sh ${D}/${bindir}
    install -d ${D}/${sysconfdir}
    install -m 0644 ${S}/client/client_info.json ${D}/${sysconfdir}
}

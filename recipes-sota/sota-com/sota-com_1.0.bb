# Copyright (C) 2015 Aananth Chellapa Natarajan <c.n.aananth@gmail.com>
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Communication core for SOTA - Software update Over The Air."
HOMEPAGE = "https://gitlab.com/aananthcn/sota-com"
LICENSE = "MPLv2"

SRC_URI[md5sum] = "815ca599c9df247a0c7f619bab123dad"
SRC_URI[sha256sum] = "9b6b6a771c908adaadd078f4d128c00468ab49230d85b57658f04a0b9549e873"

SRCREV_default_pn-sota-com="${AUTOREV}"

LIC_FILES_CHKSUM = "file://LICENSE;md5=815ca599c9df247a0c7f619bab123dad"



DEPENDS = " xdelta3 jansson openssl zlib"
RDEPENDS_sota-com += " libcrypto openssl bzip2 jansson libtar"

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

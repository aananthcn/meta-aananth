# Copyright (C) 2015 Aananth Chellapa Natarajan <c.n.aananth@gmail.com>
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "A sample reflash or sota updater program for sota-com"
HOMEPAGE = "https://gitlab.com/aananthcn/sota-updater"
LICENSE = "GPLv2"

SRC_URI[md5sum] = "80b70cf716d7ccfc5e9b79a4fd014366"
SRC_URI[sha256sum] = "9b6b6a771c908adaadd078f4d128c00468ab49230d85b57658f04a0b9549e873"

SRCREV_default_pn-sota-updater="${AUTOREV}"

LIC_FILES_CHKSUM = "file://LICENSE;md5=2c1c00f9d3ed9e24fa69b932b7e7aff2"



DEPENDS = " jansson"

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
    git clone git@gitlab.com:aananthcn/sota-updater.git ${WORKDIR}/git
}

do_install() {
    install -d ${D}/${bindir}
    install -m 0544 ${S}/sotaupdater ${D}/${bindir}
}

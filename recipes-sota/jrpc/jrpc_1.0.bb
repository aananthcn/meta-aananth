# Copyright (C) 2015 Aananth Chellapa Natarajan <c.n.aananth@gmail.com>
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "JSON based RPC, the new Inter Process Communication Technology"
HOMEPAGE = "https://gitlab.com/aananthcn/jrpc"
LICENSE = "MPLv2"

SRC_URI[md5sum] = "815ca599c9df247a0c7f619bab123dad"
SRC_URI[sha256sum] = "9b6b6a771c908adaadd078f4d128c00468ab49230d85b57658f04a0b9549e873"

SRCREV_default_pn-sota-com="${AUTOREV}"

LIC_FILES_CHKSUM = "file://LICENSE;md5=21f4065b90218ec27fe59504be418b38"



DEPENDS = " jansson"
RDEPENDS_sota-com += " jansson"

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
    git clone git@gitlab.com:aananthcn/jrpc.git ${WORKDIR}/git
}

do_install() {
    install -d ${D}/${bindir}
    install -d ${D}/${libdir}
    install -m 0544 ${S}/bin/libjrpc.so ${D}/${libdir}
    install -m 0544 ${S}/bin/jrpcd ${D}/${bindir}
    install -m 0544 ${S}/bin/average ${D}/${bindir}
    install -m 0544 ${S}/bin/sum ${D}/${bindir}
}

# Copyright (C) 2015 Aananth Chellapa Natarajan <c.n.aananth@gmail.com>
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Linux Kernel schduling analysis utility"
HOMEPAGE = "https://gitlab.com/aananthcn/sched-test"
LICENSE = "MPLv2"

SRC_URI[md5sum] = "432c9b890cb570848c3d64f88e32507f"
SRC_URI[sha256sum] = "9b6b6a771c908adaadd078f4d128c00468ab49230d85b57658f04a0b9549e873"

SRCREV_default_pn-sota-com="${AUTOREV}"

LIC_FILES_CHKSUM = "file://README.md;md5=432c9b890cb570848c3d64f88e32507f"



DEPENDS = " "
RDEPENDS_sched-test += " bash "

S = "${WORKDIR}/git"

do_fetch() {
    git clone git@gitlab.com:aananthcn/sched-test.git ${WORKDIR}/git
}

do_install() {
    install -d ${D}/${bindir}
    install -m 0544 ${S}/sched_test ${D}/${bindir}
    install -m 0544 ${S}/sched_test.sh ${D}/${bindir}
}

SUMMARY = "Xdelta is an application program designed to compute changes between files.  These changes (deltas) are similar to the output of the "diff" program in that they may be used to store and transmit only the changes between files."

HOMEPAGE = "http://sourceforge.net/projects/xdelta/"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=8ca43cbc842c2336e835926c2166c28b"

SRC_URI = "git://anonscm.debian.org/users/lamont/xdelta.git \
           file://xdelta-1.1.3_ubuntu.patch \
"
SRCREV = "fb1484387b639e3fb102ecd3e0dec16e5a39e84e"

SRC_URI[md5sum] = "38933781c44a05db8b011cde8cd49471"
SRC_URI[sha256sum] = "5c320f2af2e225d4c7db6274e48a8d9deb43869624c6eed7203e08f58ad5920b"

#SRCREV_default_pn-xdelta="${AUTOREV}"
#SRCREV_default_pn-xdelta-native="${AUTOREV}"

DEPENDS += " glib-2.0"

S = "${WORKDIR}/git"

inherit autotools


do_compile() {

    make
}

BBCLASSEXTEND = "native"


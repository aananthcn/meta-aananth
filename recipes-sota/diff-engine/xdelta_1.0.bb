SUMMARY = "xdelta for Debian and Ubuntu"
HOMEPAGE = "http://anonscm.debian.org/cgit/users/lamont/xdelta.git"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=8ca43cbc842c2336e835926c2166c28b"

SRC_URI = "git://git.debian.org/~lamont/xdelta.git \
	   file://missing-PKG_PROG_PKG_CONFIG-definition.patch \
"

SRC_URI[md5sum] = "657ebdb60138598e1e4012c2b9c397e2"
SRC_URI[sha256sum] = "046a56a8ed8281479039ef6f26a7994eb7174842d5d542aba7c29274b81c97cd"

SRCREV_default_pn-xdelta="${AUTOREV}"
SRCREV_default_pn-xdelta-native="${AUTOREV}"

S = "${WORKDIR}/git"

inherit autotools

B = "${WORKDIR}/git"


BBCLASSEXTEND = "native"

DEPENDS = "glib-2.0"

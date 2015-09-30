SUMMARY = "open-source binary diff, differential compression tools, VCDIFF (RFC 3284) delta compression"
HOMEPAGE = "http://xdelta.org/"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=393a5ca445f6965873eca0259a17f833"

SRC_URI = "git://github.com/jmacd/xdelta-devel.git"

SRC_URI[md5sum] = "657ebdb60138598e1e4012c2b9c397e2"
SRC_URI[sha256sum] = "046a56a8ed8281479039ef6f26a7994eb7174842d5d542aba7c29274b81c97cd"

SRCREV_default_pn-xdelta1="${AUTOREV}"
SRCREV_default_pn-xdelta1-native="${AUTOREV}"

S = "${WORKDIR}/git/xdelta1"

inherit autotools

BBCLASSEXTEND = "native"

DEPENDS = "glib-2.0"


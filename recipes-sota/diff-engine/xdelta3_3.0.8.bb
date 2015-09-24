SUMMARY = "open-source binary diff, differential compression tools, VCDIFF (RFC 3284) delta compression"
HOMEPAGE = "http://xdelta.org/"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=393a5ca445f6965873eca0259a17f833"

SRC_URI = "https://github.com/jmacd/xdelta/blob/master/xdelta3/releases/xdelta3-3.0.8.tar.xz \
           file://compilation-fix.patch \
"


SRC_URI[md5sum] = "c3ae3286ce4193de8e03d5bcaccf3bc3"
SRC_URI[sha256sum] = "3a86f29c95664fb44b8a40ff22d9bcc3e87aa8c01f0ff75931a7fa78ed3d2e55"

SRCREV_default_pn-xdelta3="${AUTOREV}"
SRCREV_default_pn-xdelta3-native="${AUTOREV}"

#S = "${WORKDIR}/git/xdelta3"

inherit autotools

BBCLASSEXTEND = "native"


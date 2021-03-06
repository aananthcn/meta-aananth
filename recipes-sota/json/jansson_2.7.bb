SUMMARY = "Jansson is a C library for encoding, decoding and manipulating JSON data."
HOMEPAGE = "https://jansson.readthedocs.org/en/2.7/index.html"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=517b9b5519c82636e516e4969c5ce393"

SRC_URI = "http://www.digip.org/jansson/releases/jansson-2.7.tar.gz"

SRC_URI[md5sum] = "3a106a465bbb77637550b422f5b262ef"
SRC_URI[sha256sum] = "7905e6590fb316c0ff943df3dc6a21cd81a59cff7a6d12514054c359d04d78d7"

SRCREV_default_pn-jansson="${AUTOREV}"
SRCREV_default_pn-jansson-native="${AUTOREV}"

#S = "${WORKDIR}/git/xdelta3"

inherit autotools

BBCLASSEXTEND = "native"


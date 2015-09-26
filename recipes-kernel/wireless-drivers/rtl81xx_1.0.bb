# Copyright (C) 2015 Aananth Chellapa Natarajan <c.n.aananth@gmail.com>
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Driver for Belkin USB wireless dongle. Model - F9L1001v1"
HOMEPAGE = "https://github.com/dz0ny/rt8192cu"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://README.md;md5=606384b5e54e39d1c22df89e5de1b1e3"


SRC_URI = "git://github.com/dz0ny/rt8192cu.git \
           file://modules-build-compilation-error.patch \
"

SRC_URI[md5sum] = "5d5e8fbad6e3c72fc8bdb41d9333d94f"
SRC_URI[sha256sum] = "5a34b37fae763d4f04768b868e34f859f138cf8f2473ade31b8791c703176b79"

SRCREV_default_pn-rtl81xx="${AUTOREV}"

S = "${WORKDIR}/git"

inherit module

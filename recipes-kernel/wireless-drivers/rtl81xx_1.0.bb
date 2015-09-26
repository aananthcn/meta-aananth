# Copyright (C) 2015 Aananth Chellapa Natarajan <c.n.aananth@gmail.com>
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Driver for Belkin USB wireless dongle. Model - F9L1001v1"
HOMEPAGE = "https://github.com/chunkeey/rtl8192su"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://README.md;md5=681641caf5b8688dbf5521f66b4c4cfb"


SRC_URI = "git://github.com/chunkeey/rtl8192su.git"

SRC_URI[md5sum] = "5d5e8fbad6e3c72fc8bdb41d9333d94f"
SRC_URI[sha256sum] = "5a34b37fae763d4f04768b868e34f859f138cf8f2473ade31b8791c703176b79"

SRCREV_default_pn-rtl81xx="${AUTOREV}"

S = "${WORKDIR}/git"

inherit module

# Copyright (C) 2015 Aananth Chellapa Natarajan <c.n.aananth@gmail.com>
# Released under the MIT license (see COPYING.MIT for the terms)

# Base this image on core-image-minimal
include recipes-core/images/core-image-minimal.bb

# Include modules in rootfs
IMAGE_INSTALL += " \
        kernel-modules \
                "

SPLASH = "psplash-raspberrypi"

IMAGE_FEATURES += " ssh-server-dropbear splash"
IMAGE_INSTALL_append = " sota-com sota-updater xdelta3 usbutils iw connman wpa-supplicant wireless-tools"

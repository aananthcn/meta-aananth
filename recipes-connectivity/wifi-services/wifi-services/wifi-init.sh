#! /bin/sh

### give some time for connman to settle
sleep 30

### power on wifi chip
connmanctl enable wifi
connmanctl agent on
usleep 500000

### scan all access point 
#connmanctl scan wifi
#sleep 10

### connect to the desired access point
connmanctl connect wifi_08863b94943a_61647473686d61_managed_psk

#!/bin/bash
cd /home/pi/script/java/2world/
rm ./jar/*.class
javac -d ./jar/ ./src/*.java
jar cvf 2world.jar -C jar . >/dev/null
jar uvfm 2world.jar 2world.mani >/dev/null
echo "=========into jar file============"
jar tvf 2world.jar
echo "=================================="

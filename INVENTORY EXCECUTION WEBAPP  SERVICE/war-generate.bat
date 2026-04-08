#!/bin/bash
#Remove the existing war file and create the new one
rmdir /q /s target
echo "target dir removed"
mvnw package
echo "war file created"
exit
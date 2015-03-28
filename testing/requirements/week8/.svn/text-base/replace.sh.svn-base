#!/bin/bash
#Script by BOkumura LOLGG

echo "Replacing $1 with $2"
OLD=$1
NEW=$2
for f in *.html
do 
   sed -i "s/$OLD/$NEW/g" $f 
   echo "Modified: $f"
done
echo "Done"


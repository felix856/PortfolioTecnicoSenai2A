#!/bin/bash
valor=$(cut -d":" -f3 /etc/passwd)
numero_user=0
echo $valor
for i in $valor
do
	if [[ $i -gt 0 && $i -lt 999]]
	then
		numero_user=$((numero_user+1))
		echo $1
	fi
done


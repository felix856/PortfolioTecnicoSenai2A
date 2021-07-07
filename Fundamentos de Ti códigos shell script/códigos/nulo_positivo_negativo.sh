!#/bin/bash
$1 #primeiro argumento enviado pro script
if [$1 -lt 0 ]
then 
  echo "É negativo"
elif [ $1 -gt 0 ]
then 
echo "É positivo"
else 
echo "É nulo"
fi

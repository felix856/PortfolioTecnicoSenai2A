#!/bin/bash 
#coder name: Félix Francisco
#descrição: Modifique o exercicio anterior para aceitar apenas valores inteiros entre 1(inclusive) e N(inclusive). Sendo N > 0
echo  " Digite um numero maior que 0 "
read n
while [ $n -le 0 ]
do 
	echo  "Sua escolha é menor que 0 "
	echo " Digite um novo valor "
	read n
done
for n in $(seq 1 $n)
do 
	echo "$n"
	echo "$n é maior que 0 "
done




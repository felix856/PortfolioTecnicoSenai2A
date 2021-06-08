#!/bin/bash
#Namecoder:Félix Francisco
#Descrição:Código para saber se um numero é negativo ou positivo
   echo "Digite um valor:"
read x    

  if [ $x -ge 0 ] #se $x (numero digitado) for maior ou igual (-ge) a 0 

   then #então
	echo " O valor é positivo "  #imprima na tela o valor é positivo
   else 
	echo " O valor é negativo " #imprima na tela o valor é negativo
fi 

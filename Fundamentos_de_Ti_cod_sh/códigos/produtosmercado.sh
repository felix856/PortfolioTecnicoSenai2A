#!bin/bash
#Developer:Félix Francisco
#Descrição;Faça um algoritmo para ler o preço de 15 produtos, calcular e escrever o maior preço lido e a média aritmética dos preços dos produtos
clear
i=1
soma=0
maior=0
while [ $i -le 15 ]
  
  do
    echo " Escreva o preço do produto $i "
    read x
    if [ $x -gt $maior ]
      then
    maior=$x
    fi
    soma=$(($soma+$x))
    i=$(($i+1))
    done
  soma=$(bc <<< "scale=4; $soma / 15 " ) 
  echo " A média dos preços é $soma "
   echo " O produto mais caro é $maior "

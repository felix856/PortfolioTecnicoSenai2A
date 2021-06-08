#!/bin/bash 
echo " Digite seu ano de nascimento : "
read ano_nascimento
echo " Escreva o ano atual :"
read ano_atual

idade=$((ano_atual- ano_nascimento))
 
if [ $idade -le 15 ]

then 
	echo " Você não pode votar "
 
	
elif  [ $idade -le 17 ]
	
then 
	echo " Você pode votar "
else 
	echo " Você deve votar "
fi


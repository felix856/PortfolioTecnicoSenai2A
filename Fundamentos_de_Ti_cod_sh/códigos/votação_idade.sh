#!/bin/bash 
#Developer: Félix Francisco
#Ler o ano atual e o ano de nascimento de uma pessoa.Escrever uma mensagem que diga se ela poderá ou não votar este ano (não é necessário considerar o mês em que a pessoa nasceu). - ESTRUTURA DE SELEÇÃO
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


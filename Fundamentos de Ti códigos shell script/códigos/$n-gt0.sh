!#/bin/bash
#Developer:Félix Francisco
#Descrição:Ler um valor N e imprimir todos os valores inteiros entre 1 (inclusive) e N (inclusive). Considere que o N será sempre maior que ZERO.
    echo " Digite um numero "
read n
    while [ $n -gt 0 ]
 do
    echo "$n"
      n=$((n-1))
 done

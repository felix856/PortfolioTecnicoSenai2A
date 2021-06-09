#Developer:Félix Francisco
#descrição:1-Inicializar um vetor com 3 nomes de pessoa da sua escolha. Fazer um loop (utilizando for) para escrever para cada uma das pessoa “Oi, eu sou ____ !” .
#2 -Inicializar um vetor com 3 nomes de pessoa da sua escolha. Fazer um loop (utilizando while) para escrever para cada uma das pessoa “Oi, eu sou ____ !” 
nomes=( "joão" "Arthur" "cauã" )
echo "Oi meu nome é: ${nomes[@]}"
echo "O tamanho do seu vetor é : ${#nomes[@]}" 
echo " O conteudo da posição 1 : ${#nomes[0]}"
echo "------------------------------------------- "
 for i in ${nomes[@]}
    do 
    echo "O conteúdo é igual oi eu sou $i ! "
    done
    echo " ------------- "
    i=0
    while [  $i -lt ${#nomes[@]} ]
    do
      echo " o conteúdo na posição $i é Oi eu sou ${nomes[$i]} ! "
      i=$((i+1))
      
    done

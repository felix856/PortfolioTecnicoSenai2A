#Developer= Félix Francisco
#Descrição;Pedir para o usuário nomes de pessoas utilizando loop. Apenas parar de pedir a próxima pessoa quando o usuário digitar um caractere vazio. Colocar esses nomes de pessoas em um vetor e ao final dizer a quantidade de pessoas digitadas.
i=0
nome=" "
  echo "digite b para parar o loop "
  while [[ $nome !="b" ]]
  do
      echo "digite seu nome"
      read nome
      echo"seu nome é $nome , agora, aperte enter "
      vetor[$i]=$nome
      i=$((i+1))
      done
      tamanhov=$(({#vetor[@]} -1 ))
      echo "tamanho é : $tamanhov "
      
      
      
      
      
      
      
      

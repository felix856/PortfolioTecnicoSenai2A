#Developer: Félix Francisco
#Descrição : Comentário da lógica dos códigos realizados em sala
while.sh: # arquivo .sh criado
#!/bin/sh # iniciando o leitor de linguagem shell script
INPUT_STRING=”hello” #atribuindo valor hello da string 
while [ $INPUT_STRING != "bye" ] #enquanto a string for diferente de bye
do # faça
  echo "Please type something in (bye to quit) " #  mostre “ digite alguma coisa (como bye para sair)
   read INPUT_STRING #leia input_string que a pessoa digitar
  echo "You typed: $INPUT_STRING" #mostre “vc digitou a  $input_string
done #feito o código



while2.sh: # arquivo  .sh criado
#!/bin/sh / #iniciando o leitor de linguagem shell script
while read input_text #enquanto o programa lê a variavel input_text
do #faça
  case $input_text in # caso a variavel $input_text seja 
        hello)          echo English    ;; #hello, mostre Inglês
        howdy)          echo American   ;;#howdy , mostre Americano
        gday)           echo Australian ;; #gday , mostre 
Australiano
        bonjour)        echo French     ;; # bonjour , mostre Francês
        "guten tag")    echo German     ;;#guten tag, mostre Alemão
        *)              echo Unknown Language: $input_text #qualquer outra coisa mostre lingua desconhecida; mostra a variavel $input_text que foi digitada 
                ;;
   esac # acabou a condição do case
done ​< myfile.txt # feito o código redirecione o arquivo myfile.txt pra dentro de while.sh

myfile.txt: # arquivo de texto criado 
this file is called myfile.txt and we are using it as an example input. #arquivo criado para servir de exemplo de saudações
hello #Oi em ingles britanico
gday # Bom dia em Inglês Americano 
bonjou # Bom dia em Francês
hola #olá em espanhol










talk.sh: # arquivo .sh criado 
#!/bin/sh # iniciando o leitor de linguagem shell script

echo "Please talk to me ..." # mostre “please talk to me…”
while true # enquanto for verdade
do # faça
  read INPUT_STRING #leia  input_string que é o q a pessoa digitar
  case $INPUT_STRING in #caso oq a pessoa digitou for
	hello) # caso digitar “hello”
		echo "Hello yourself!" # mostre a mensagem “hello yourself! ”
		;; # separa um caso do outro 
	bye) #caso oq a pessoa digitou for
“bye”
		echo "See you again!" #mostre a mensagem “see you again!”
		break # comando que para o loop
		;;
	*) # Se digitou qualquer outra coisa que não foi nada das alternativas anteriores

		echo "Sorry, I don't understand" #mostre a mensagem “sorry, I don’t understand ”
		;;
  	   esac # fecha o case
done # código feito
echo #uma linha a mais um espaçamento 
echo "That's all folks!" # mostre a mensagem "That's all folks!"



pwrd.sh: # arquivo .sh criado
#!/bin/bash #iniciando o leitor de linguagem shell script
 

echo "Enter username" #mostre a mensagem  “Enter username’’
read username #leia a mensagem username
echo "Enter password" #mostre a mensagem “Enter password”  
read password #leia a mensagem password

if [[ $username == "admin" && $password == "secret" ]] #se a var $username é igual ao q foi digitado do “admin” e se a var $password é igual a $secret 
then # entt 
        echo "valid user" #mostre a mensagem “valid user”
else #se n
        echo "invalid user" #mostre a mensagem “invalid user”
fi # fim da condição if


 
replace.sh #arquivo .sh criado

#!/bin/bash #iniciando o leitor de linguagem shell script
Unix=('Debian' 'Red hat' 'Ubuntu' 'Suse' 'Fedora' 'UTS' 'OpenLinux'); #criando o vetor Unix com os valores ('Debian' 'Red hat' 'Ubuntu' 'Suse' 'Fedora' 'UTS' 'OpenLinux')

echo ${Unix[@]} # mostre os valores do vetor em sequência
echo '_____________' #mostre um espaço entre eles
echo ${Unix[@]/Ubuntu/SCO Unix} #Mostre todos os valores do vetor Unix e substitua com as “/” o ubuntu pelo SCOUnix

 
fatorial.sh #arquivo .sh criado
#!/bin/bash  #iniciando o leitor de linguagem shell script

read -p "Digite um numero:" num #digite um número e atribua esse valor a var num  

res=1 # atribui valor 1 a var res
i=0 # atribui valor 0 a var i
while [ $num -gt 0 ] #enquanto a variavel num for maior que 0  
do # faça
        res=$((res*num)) #res vezes a var num vai dar um resultado
        fatorial[$i]=$num # vai mostrar a var num
        i=$((i+1)) # i  vai ser a posição do vetor fatorial ao qual será acrescentado o código
        num=$((num-1)) #essa conta vai diminuir 1 ao valor de num 
done # irá fechar o código acima
echo ${fatorial[@]} #mostre os valores que foram atribuídos ao fatorial  

 
tabuada.sh #arquivo .sh criado
#!/bin/bash # iniciando o leitor de linguagem shell script

read -p "Digite um numero para ver sua tabuada: " x # leia a mensagem e o número que a pessoa digitar e atribua esse valor para x

for i in $(seq 1 10) #para i na sequência de 1 a 10
do # faça
        res[$i]=$(($x*$i)) # a var x será multiplicada por a var i 
done # feito o código
echo ${res[@]} # mostre o resultado das sequências de multiplicação pela variável $x 

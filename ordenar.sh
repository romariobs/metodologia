#! /bin/bash
clear

# --- Build
echo "Compilando arquivos"
javac -d ./out ./src/*/*/*.java


ALGORITHM=$1
INPUTFILE=$2
OUTPUTFILE=$3

PAR="parSort"
SEQ="seqSort"

echo $ALGORITHM

if [ -z $ALGORITHM ] 
then
	echo "Algoritmo deve ser informado. Escolha entre parSort e seqSort"
	exit
fi 

case $ALGORITHM in
	"parSort")
		echo "Opção escolhida foi o MergeSort Paralelo" ;
		# out/ is the binaries folder.
		java -cp out/ -Xmx2048m mergesort/sorting/ParSort ;;
	"seqSort")
		echo "Opção escolhida foi o MergeSort Sequencial" ;
		java -cp out/ -Xmx2048m mergesort/sorting/SeqSort ;;
	*) echo "Digite um algoritmo valido. Escolha entre parSort e seqSort." ;;
esac


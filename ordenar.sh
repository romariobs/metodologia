#! /bin/bash
clear

# --- Clean
#rm -rf ./bin/*

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
		java -cp out/ -Xmx2048m mergesort/sorting/ParSort $INPUTFILE $OUTPUTFILE ;;
	"seqSort")
		echo "Opção escolhida foi o MergeSort Sequencial" ;
		java -cp out/ -Xmx2048m mergesort/sorting/SeqSort $INPUTFILE $OUTPUTFILE ;;
	*) echo "Digite um algoritmo valido. Escolha entre parSort e seqSort." ;;
esac


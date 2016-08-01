#! /bin/bash

stdinArray="$(cat <&0)"
# --- Build
mkdir ./out &> /dev/null
javac -d ./out ./src/*/*/*.java


ALGORITHM=$1

PAR="parSort"
SEQ="seqSort"

if [ -z $ALGORITHM ] 
then
	echo "Algoritmo deve ser informado. Escolha entre parSort e seqSort"
	exit
fi 

case $ALGORITHM in
	"parSort")
		# out/ is the binaries folder.
		java -cp out/ -Xmx2048m mergesort/sorting/ParSort $stdinArray;;
	"seqSort")
		java -cp out/ -Xmx2048m mergesort/sorting/SeqSort $stdinArray;;
	*) echo "Algoritmo inválido. Escolha entre parSort e seqSort." ;;
esac


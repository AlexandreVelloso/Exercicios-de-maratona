#!/bin/bash

# Executa todos os casos de teste
for x in {1..83}
do
	python3 Solucao$2.py < "$2_boca"/"$2"_"$x".in > "$2_xande/$2_"$x".sol"
done

#for x in {1..83}
#do
	#time python3 Solucao$2.py < "$2_boca"/"$2"_"$x".in > "$2_xande/$2_"$x".sol"
#done

# compara se todos sao iguais
diff -wBqr $2"_boca/" $2"_xande/" | grep -v "Somente"

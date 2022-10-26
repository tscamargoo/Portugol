programa
{
	
	funcao inicio()
	{
		inteiro vetor [10] = {34,1,2,3,4,5,6,7,8,9}, numeroPar=0, numeroImpar
		 
			para(inteiro i = 0; i<10; i++){	
			
			escreva(vetor[i]," - ")
	
		
		}
		escreva("\n")
		escreva("\n Numeros Par")
		para(inteiro i = 0; i<10; i++){
			se(vetor[i]%2==0){
				numeroPar = vetor[i]
				escreva("\n",numeroPar)
				
			}
			
			
		}
		escreva("\n--------------------------------")
		escreva("\n Numeros Impar")
		para(inteiro i = 0; i<10; i++){
			se(vetor[i] % 2 >0){
				numeroImpar = vetor[i]
				escreva("\n",numeroImpar)
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 203; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
programa
{
	funcao inicio ()
	{
		inteiro i = 0
		inteiro j = 2
		inteiro soma = 0
		inteiro numeros[3][3] = {{1,2,3},{4,5,6},{7,8,9}}

		escreva("Lista de números diagonal principal : \n")
		enquanto(i < 3)
		{
			escreva(numeros[i][i]+" ,")
			soma = soma + numeros[i][i]
			i = i + 1
		}

		escreva("\nA soma de diagonal principal :"+ soma+ "\n")
		escreva("\nLista de números diagonal secundaria: \n")

		i=0
		soma = 0
		enquanto(j > -1)
		{
			escreva(numeros[i][j]+" ,")
			soma = soma + numeros[i][i]
			i = i + 1
			j = j - 1
		}

		escreva("\nA soma de diagonal principal :"+ soma+ "\n")
	}
}
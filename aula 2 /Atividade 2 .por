
    programa {
  funcao inicio() {

    inteiro codigoDoProduto, quantidade
    real precoUnitario, precoFinal

    escreva("Digite o c�digo do produto: ")
    leia(codigoDoProduto)

    escolha(codigoDoProduto)

    caso 1:
      precoUnitario = 10.0
      escreva("Quantos Cachorro Quente(s): ")
      leia(quantidade)
      precoFinal = (quantidade precoUnitario)
    pare

    caso 2:
      precoUnitario = 15.0
      escreva("Quantos X-salada(s): ")
      leia(quantidade)
      precoFinal = (quantidade * precoUnitario)
    pare

    caso 3:
      precoUnitario = 18.0
      escreva("Quantos X-bacon(s): ")
      leia(quantidade)
      precoFinal = (quantidade * precoUnitario)
    pare

    caso 4:
      precoUnitario = 12.0
      escreva("Quantos Bauru(s): ")
      leia(quantidade)
      precoFinal = (quantidade * precoUnitario)
    pare

    caso 5:
      precoUnitario = 8.0
      escreva("Quantos Refrigerante(s): ")
      leia(quantidade)
      precoFinal = (quantidade * precoUnitario)
    pare

    caso 6:
      precoUnitario = 13.0
      escreva("Quantos Suco(s) de laranja: ")
      leia(quantidade)
      precoFinal = (quantidade * precoUnitario)
    pare

    caso contrario
      escreva("Dado inv�lido")
  }

  escreva("Valor total do pedido: R$ ", precoFinal)

}
  }
}

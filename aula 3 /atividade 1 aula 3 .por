programa {
  funcao inicio() {
         inteiro num1, num2, cont = 1

        escreva("Digite um numero entre 1 e 10: ")
        leia(num1)

        se (num1 > 10)
           escreva("Digite um numero de 1 a 10: ")
          senao
        enquanto    (cont<11)
         {
          num2 = num1 * cont
          escreva("\n", num2)
          cont = cont + 1
  }
}

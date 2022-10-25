programa {
  funcao inicio() {
    real 	real salario, imposto 
    
    escreva ("Digite o salario: R$")
    leia(salario)

    se (salario >= 0 e salario <= 2000)
    escreva("Essa pessoa e isenta do imposto de renda. ")

    senao se (salario > 2000 e salario <= 3000)
    imposto = e (8/100) * salario 
    escreva ("Essa pessoa deve pagar R$" , imposto," de impoto de renda .")

    senao se (salario > 3000 e salario <= 4500)
    imposto = e (18/100) * salario 
    escreva ("Essa pessoa deve pagar R$" , imposto," de impoto de renda .")

    senao se (salario > 4500)
    imposto = e (28/100) * salario 
    escreva ("Essa pessoa deve pagar R$" , imposto," de impoto de renda .")
}

programa {
  funcao inicio() {
     inteiro idade 
    
    escreva ("Informe sua idade: ")
    leia(idade)

    se (idade >= 16 e idade < 18 ){
    escreva ("A pessoa esta Apta a votar eo voto e facultativo")
    
    senao se (idade >= 18 e idade < 65){
      escreva ("O voto e obrigat�rio")
      
      senao se ( idade >= 65){
        escreva ("A pessoa est� apta a votar eo voto � facultativo")
      }
      senao 
      escreva ("A pessoa n�o esta apta a votar")
  }
}

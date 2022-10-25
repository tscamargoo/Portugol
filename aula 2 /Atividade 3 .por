programa {
  funcao inicio() {
     inteiro idade 
    
    escreva ("Informe sua idade: ")
    leia(idade)

    se (idade >= 16 e idade < 18 ){
    escreva ("A pessoa esta Apta a votar eo voto e facultativo")
    
    senao se (idade >= 18 e idade < 65){
      escreva ("O voto e obrigatório")
      
      senao se ( idade >= 65){
        escreva ("A pessoa está apta a votar eo voto é facultativo")
      }
      senao 
      escreva ("A pessoa não esta apta a votar")
  }
}

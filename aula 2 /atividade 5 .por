programa {
  funcao inicio() {
    cadeia classe, reino, alimento
    escreva("digite a classe do animal ")
    leia (classe)
    escreva("digite o reino do animal  ")
    leia (reino )
    
    escreva("digite o alimento   ")
    leia (alimento  )
    se (classe == "vertebrado" e reino == "ave" e alimento == "carnivoro" )
     escreva ("aguia")
    senao se (classe == "vertebrado" e reino == "ave" e alimento == "onivoro" )
    escreva ("pomba")
    senao se (classe == "vertebrado" e reino == "mamifero " e alimento == "onivoro" )
    escreva ("homem")
     senao se (classe == "vertebrado" e reino == "mamifero " e alimento == "herbivoro" )
    escreva ("vaca")
    senao se (classe == "invertebrado" e reino == "inseto" e alimento == "hematofago" )
    escreva ("pulga")
    senao se (classe == "invertebrado" e reino == "inseto" e alimento == "herbivoro" )
    escreva ("lagarta ")
    senao se (classe == "invertebrado" e reino == "anelidio " e alimento == "hematofago" )
    escreva ("sanguessuga")
    senao se (classe == "invertebrado" e reino == "anelidio" e alimento == "onivoro" )
    escreva ("minhoca")
    senao escreva("ops algo deu errado ")
    
  }
}

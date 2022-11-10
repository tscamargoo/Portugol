public class testecliente {
    public static void main(String[] args) {

        cliente nome = new cliente("thiago","itapevi",24,"masculino",40028922);
        nome.vizualizar();

        cliente pessoa = new cliente("alysson","bahia",40,"masculino",47744378);
        pessoa.vizualizar();

        PessoaFisica moises = new PessoaFisica("moises","osasco",60,"Feminino",98756906,"48807856423");
        moises.vizualizar();

        PessoaFisica eduardo = new PessoaFisica("eduardo","brasilia",47,"Feminino",98756765,"48807858765");
        eduardo.vizualizar();

        Pessoajuridica  leo  = new Pessoajuridica ("leo","barueri",70,"masculino",978654321,"4456786433");
        leo.vizualizar();

        Pessoajuridica  Ruan  = new Pessoajuridica ("Ruam","minas",70,"feminino",978654654,"445678564");
        Ruan.vizualizar();

    }
}

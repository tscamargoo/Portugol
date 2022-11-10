public class PessoaFisica extends  cliente {

     private String cpf;

    public PessoaFisica(String nome, String cidade, int idade, String sexo, int telefone, String cpf) {
        super(nome, cidade, idade, sexo, telefone);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public void vizualizar() {
        super.vizualizar();
        System.out.println("cpf" + this.cpf);
        System.out.println("--------------------------------");
    }
}

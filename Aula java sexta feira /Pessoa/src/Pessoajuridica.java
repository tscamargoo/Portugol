public class Pessoajuridica extends  cliente{

    private  String cnpj;

    public Pessoajuridica(String nome, String cidade, int idade, String sexo, int telefone, String cnpj) {
        super(nome, cidade, idade, sexo, telefone);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpf(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public void vizualizar() {
        super.vizualizar();
        System.out.println("cnpj" + this.cnpj);
        System.out.println("--------------------------------");
    }
}

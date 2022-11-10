public class cliente {

    private  String nome;
    private  String    cidade;
    private  int    idade;
    private  String  sexo;
    private  int     telefone;

    public cliente(String nome, String cidade, int idade, String sexo, int telefone) {
        this.nome = nome;
        this.cidade = cidade;
        this.idade = idade;
        this.sexo = sexo;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    public void vizualizar () {
        System.out.println("nome da pessoa: " + this.nome);
        System.out.println("cidade da pessoa: " + this.cidade);
        System.out.println("idade da pessoa: " + this.idade);
        System.out.println("sexo da pessoa: "  + this.sexo);
        System.out.println("telefone da pessoa: " + this.telefone);
        System.out.println("--------------------------------");
    }
}

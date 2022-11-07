package exc01.model;

public class Cliente {
    private int id;
    private int idade;
    private String nome;
    private String cpf;
    private String cidade;

    public Cliente(int id, int idade, String nome, String cpf, String cidade) {
        this.id = id;
        this.idade = idade;
        this.nome = nome;
        this.cpf = cpf;
        this.cidade = cidade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void visualizar () {
        System.out.println("\n ********");
        System.out.println("Dados do Cliente: ");
        System.out.println("\n ********");
        System.out.println("\nID do Cliente: " + this.id);
        System.out.println("\nNome do Cliente: " + this.nome);
        System.out.println("\nNome do Cliente: " + this.idade);
        System.out.println("\nCPF do Cliente: " + this.cpf);
        System.out.println("\nCEP do Cliente: " + this.cidade);

    }

    }


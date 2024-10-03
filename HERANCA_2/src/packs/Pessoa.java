package packs;

public class Pessoa {
    // Declarando variáveis privadas
    private String nome;
    private String cpf;
    private String dataNascimento;

    // Construtor para inicializar as variáveis
    public Pessoa(String nome, String cpf, String dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    // Método para imprimir a data de nascimento no console
    public void imprimirDataNascimento() {
        System.out.println(this.dataNascimento);
    }
    public String toString() {
    	
    
    return "Nome: " + nome + ", CPF: " + cpf + ",DataNascimento: " + dataNascimento;
}
}

package packs;

public class Pessoa {
    // Declarando variaveis privadas
    private String nome;
    private String cpf;
    private String dataNasc;

    // Construtor para inicializar as variaveis
    public Pessoa(String nome, String cpf, String dataNasc) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
    }

    // chamando os getters
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    // chamando os setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    // Metodo para imprimir a data de nascimento no terminal
    public void imDataNascimento() {
        System.out.println(this.dataNasc);
    }
    public String toString() {
    //toString para chamar pro main
    return "Nome: " + nome + ", CPF: " + cpf + ",Data Nascimento: " + dataNasc;
}
}

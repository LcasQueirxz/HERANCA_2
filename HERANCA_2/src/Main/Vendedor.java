package Main;

public class Vendedor {
    // Declarando variáveis privadas
    private String nome;
    private String cpf;
    private String dataNascimento;
    private String dataContratacao;
    private double salarioBase;
    private double percentualComissao;

    // Construtor para inicializar as variáveis
    public Vendedor(String nome, String cpf, String dataNascimento, String dataContratacao, double salarioBase, double percentualComissao) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.dataContratacao = dataContratacao;
        this.salarioBase = salarioBase;
        this.percentualComissao = percentualComissao;
    }

    // chamando os getters
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getDataContratacao() {
        return dataContratacao;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }

    // chamando os setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setDataContratacao(String dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }
    public String toString() {
        return "Nome: " + nome + ", CPF: " + cpf + ",DataNascimento: " + dataNascimento + ", Data da Contratacao: " + dataContratacao + ", Salario Base:" + salarioBase + ", percentualComissao" + percentualComissao+"%";

}
}



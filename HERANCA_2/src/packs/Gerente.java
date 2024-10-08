package packs;

public class Gerente {
    // declarando variaveis privadas
    private String nome;
    private String cpf;
    private String dataNascimento;
    private String dataContratacao;
    private double salarioBase;
    private String departamento;

    // construtor para inicializar as variaveis
    public Gerente(String nome, String cpf, String dataNascimento, String dataContratacao, double salarioBase, String departamento) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.dataContratacao = dataContratacao;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
    }

    // chamando getters
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

    public String getDepartamento() {
        return departamento;
    }

    // chamando setters
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

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    //toString para mostrar dados do Gerente e chama-o para a main
public 	String toString() {
	return "Nome: " + nome + ", CPF: " + cpf + ",DataNascimento: " + dataNascimento + ", Data da Contratacao: " + dataContratacao + ", Salario Base:" + salarioBase + ", Departamento: " + departamento;


			
}
}


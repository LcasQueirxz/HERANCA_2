package packs; // define o pacote 'packs'

public class Cliente { // define a classe Cliente

	//variaveis privadas(dados pessoais)
    private String nome;
    private String cpf;
    private String dataNasc;
    private String email;
    private String numCartaoFidelidade;
    private String telefone;
//valores para as variaveis
    public Cliente(String nome, String cpf, String dataNasc, String email, String numCartaoFidelidade, String telefone) { // construtor da classe Cliente
        this.nome = nome;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
        this.email = email;
        this.numCartaoFidelidade = numCartaoFidelidade;
        this.telefone = telefone;
    }

    // chamando getters e setters
    public String getNome() 
    { return nome; }
    public void setNome(String nome) 
    { this.nome = nome; }

    public String getCpf() 
    { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public String getDataNasc() 
    { return dataNasc; }
    public void setDataNasc(String dataNasc) { this.dataNasc = dataNasc; }

    public String getEmail() 
    { return email; }
    public void setEmail(String email) 
    { this.email = email; }

    public String getNumeroCartaoFidelidade() 
    { return numCartaoFidelidade; }
    public void setNumeroCartaoFidelidade(String numCartaoFidelidade) { this.numCartaoFidelidade = numCartaoFidelidade; }

    public String getTelefone()
    { return telefone; }
    public void setTelefone(String telefone)
    { this.telefone = telefone; }
    
    public String toString() { // metodo toString para exibir os detalhes do objeto Cliente e chamar pora main
        return "Nome: " + nome + ", CPF: " + cpf + ",DataNascimento: " + dataNasc + ",Email:" + email + ",Numero do cartao Fidelidade:" + numCartaoFidelidade + ", Telefone:" + telefone;
    }

} 

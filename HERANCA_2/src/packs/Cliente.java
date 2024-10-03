package packs;

public class Cliente {
    private String nome;
    private String cpf;
    private String dataNascimento;
    private String email;
    private String numeroCartaoFidelidade;
    private String telefone;

    public Cliente(String nome, String cpf, String dataNascimento, String email, String numeroCartaoFidelidade, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.numeroCartaoFidelidade = numeroCartaoFidelidade;
        this.telefone = telefone;
    }

    // Getters e Setters
    public String getNome() 
    { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getCpf() 
    { return cpf; }
    public void setCpf(String cpf)
    { this.cpf = cpf; }

    public String getDataNascimento() 
    { return dataNascimento; }
    public void setDataNascimento(String dataNascimento) { this.dataNascimento = dataNascimento; }

    public String getEmail() 
    { return email; }
    public void setEmail(String email) 
    { this.email = email; }

    public String getNumeroCartaoFidelidade() 
    { return numeroCartaoFidelidade; }
    public void setNumeroCartaoFidelidade(String numeroCartaoFidelidade)
    { this.numeroCartaoFidelidade = numeroCartaoFidelidade; }

    public String getTelefone() 
    { return telefone; }
    public void setTelefone(String telefone) 
    { this.telefone = telefone; }
    
    public 	String toString() {
    	return "Nome: " + nome + ", CPF: " + cpf + ",DataNascimento: " + dataNascimento + ",Email:" + email + ",Numero do cartao Fidelidade:" + numeroCartaoFidelidade + ", Telefone:" + telefone;
    	
}
}
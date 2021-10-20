package PrimeiroProjeto;

public class Modelo {
    private int id;
    private String nome;
    private String email;
    private String telefone;
    private String senha;


    public Modelo(int id, String nome, String email, String telefone, String senha){
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.senha = senha;
    }

    public Modelo(){}


    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id = id;
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public String getTelefone(){
        return this.telefone;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public String getSenha(){
        return this.senha;
    }
    public void setSenha(String senha){
        this.senha = senha;
    }


}

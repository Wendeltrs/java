package PrimeiroProjeto;

public class Controler extends Modelo{
    public Controler(int id,String nome,String email,String telefone,String senha){
        super(id, nome, email, telefone, senha);
    }

    public Controler(){}


    public String toString(){
        return "Id: " + super.getId() + 
                "\nNome: " + super.getNome() +
                "\nEmail: " + super.getEmail() +
                "\nTelefone: " + super.getTelefone() +
                "\nSenha: " + super.getSenha();
    }
    
    
}
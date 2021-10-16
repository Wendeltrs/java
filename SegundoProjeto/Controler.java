package SegundoProjeto;

public class Controler extends Modelo{
    public Controler(int id,String nome,String email){
        super(id, nome, email);
    }

    public Controler(){}


    public String toString(){
        return "Id: " + super.getId() + 
                "\nNome: " + super.getNome() +
                "\nEmail: " + super.getEmail();
    }
    
}
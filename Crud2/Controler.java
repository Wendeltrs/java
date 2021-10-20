public class Controler extends Modelo{
    public Controler(int id, String nome, String email){
        super(id, nome, email);
    }

    public Controler(){
    	super();
    }

    
    public void imprimir(){
        System.out.print("\n\nId: " + getId() + "\nNome: " + getNome() + "\nEmail: " + getEmail());
    }
}
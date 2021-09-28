package Zoologico;

public class Peixe extends Animal{
    private String caracteristica;


    public String getCarac(){
        return caracteristica;
    }
    public void setCarac(String carac){
        this.caracteristica = carac;
    }


    public Peixe(){
        super.setNumPatas(0);
        super.setCor("Cinzenta");
        super.setAmbiente("Mar");
        this.caracteristica = "Barbatanas e Cauda";
    }


    public String toString(){
        return super.toString() + "\n" + "Caracteristicas: " + this.caracteristica;
                
    }


}

package Zoologico;

public class Mamifero extends Animal {
    private String alimento;


    public String getAlimento(){
        return this.alimento;
    }
    public void setAlimento(String alimento){
        this.alimento = alimento;
    }


    public Mamifero(){
        super.setAmbiente("Terra");
        if(super.getNome() == "Urso"){
            super.setCor("Castanho");
        }
    }


    public String toString(){
        if(super.getNome() == "Urso"){
            this.alimento = "Mel";
        }
        return  super.toString() + "\n" + "Alimento: " + this.alimento;
    }


}
package Imposto;

public abstract class Contribuintes {
    private String nomeContrib;
    private double rendaBruta;

    
    public String getNomeContrib() {
        return nomeContrib;
    }
    public void setNomeContrib(String nomeContrib) {
        this.nomeContrib = nomeContrib;
    }

    public double getRendaBruta() {
        return rendaBruta;
    }
    public void setRendaBruta(double rendaBruta) {
        this.rendaBruta = rendaBruta;
    }


    public String toString(){
        return "Nome do Contrinuite: " + this.nomeContrib +
                "\nRenda Bruta: " + this.rendaBruta;
    }


    public abstract double calcularImposto();
    
}

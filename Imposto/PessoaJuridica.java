package Imposto;

public class PessoaJuridica extends Contribuintes{


    public double calcularImposto(){
        double aliquota = 0.10;
        return super.getRendaBruta() * aliquota;
    }
    

    public String toString(){
        return "Imposto: " + calcularImposto() + "\n" + super.toString(); 
    }
    
}

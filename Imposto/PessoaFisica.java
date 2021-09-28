package LoianeEx2;

public class PessoaFisica extends Contribuintes{
    public double calcularImposto(){
        double aliquota;
        double parcelaDeduzir;


        if(super.getRendaBruta() <= 1400){
            return 0;
        }else if(super.getRendaBruta() <= 2100){
            aliquota = 0.10;
            parcelaDeduzir = 100;
            return (super.getRendaBruta() * aliquota) - parcelaDeduzir;
        }else if(super.getRendaBruta() <= 2800){
            aliquota = 0.15;
            parcelaDeduzir = 270;
            return (super.getRendaBruta() * aliquota) - parcelaDeduzir;
        }else if(super.getRendaBruta() <= 3600){
            aliquota = 0.25;
            parcelaDeduzir = 500;
            return (super.getRendaBruta() * aliquota) - parcelaDeduzir;
        }else{
            aliquota = 0.30;
            parcelaDeduzir = 700;
            return (super.getRendaBruta() * aliquota) - parcelaDeduzir;
        }
        
    }

    
    public String toString(){
        return "Imposto: " + calcularImposto() + "\n" + super.toString();
    }

    

    
}

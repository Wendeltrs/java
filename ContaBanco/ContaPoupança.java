package LoianeEx1;

import java.util.Calendar;

public class ContaPoupança extends ContaBancaria {   
    private int diaRendimento;
    final double taxa = 0.0037;


    public int getDiaRendimento(){
        return diaRendimento;
    }
    public void setDiaRendimento(int diaRendimento){
        this.diaRendimento = diaRendimento;
    }

    public ContaPoupança(String nomeCliente, int numConta){
        super(nomeCliente, numConta);
    }

    
    public String toString(){
        return "\nDia de Rendimento: " + this.diaRendimento  + super.toString() ;
    }

    
    public boolean calcularNovoSaldo(){
        Calendar hoje = Calendar.getInstance();
        if(diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)){
            super.setSaldo(super.getSaldo() + (super.getSaldo()*taxa)); 
            return true;
        }
        return false;
    }


}

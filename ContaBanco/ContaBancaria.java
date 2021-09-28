package LoianeEx1;

public abstract class ContaBancaria {
    private String nomeCliente;
    private int numConta;
    private double saldo;


    public ContaBancaria(String nomeCliente, int numConta){
        this.nomeCliente = nomeCliente;
        this.numConta = numConta;
    }


    public String getNomeCliente(){
        return this.nomeCliente;
    }
    public void setNomeCliente(String nomeCliente){
        this.nomeCliente = nomeCliente;
    }

    public int getNumConta(){
        return this.numConta;
    }
    public void setNumConta(int numConta){
        this.numConta = numConta;
    }

    public double getSaldo(){
        return this.saldo; 
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

  
    public boolean sacar(double sacar){
        if (sacar <= getSaldo()){
            setSaldo(getSaldo() - sacar);
            return true;
        }
        return false;
    }

    public void depositar(double depositar){
        setSaldo(getSaldo() + depositar);
    }

    
    public String toString(){
        return "\nNome do Cliente: " + this.nomeCliente +
                "\nNúmero da Conta: " + this.numConta +
                "\nSeu saldo é de: " + this.saldo;
    }
}

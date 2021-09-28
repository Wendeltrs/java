package ContaBanco;

public class ContaEspecial extends ContaBancaria{
    private int limite;


    public int getLimite(){
        return this.limite;
    }
    public void setLimite(int limite){
        this.limite = limite;
    }


    public ContaEspecial(String nomeCliente, int numConta){
        super(nomeCliente, numConta);
    }


    public boolean sacar(double sacar){
        if(sacar <= this.limite){ 
            setSaldo(getSaldo() - sacar);
            return true;
        }
        return false;
    }


    public String toString(){
        return "Limite de Saque: " + this.limite + super.toString();
    }



}

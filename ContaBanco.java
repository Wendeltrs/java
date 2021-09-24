package Conta;


public class ContaBanco {
    public int numConta;
    protected String tipoConta;
    private String dono;
    private float saldo;
    private boolean status;


    
    public ContaBanco(){
        setStatus(false);
        setSaldo(0);
    }

    public int getnumConta(){
        return this.numConta;
    }
    public void setnumConta(int numConta){
        this.numConta = numConta;
        System.out.println("Conta criada com sucesso!");
    }

    public String getDono(){
        return this.dono;
    }
    public void setDono(String dono){
        this.dono = dono;
    }

    public boolean isStatus(){
        return this.status;
    }
    public void setStatus(boolean status){
        this.status = status;
    }

    public float getSaldo(){
        return this.saldo;
    }
    public void setSaldo(float saldo){
        this.saldo = saldo;
    }

    public String getTipoConta() {
        return tipoConta;
    }
    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }


    public void abrirConta(String tipoConta){
        this.setStatus(true);
        this.setTipoConta(tipoConta);
        if(tipoConta == "cc"){
            this.setSaldo(50); 
            System.out.printf("%s,sua conta corrente foi aberta com sucesso!",getDono());
        }else{
            this.setSaldo(150);
            System.out.printf("%s, sua conta poupança foi aberta com sucesso!",getDono());
        }

    }


    public void fecharConta(){
        if(this.getSaldo() > 0 || this.getSaldo() < 0){
            System.out.println("A conta não pode ser fechada!!");
        }else{
            setStatus(false);
            System.out.println("\nFechamento de conta realizado com sucesso!!");
        }
    }


    public void depositar(float depositar){
        if(this.isStatus() == true){
            this.setSaldo(this.getSaldo() + depositar); // this.saldo += depositar;
            System.out.println("\nDepósito concluído!");
            System.out.printf("O saldo da conta é: R$%.2f",getSaldo());
        }else{
            System.out.println("Impossível depositar, conta inexistente!");
        }
    }


    public void sacar(float sacar){
        if(this.isStatus() == true){
            if(sacar > this.getSaldo()){
                System.out.println("\nO saque não pode ser realizado!");
                System.out.println("Dinheiro insuficiente!");
            }else{
                this.setSaldo(this.getSaldo() - sacar); // this.saldo -= sacar;
                System.out.println("\nSaque concluído!");
                System.out.printf("O saldo da conta é: R$%.2f",getSaldo());
            }
        }else{
            System.out.println("Impossível sacar, conta inexistente!");
        }
    }
   

    public void pagarMensal(){
        float mensalidade = 0;
        if(this.isStatus() == true){
            if(this.getTipoConta() == "cc" && this.getSaldo() > mensalidade){
                mensalidade = 12;
                this.setSaldo(this.getSaldo() - mensalidade); //this.saldo -= mensalidade;
                System.out.printf("\nA mensalidade de R$%.2f, foi paga com sucesso!",mensalidade);
                System.out.printf("\nO saldo da conta é: R$%.2f",getSaldo());
            }
            if(this.getTipoConta() == "cp" && this.getSaldo() > mensalidade){
                mensalidade = 20;
                this.setSaldo(this.getSaldo() - mensalidade); //this.saldo -= mensalidade;
                System.out.printf("\nA mensalidade de R$%.2f, foi paga com sucesso!",mensalidade);
                System.out.printf("\nO saldo da conta é: R$%.2f",getSaldo());
            }
        }else{
            System.out.println("Impossível pagar a mensalidade, conta inexistente");
        }
    }


}

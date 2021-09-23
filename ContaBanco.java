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
        return numConta;
    }
    public void setnumConta(int numConta){
        this.numConta = numConta;
        System.out.println("Conta criada com sucesso!");
    }

    public String getDono(){
        return dono;
    }
    public void setDono(String dono){
        this.dono = dono;
    }

    public boolean isStatus(){
        return status;
    }
    public void setStatus(boolean status){
        this.status = status;
    }

    public float getSaldo(){
        return saldo;
    }
    public void setSaldo(float saldo){
        this.saldo = saldo;
    }


    public void abrirConta(String tipoConta){
        this.status = true;
         this.tipoConta = tipoConta;
         if(tipoConta == "cc"){
             this.saldo = 50;
             System.out.printf("%s,sua conta corrente foi aberta com sucesso!",getDono());
         }else{
             this.saldo = 150;
             System.out.printf("%s, sua conta poupança foi aberta com sucesso!",getDono());
         }

    }


    public void fecharConta(){
        if(this.saldo > 0 || this.saldo < 0){
            System.out.println("\nA conta não pode ser fechada!!");
        }else{
            setStatus(false);
            System.out.println("\nFechamento de conta realizado com sucesso!!");
        }
    }


    public void depositar(float depositar){
        if(this.status = true){
            this.saldo += depositar;
            System.out.println("Depósito concluído!");
            System.out.printf("O saldo da conta é: R$%.2f",getSaldo());
        }
    }


    public void sacar(float sacar){
        if(this.status = true){
            if(sacar > this.saldo){
                System.out.println("\nO saque não pode ser realizado!");
                System.out.println("Dinheiro insuficiente!");
            }else{
                this.saldo -= sacar;
                System.out.println("\nSaque concluído!");
                System.out.printf("O saldo da conta é: R$%.2f",getSaldo());
            }
        }
    }


    public void pagarMensal(){
        float mensalidade = 0;
        if(this.status = true){
            if(this.tipoConta == "cc" && this.saldo > mensalidade){
                mensalidade = 12;
                this.saldo -= mensalidade;
                System.out.printf("\nA mensalidade de R$%.2f, foi paga com sucesso!",mensalidade);
                System.out.printf("\nO saldo da conta é: R$%.2f",getSaldo());
            }
            if(this.tipoConta == "cp" && this.saldo > mensalidade){
                mensalidade = 20;
                this.saldo -= mensalidade;
                System.out.printf("\nA mensalidade de R$%.2f, foi paga com sucesso!",mensalidade);
                System.out.printf("\nO saldo da conta é: R$%.2f",getSaldo());
            }
        }
    }


}

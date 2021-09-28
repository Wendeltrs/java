package LoianeEx1;

public class PrincipalEx1 {
    public static void main(String[]args){
        ContaPoupança cp = new ContaPoupança("Wendel",123456);

        cp.setDiaRendimento(28);

        realizarDeposito(cp, 1000);

        calcularRendimento(cp);

        realizarSaque(cp, 500);
        realizarSaque(cp, 100);
        
        System.out.println("\n" + cp.toString());


        System.out.println("\n\n");


        ContaEspecial ce = new ContaEspecial("Gabriella", 987654);

        ce.setLimite(700);

        realizarDeposito(ce, 1000);

        realizarSaque(ce, 1100);

        System.out.println("\n" + ce.toString());
    }


    public static void realizarDeposito(ContaBancaria conta, double valor){        
        conta.depositar(valor);
        System.out.println("\nDeposito realizado com sucesso!");
        System.out.printf("%s, você depositou: R$%.2f",conta.getNomeCliente(),valor);
        System.out.printf("\nSaldo total: R$%.2f", conta.getSaldo());
    }


    public static void realizarSaque(ContaBancaria conta, double valor){
        if(conta.sacar(valor)){
            System.out.println("\nSaque realizado com sucesso!");
            System.out.printf("%s, você sacou: R$%.2f",conta.getNomeCliente(),valor);
            System.out.printf("\nSaldo total: R$%.2f", conta.getSaldo());
        }else{
            System.out.println("\nNão foi possível realizar o saque!");
            System.out.println("Dinheiro insuficiente ou Limite Ultrapassado!");
        }
    }

    public static void calcularRendimento(ContaPoupança cp){
        if(cp.calcularNovoSaldo()){
            System.out.printf("\nHoje é %s, o seu saldo foi atualizado com sucesso!", cp.getDiaRendimento());
            System.out.printf("\nO saldo rendeu: R$%.2f",cp.getSaldo()*cp.taxa);
            System.out.printf("\nO novo saldo é de: R$%.2f", cp.getSaldo());
        }else{
            System.out.println("\nHoje não é o dia de rendimento!");
        }
    }

    
}

package PrimeiroProjeto;

import java.util.Scanner;

public class Exe {
    public static void main(String[] args) throws Exception{
        Scanner scan = new Scanner(System.in);
        Visao vs = new Visao();
        int escolha = 0;

        while(escolha != 5){
            System.out.println("\nEscolha a ação:");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Deletar");
            System.out.println("3 - Atualizar");
            System.out.println("4 - Listar");
            System.out.println("5 - Sair");

            escolha = scan.nextInt();

            if(escolha >= 1 && escolha <= 5){
                switch(escolha){
                    case 1:
                    vs.inserirCadastro();
                    break;
                    case 2:
                    vs.deletarCadastro();
                    break;
                    case 3:
                    vs.atualizarCadastro();
                    break;
                    case 4:
                    vs.consultarCadastro();
                    break;
                    default:
                    break;            
                }
            }
        }

        scan.close();


    }
}
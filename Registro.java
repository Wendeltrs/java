import java.util.Scanner;
public class Registro {
    public static void main(String[]args){
        Brinquedo brinquedo[] = new Brinquedo(40);
        Scanner minip = new Scanner(System.in);
        int i;
        int cod;
        int cont_b; 
        int op;
        int cod_aux;
        float lucro;
        float perc;
        int achou;
        cont_b = 1;
        do{
            System.out.println("1 - Cadastrar Brinquedo");
            System.out.println("2 - Mostrar Lucro");
            System.out.println("3 - Mostrar Produtos com Estoque Abaixo do Estoque Mínimo");
            System.out.println("4 - Finalizar");
            System.out.println("Digite uma opção: ");
            op = minip.nextInt();
            switch(op){
                case 1:
                if(cont_b > 40){
                    System.out.println("Já foram cadastrados os 40 brimquedos!");
                }else{
                    System.out.println("Digite um código: ");
                    cod_aux = minip.nextInt();
                    i = 1;
                    while(i < cont_b && brinquedo[i].cod != cod_aux){
                        i += 1;
                    }
                    if(i < cont_b){
                        System.out.println("Já existe brinquedo com esse código!");
                    }else{
                        brinquedo[cont_b].cod = cod_aux;
                        brinquedo[cont_b].descr = minip.next();
                        brinquedo[cont_b].qtd_est = minip.nextInt();
                        brinquedo[cont_b].est_min = minip.nextInt();
                        brinquedo[cont_b].p_compra = minip.nextFloat();
                        brinquedo[cont_b].p_venda = minip.nextFloat();
                        cont_b += 1;
                        System.out.println("Brinquedo cadastrado com sucesso!");               
                    }
                }
                break;
                case 2:
                System.out.println("Digite um código: ");
                cod_aux = minip.nextInt();
                i = 1;
                while(i < cont_b && brinquedo[i].cod != cod_aux){
                    i += 1;
                }
                if(i < cont_b){
                    lucro = brinquedo[i].p_venda - brinquedo[i].p_compra;
                    perc = lucro / (brinquedo[i].p_compra)*100;
                    System.out.printf("O lucro foi de: R$%.2f"+lucro);
                    System.out.printf("O percentual de lucro foi de: %f%"+perc);
                }else{
                    System.out.println("Brinquedo não cadastrado!");
                }
                break;
                case 3:
                achou = 0;
                for(i = 1; i == cont_b; i++){
                    if(brinquedo[i]).qtd_est < brinquedo[i].est_min){
                        achou = 1;
                        System.out.print(brinquedo[i].cod);
                        System.out.print(brinquedo[i].qtd_est);
                        System.out.print(brinquedo[i].est_min);
                        System.out.print(brinquedo[i].descr);                        
                    }
                }
                if(achou == 0){
                    System.out.println("Nenhum brinquedo está com estoque abaixo do estoque mínimo!");
                }
                break;
            }
        }while(op == 4);
        minip.close();
    }
    public static class Brinquedo{
        int cod;
        int qtd_est;
        int est_min;
        float p_compra;
        float p_venda;
        String descr;
    }
}

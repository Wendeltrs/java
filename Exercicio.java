import java.util.Scanner;
public class Exercicio {
    public static void main(String[] args) {
        Scanner ex = new Scanner(System.in);
        double notas = 0;
        double media = 0;
        double count = 0;
        double soma = 0;
        for(int x = 1; x <= 3; x ++){
            System.out.print("Digite o valor da "+x+"ª nota:\n");
            notas = ex.nextDouble();
            soma += notas;
            count ++;
        }
        media = soma/count;
        System.out.print("A média é: "+media+"\n") ;
        if(media >= 8 && media <= 10){
            System.out.print("Conceito A");
        }else if(media >= 7 && media < 8){
            System.out.print("Conceito B");
        }else if(media >= 6 && media < 7){
            System.out.print("Conceito C");
        }else if(media >= 5 && media < 6){
            System.out.print("Conceito D");
        }else{
            System.out.print("Conceito E");
        }
        ex.close();
    }
}

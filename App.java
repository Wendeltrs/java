package app;
import java.util.Scanner;
public class App{
    public static void main(String[]args){
        Scanner teste = new Scanner(System.in);

        Double nota1 = 0.0;
        Double nota2 = 0.0;
        Double nota3 = 0.0;
        String letra = "";
        Double m = 0.0;

        System.out.println("Digite o valor da nota 1: ");
        nota1 = teste.nextDouble();

        System.out.println("Digite o valor da nota 2: ");
        nota2 = teste.nextDouble();

        System.out.println("Digite o valor da nota 3: ");
        nota3 = teste.nextDouble();

        do{

            System.out.println("Digite uma letra: ");
            letra = teste.next();
            System.out.println(letra);
            m = calcularMedia(nota1,nota2,nota3,letra);

            if(letra.equals("A")){
                System.out.println("A média aritmética é: "+m);
                break;
            }else{
                System.out.println("A média ponderada é: "+m);
                break;
            }

        }while(letra.equals("A") || letra.equals("P"));

        teste.close();
    }

    public static Double calcularMedia(double n1, double n2, double n3, String l){      
        Double media = 0.0;

        if(l.equals("A")){
            media = (n1 + n2 + n3)/3;
        }else{
            media = (n1*5 + n2*3 + n3*2)/10;
        }

        return media;
    }

}   

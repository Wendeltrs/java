package Zoologico;

import java.util.ArrayList;
public class PrincipalEx3 {
    public static void main(String[]args){
        Mamifero mf = new Mamifero();

        mf.setAlimento("Cenoura");
        mf.setNome("Camelo");
        mf.setComprimento(150);
        mf.setCor("Amarelo");
        mf.setVelocidade(2.0);


        System.out.println("\n\n");


        Peixe px = new Peixe();

        px.setNome("Tubarão");
        px.setComprimento(300);
        px.setVelocidade(1.5);


        System.out.println("\n\n");


        Mamifero mf1 = new Mamifero();

        mf1.setNome("Urso");
        mf1.setComprimento(180);
        mf1.setCor("Vermalho");
        mf1.setVelocidade(0.5);
        

        ArrayList<Animal> array = new ArrayList<>();

        array.add(mf);
        array.add(px);
        array.add(mf1);

        for(Animal animal : array){
            System.out.println("\n" + animal.toString());
        }



    }
}

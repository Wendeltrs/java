package LoianeEx2;
import java.util.ArrayList;
public class PrincipalEx2 {
    public static void main(String[]args){
        PessoaJuridica pj = new PessoaJuridica();

        pj.setNomeContrib("Gabirella"); 
        pj.setRendaBruta(200); 
        statusImpostoPJ(pj);


        System.out.println("\n\n");


        PessoaFisica pf = new PessoaFisica();

        pf.setNomeContrib("Wendel"); 
        pf.setRendaBruta(5000);
        statusImpostoPF(pf);

        System.out.println("\n\n");
        ArrayList<Contribuintes> array = new ArrayList<>();

        /*int idA = 1;
        int idB = 2;
        int idC = 3;
        array.add(idA);
        array.add(idB);
        array.add(idC);

        for(int id : array){
            System.out.println(id);
        }
        
        int qid = array.get(0);
        System.out.println(qid);

        int qid1 = array.set(1, 10);
        System.out.println(qid1);

        array.forEach(id -> {
            System.out.println(id);
        });*/


        array.add(pf);
        array.add(pj);

        for(Contribuintes c : array){
            System.out.println("\n" + c.toString());
        }
        



    }


    public static void statusImpostoPF(PessoaFisica pf){
        if(pf.getRendaBruta() <= 1400){
            System.out.printf("%s, você é isento de pagar imposto!",pf.getNomeContrib());
        }else if(pf.getRendaBruta() <= 2100){
            System.out.printf("%s, o seu imposto é de: R$%.2f",pf.getNomeContrib(),pf.calcularImposto());
        }else if(pf.getRendaBruta() <= 2800){
            System.out.printf("%s, o seu imposto é de: R$%.2f",pf.getNomeContrib(),pf.calcularImposto());
        }else if(pf.getRendaBruta() <= 3600){
            System.out.printf("%s, o seu imposto é de: R$%.2f",pf.getNomeContrib(),pf.calcularImposto());
        }else{
            System.out.printf("%s, o seu imposto é de: R$%.2f",pf.getNomeContrib(),pf.calcularImposto());
        }
    }


    public static void statusImpostoPJ(PessoaJuridica pj){
        System.out.printf("%s, o seu imposto é de: R$%.2f ",pj.getNomeContrib(),pj.calcularImposto());
    }
}

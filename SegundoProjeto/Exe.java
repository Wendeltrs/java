package SegundoProjeto;

public class Exe{
    public static void main(String[] args) throws RuntimeException{
        DAO2 dao2 = new DAO2();

        String sql = "INSERT INTO modelo (id,nome,email) VALUES (?,?,?)";

        dao2.incluir(sql, 1,"Wendel","wendel@1234");
        dao2.incluir(sql, 2,"Gabriella","gabi@1234");
        dao2.incluir(sql, 3,"Irania","irania@1234"); 

        
        /*String sql1 = "UPDATE modelo SET nome = ?, email = ? WHERE id = ?";

        dao2.update(sql1, "Giovanna","giovanna@1234",1);


        String sql2 = "DELETE FROM modelo WHERE id = ?";

        dao2.delete(sql2, 2);


        String sql3 = "SELECT*FROM modelo"; //WHERE id = ?

        for(Controler c : dao2.select(sql3)){
            System.out.printf(c.toString());
        }*/


        dao2.close();


    }
}
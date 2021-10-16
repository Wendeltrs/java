package PrimeiroProjeto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class DAO extends Modelo{
    public void insert(int id,String nome,String email,String telefone,String senha){
        String sql = "INSERT INTO modelo (id,nome,email,telefone,senha) VALUES (?,?,?,?,?)";

        Connection conn = null;
        PreparedStatement stmt = null;
        Conexao conexao = new Conexao();

        try {
            conn = conexao.createConnectionToMysql();
            stmt = conn.prepareStatement(sql);

            stmt.setInt(1, id);
            stmt.setString(2, nome);
            stmt.setString(3, email);
            stmt.setString(4, telefone);
            stmt.setString(5, senha);

            stmt.execute();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try{
                if(stmt != null)
                    stmt.close();
                if(conn != null)
                    conn.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        }


    } 


    public void delete(int id){
        String sql = "DELETE FROM modelo WHERE id = ?";

        Connection conn = null;
        PreparedStatement stmt = null;
        Conexao conexao = new Conexao();

        try {
            conn = conexao.createConnectionToMysql();
            stmt = conn.prepareStatement(sql);

            stmt.setInt(1, id);

            stmt.execute();
            conn.close();              
        } catch (Exception e) {
            System.out.println("Não foi possível deletar o campo!");
        }finally{
            try {
                if(stmt != null)
                    stmt.close();
                if(conn != null)
                    conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


    }


    public void update(String nome, int id){
        String sql = "UPDATE modelo SET nome = ? WHERE id = ?";

        Connection conn = null;
        PreparedStatement stmt = null;
        Conexao conexao = new Conexao();

        try {
            conn = conexao.createConnectionToMysql();
            stmt = conn.prepareStatement(sql);

            stmt.setString(1, nome);
            stmt.setInt(2, id);    
            
            stmt.execute();
            conn.close();
        } catch (Exception e) {
            System.out.println("Não foi possível atualizar o campo!");
        }finally{
            try {
                if(stmt != null)
                    stmt.close();
                if(conn != null)
                    conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


    }


    public List<Controler> select(){
        //String sql = "SELECT * FROM cadastro WHERE id = ?";
        String sql = "SELECT * FROM modelo";

        List<Controler> c = new ArrayList<Controler>();
    
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet lerQuery = null;
        Conexao conexao = new Conexao();

        try {
            conn = conexao.createConnectionToMysql();
            stmt = conn.prepareStatement(sql);
            lerQuery = stmt.executeQuery();

            while(lerQuery.next()){
                Controler mode = new Controler();
                mode.setId(lerQuery.getInt("id"));
                mode.setNome(lerQuery.getString("nome"));
               c.add(mode);
            }

            conn.close();
        } catch (Exception e) {
            System.out.println("Não foi possível consultar o banco de dados!");
        }finally{
            try{
                if(stmt != null)
                    stmt.close();
                if(conn != null)
                    conn.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        return c;


    }


}
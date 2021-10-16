package SegundoProjeto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class DAO{
    private Connection conexao;


    private Connection getConexao(){
        try {
            if(conexao != null && !conexao.isClosed())
                return conexao;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        conexao = Conexao.getConexao();
        return conexao;


    }


    public int comandos(String sql, Object... atributos){
        try {
            PreparedStatement stmt = getConexao().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            adicionarAtributos(stmt, atributos);

            if(stmt.executeUpdate() > 0){
                ResultSet resultado = stmt.getGeneratedKeys();

                if(resultado.next()){
                    return resultado.getInt(1);
                }
            }
            
            return -1;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }


    public void insert(String sql, Object... atributos ){
        comandos(sql, atributos);
    }
    public void delete(String sql, Object... atributos ){
        comandos(sql, atributos);
    }
    public void update(String sql, Object... atributos ){
        comandos(sql, atributos);
    }


    private void adicionarAtributos(PreparedStatement stmt,Object[] atributos) throws SQLException{
        int indice = 1;

        for(Object atributo : atributos){
            if(atributo instanceof String)
                stmt.setString(indice, (String) atributo);
            else if(atributo instanceof Integer)
                stmt.setInt(indice, (Integer) atributo);
            else if( atributo instanceof Long){
                stmt.setLong(indice, (Long) atributo);
            }

            indice++;
        }


    }


    public List<Controler> select(String sql, Object... atributos){ 
        List<Controler> c = new ArrayList<Controler>();

        try {
            PreparedStatement stmt = getConexao().prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);

            adicionarAtributos(stmt, atributos);

            ResultSet lerQuery = stmt.executeQuery();

            while(lerQuery.next()){
                Controler mode = new Controler();
                mode.setId(lerQuery.getInt("id"));
                mode.setNome(lerQuery.getString("nome"));
                mode.setEmail(lerQuery.getString("email"));
                c.add(mode);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return c;  
    }
        

    public void close(){
        try {
            getConexao().close();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            conexao = null;
        }
    }


}
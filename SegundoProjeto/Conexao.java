package SegundoProjeto;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Conexao {
    private static Properties getProperties() throws IOException{
        Properties prop = new Properties();
        String caminho = "/Refatorar.properties";
        prop.load(Conexao.class.getResourceAsStream(caminho));
        return prop;
    }


    public static Connection getConexao(){
        try {
            Properties prop = getProperties();
            final String USER = prop.getProperty("banco.usuario");
            final String PASS = prop.getProperty("banco.senha");
            final String URL = prop.getProperty("banco.url");  
            
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (SQLException | IOException e) {
            throw new RuntimeException(e);
        }
    }
}
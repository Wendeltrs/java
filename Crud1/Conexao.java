package PrimeiroProjeto;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
    private static final String USER = "root";
    private static final String PASS = "alunolab";    
    private static final String URL = "jdbc:mysql://localhost:3306/projeto?characterEncoding=latin1&useConfigs=maxPerformance&useTimezone=true&serverTimezone=UTC";   
    
    public Connection createConnectionToMysql() throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conexao = DriverManager.getConnection(URL, USER, PASS);
        return conexao;
    }

    
}
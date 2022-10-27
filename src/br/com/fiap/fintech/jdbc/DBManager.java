package br.com.fiap.fintech.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBManager {

    public static Connection obterConexao(){
        Connection conexao = null;
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");

            conexao = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "fiap" , "fiap");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return  conexao;
    };
}


package br.com.simone.dao;

import java.sql.*;

public class DBConnection {

    private static final String DRIVER_CLASS_MYSQL = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
   // private static final String URL_MYSQL = "jdbc:sqlserver://localhost:1433;DatabaseName=light";
    private static final String URL_MYSQL = "jdbc:sqlserver://192.168.1.4:1433;DatabaseName=light";
    private static final String USER = "sa";
    private static final String PASS = "42301886";

    /* Classe que faz a conexão com o banco de dados.*/
    public static Connection getConnection() {
        System.out.println("Abriu conexão com Banco de Dados");
        try {
            Class.forName(DRIVER_CLASS_MYSQL);
            Connection conn = DriverManager.getConnection(URL_MYSQL, USER, PASS);
            //conn.setAutoCommit(false);
            return  conn;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    /* Classe que faz uma execução no banco.*/
    public static void close(Connection conn, PreparedStatement pstm, ResultSet rs) {
        try {
            if (conn != null) {
                conn.close();
                System.out.println("Fechou conexão com Banco de Dados");
            }

            if (pstm != null) {
                pstm.close();
                 System.out.println("Fechou pstm");
            }

            if (rs != null) {
                rs.close();
                 System.out.println("Fechou rs.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /* Classe que prepara uma execução no banco.*/
    public static void createTableConsumo() {
        Connection connection =  getConnection();
        PreparedStatement stmt = null;
        
         String sql = "CREATE TABLE IF NOT EXISTS consumo_mes("+
         "ID INT NOT NULL AUTO_INCREMENT,"+
         "DATA VARCHAR(50) NOT NULL,"+
         "MEDIDA FLOAT NOT NULL,"+
         "MEDIDA_ANTERIOR FLOAT NOT NULL,"+
         "KWH_MES FLOAT NOT NULL,"+        
         "PRIMARY KEY (ID))";
         
        try {
            stmt = (PreparedStatement) connection.prepareStatement(sql);
            stmt.execute();
            System.out.println("Create Tables Ok!");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(connection, stmt, null);
        }
    }
    
    public static void createTableTarifas() {
        Connection connection =  getConnection();
        PreparedStatement stmt = null;
        
         String sql = "CREATE TABLE IF NOT EXISTS valor_tarifas("+
         "ID INT NOT NULL AUTO_INCREMENT,"+
         "TARIFA DOUBLE NOT NULL,"+
         "TARIFA_BVERMELHA DOUBLE NOT NULL,"+
         "TAXA_ILUMINACAO DOUBLE NOT NULL,"+     
         "PRIMARY KEY (ID))";
         
        try {
            stmt = (PreparedStatement) connection.prepareStatement(sql);
            stmt.execute();
            System.out.println("Create Tables Ok!");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(connection, stmt, null);
        }
    }
}


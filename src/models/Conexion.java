package models;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {
    private static final String URL = "jdbc:postgresql://localhost:5432/Escuela";
    private static final String USER = "postgres";
    private static final String PASSWORD = "1234";


    public static Connection conectar () throws SQLException{
        return DriverManager.getConnection(URL,USER,PASSWORD);

    }





    
}

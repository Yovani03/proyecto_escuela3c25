package models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//CarreraDAO contiene todos los metodos para interactuar con la tabla carrera de la base de datos 
//insert, select, update, delete,


public class CarreraDAO {
    private Connection conn;


    public CarreraDAO(Connection conn){
        this.conn = conn;
    }


    public int InsertarCarrera(Carrera carrera){
        String sql ="INSERT INTO carreras(IdCarrera, nombre, monto) VALUES(?, ?, ?)";
        int rows = 0;
        try(PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setInt(1,carrera.getIdcarrera());
            stmt.setString(2, carrera.getNombre());
            stmt.setDouble(3, carrera.getMonto());
            rows = stmt.executeUpdate();

        }catch (SQLException e){
            e.printStackTrace();
        }

        return rows;

    }
    
}

package models;

import java.sql.Connection;

//CarreraDAO contiene todos los metodos para interactuar con la tabla carrera de la base de datos 
//insert, select, update, delete,


public class CarreraDAO {
    private Connection conn;


    public CarreraDAO(Connection conn){
        this.conn = conn;
    }


    public int InsertarCarrera(Carrera carrera){
        String sql ="INSERT INTO carreras(IdCarrera, nombre, monto) VALUES(?, ?, ?)";

        return 0;

    }
    
}


package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class PersonasData {
    private Connection connection = null;
    private Conexion conexion;

    public PersonasData(Conexion conexion) {
        try {
            this.conexion=conexion;
            connection = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error al abrir al obtener la conexion");
        }       
    }  
     public void guardarPersonas(Personas personas){
        
        try{
          
            String sql = "INSERT INTO personas (nombre, dni, celular, activo, habilitado ) VALUES ( ?, ?, ?, ?, ?);";
           
            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
           
            statement.setString(1, personas.getNombre());
           
            statement.setString(2, personas.getDni());
      
            statement.setString(3, personas.getCelular());
            
            statement.setBoolean(4, personas.getActivo());
            
            statement.setBoolean(5, personas.getHabilitado());
             
             
                 
            statement.executeUpdate();
            
            ResultSet rs = statement.getGeneratedKeys();
            
            if (rs.next()) {
                personas.setIdpersonas(rs.getInt(1));
            } else {
                System.out.println("No se pudo obtener el ID luego de insertar una Persona");
            }
            statement.close();
    
        }catch (SQLException ex) {
            System.out.println("Error al insertar un Persona: " + ex.getMessage());
        }
    }
     
     
     public Personas buscarPersonasPorDni(String dni){
        Personas personas = null;
    try {           
            String sql = "SELECT * FROM personas WHERE dni = ?;";
            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, dni);
           
            ResultSet resultSet=statement.executeQuery();
            
            while(resultSet.next()){
              personas = new Personas();
              personas.setIdpersonas(resultSet.getInt("idpersonas"));
               
               personas.setNombre(resultSet.getString("Nombre"));
               personas.setDni(resultSet.getString("Dni"));
               personas.setCelular(resultSet.getString("celular"));
                   
            }           
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al buscar una Personas: " + ex.getMessage());
        }        
        return personas;
    } 
      public void actualizarPersonas(Personas personas){   
        try {
            
            String sql = "UPDATE personas SET nombre = ?, dni = ? , celular =?, activo = ? , habilitado =? WHERE idpersonas= ?;";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, personas.getNombre());
            statement.setString(2, personas.getDni());
            statement.setString(3, personas.getCelular());
            statement.setBoolean(4, personas.getActivo());
            statement.setBoolean(5, personas.getHabilitado());    
            statement.setInt(6, personas.getIdpersonas());
            statement.executeUpdate();
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al modificar una personas: " + ex.getMessage());
        }
    
    }
     
     public Personas buscarPersonasPorId(int id){
        Personas personas = null;
    try {           
            String sql = "SELECT * FROM personas WHERE idpersonas = ?;";
            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, id);
           
            ResultSet resultSet=statement.executeQuery();
            
            while(resultSet.next()){
              personas = new Personas();
              personas.setIdpersonas(resultSet.getInt("idpersonas"));
               
               personas.setNombre(resultSet.getString("Nombre"));
               personas.setDni(resultSet.getString("Dni"));
               personas.setCelular(resultSet.getString("celular"));
                   
            }           
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al buscar una Personas: " + ex.getMessage());
        }        
        return personas;
    } 
}

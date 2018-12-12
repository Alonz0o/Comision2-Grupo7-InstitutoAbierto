package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

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
    
        public void guardarPersona(Personas personas){
        
        try{
          
            String sql = "INSERT INTO personas (nombre, dni, celular, habilitado, activo) VALUES ( ?, ?, ?, ?, ?);";
           
            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
           
            statement.setString (1, personas.getNombre());
           
            statement.setString (2, personas.getDni());
      
            statement.setString (3, personas.getCelular());
            
            statement.setBoolean(4, personas.getHabilitado());
            
            statement.setBoolean(5, personas.getActivo());
            
            statement.executeUpdate();
            
            ResultSet rs = statement.getGeneratedKeys();
            
//            if (rs.next()) {
//                matriculas.setIdmatriculas(rs.getInt(1));
//            } else {
//                System.out.println("No se pudo obtener el ID luego de insertar una Matricula");
//            }
            statement.close();
    
        }catch (SQLException ex) {
            System.out.println("Error al insertar una persona: " + ex.getMessage());
        }
    }
        
        public List<Personas> obtenerPersonas(String tipo,String dato){
        List<Personas> Listapersonas = new ArrayList<Personas>();   
        String sql;    
        PreparedStatement statement;
        try {
            if("Nombre".equals(tipo))
            {
                sql = "SELECT * FROM personas WHERE nombre LIKE '%"+dato+"%' AND activo = 1 ;";
                statement = connection.prepareStatement(sql);
//                statement.setString(1,dato);
            }
            else if("DNI".equals(tipo))
            {
                sql = "SELECT * FROM personas WHERE dni LIKE '"+dato+"%' AND activo = 1 ;";
                statement = connection.prepareStatement(sql);
//                statement.setInt(1,Integer.parseInt(dato));
            }
            else if("Celular".equals(tipo))
            {
                sql = "SELECT * FROM personas WHERE celular LIKE '"+dato+"%' AND activo = 1 ;";
                statement = connection.prepareStatement(sql);
//                statement.setInt(1,Integer.parseInt(dato));
            }
            else if("Activos".equals(tipo))
            {
                sql = "SELECT * FROM personas WHERE activo = 1 ;";
                 statement = connection.prepareStatement(sql);
              
            }
            else if("Desactivado".equals(tipo))
            {
                sql = "SELECT * FROM personas WHERE activo = 0 ;";
                 statement = connection.prepareStatement(sql);
                
            }
            else{
                sql = "SELECT * FROM personas WHERE activo = 1;";
                 statement = connection.prepareStatement(sql);
            }                  
            ResultSet resultSet = statement.executeQuery();
            Personas  personas;
            while(resultSet.next()){
               personas = new Personas();
               personas.setIdpersonas(resultSet.getInt("idpersonas"));
               personas.setNombre(resultSet.getString("nombre"));
               personas.setDni(resultSet.getString("dni"));
               personas.setCelular(resultSet.getString("celular"));

               personas.setActivo(resultSet.getBoolean("activo"));
               personas.setHabilitado(resultSet.getBoolean("habilitado"));
               Listapersonas.add(personas);
            }      
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener persona: " + ex.getMessage());
        }
        return Listapersonas;      
    }
        
        public void actualizarPersonas(Personas personas){
    
        try {
            
            String sql = "UPDATE personas SET nombre = ?, dni = ?, celular = ?, activo = ?, habilitado = ? WHERE idpersonas = ?;";

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
            System.out.println("Error al modidicar una persona: " + ex.getMessage());
        }
    
    }
        
        public Personas buscarPersonasPorDni(int dni){
        Personas personas = null;
         try {           
            String sql = "SELECT * FROM personas WHERE dni = ?;";
            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, dni);
           
            ResultSet resultSet=statement.executeQuery();
            
            while(resultSet.next()){
               personas = new Personas();
               personas.setIdpersonas(resultSet.getInt("idpersonas"));
               personas.setNombre(resultSet.getString("nombre"));
               personas.setDni(resultSet.getString("dni"));
               personas.setCelular(resultSet.getString("celular"));
               personas.setActivo(resultSet.getBoolean("activo"));
               personas.setHabilitado(resultSet.getBoolean("habilitado"));        
            }           
            statement.close();
            } catch (SQLException ex) {
            System.out.println("Error al buscar una persona: " + ex.getMessage());
        }        
        return personas;
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
               personas.setNombre(resultSet.getString("nombre"));
               personas.setDni(resultSet.getString("dni"));
               personas.setCelular(resultSet.getString("celular"));
               personas.setActivo(resultSet.getBoolean("activo"));
               personas.setHabilitado(resultSet.getBoolean("habilitado"));        
            }           
            statement.close();
            } catch (SQLException ex) {
            System.out.println("Error al buscar una persona: " + ex.getMessage());
        }        
        return personas;
    }

}

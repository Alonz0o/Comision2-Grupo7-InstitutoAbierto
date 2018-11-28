
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class CursosData {
    private Connection connection = null;
    private Conexion conexion;

    public CursosData(Conexion conexion) {
        try {
            this.conexion=conexion;
            connection = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error al obtener la conexion");
        }
    }
    
     public void guardarCurso(Cursos cursos){
        
        try{
          
            String sql = "INSERT INTO cursos (idpersonas, nombre, descripcion,costo, cupomaximo, activo, habilitado) VALUES ( ?, ?, ?, ?, ?, ?, ?);";
           
            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
           
            statement.setInt(1, cursos.getPersonas().getIdpersonas());
           
            statement.setString(2, cursos.getNombre());
      
            statement.setString(3, cursos.getDescripcion());
            
            statement.setDouble(4, cursos.getCosto());
            
            statement.setInt(5, cursos.getCupomaximo());
      
            statement.setBoolean(6, cursos.getActivo());
            
            statement.setBoolean(7, cursos.getHabilitado());
                               
                               
            statement.executeUpdate();
            
            ResultSet rs = statement.getGeneratedKeys();
            
            if (rs.next()) {
                cursos.setIdcursos(rs.getInt(1));
            } else {
                System.out.println("No se pudo obtener el ID luego de insertar un curso");
            }
            statement.close();
    
        }catch (SQLException ex) {
            System.out.println("Error al insertar un curso: " + ex.getMessage());
        }
    }
    
    public void actualizarCurso(Cursos cursos){   
        try {
            
            String sql = "UPDATE cursos SET idpersonas = ?, nombre = ?,descripcion = ?, costo = ?, cupomaximo = ?, activo = ?, habilitado = ?, WHERE cursos = ?;";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, cursos.getPersonas().getIdpersonas());
            statement.setString(2, cursos.getNombre());
            statement.setString(3, cursos.getDescripcion());
            statement.setDouble(4, cursos.getCosto());
            statement.setInt(5, cursos.getCupomaximo());
            statement.setBoolean(6, cursos.getActivo());
            statement.setBoolean(7, cursos.getHabilitado());            
            statement.executeUpdate();
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al modificar un curso " + ex.getMessage());
        }
    }
     public Cursos buscarCursoPorID(int id){
        Cursos cursos = null;
    try {           
            String sql = "SELECT * FROM cursos WHERE idcursos = ?;";
            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, id);
           
            ResultSet resultSet=statement.executeQuery();
            
            while(resultSet.next()){
               cursos = new Cursos();
               cursos.setIdcursos(resultSet.getInt("idcursos"));
               cursos.setNombre(resultSet.getString("nombre"));
               cursos.setDescripcion(resultSet.getString("descripcion"));
               cursos.setCosto(resultSet.getDouble("costo"));
               cursos.setCupomaximo(resultSet.getInt("cupomaximo"));
               cursos.setActivo(resultSet.getBoolean("activo"));
               cursos.setHabilitado(resultSet.getBoolean("habilitado"));
               
               Personas p = buscarPersonas(resultSet.getInt("idpersonas"));
               cursos.setPersonas (p);
            }
               
                                     
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al buscar un curso: " + ex.getMessage());
        }        
        return cursos;
    } 
       public Personas buscarPersonas(int id){
    
        PersonasData ad = new PersonasData(conexion);
        
        return ad.buscarPersonaPorId(id);
        
    }
    
    
}

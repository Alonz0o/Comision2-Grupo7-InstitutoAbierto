package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import Modelo.CursosData;

public class MatriculasData {
    private Connection connection = null;
    private Conexion conexion;

    public MatriculasData(Conexion conexion) {
        try {
            this.conexion=conexion;
            connection = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error al abrir al obtener la conexion");
        }       
    }
    
    public void guardarMatricula(Matriculas matriculas){
        
        try{
          
            String sql = "INSERT INTO matriculas (idpersona, idcursos, fechaalta, costo) VALUES ( ?, ?, ?, ?);";
           
            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
           
            statement.setInt(1, matriculas.getPersonas().getIdpersona());
           
            statement.setInt(2, matriculas.getCursos().getIdcursos());
      
            statement.setDate(3, matriculas.getFechaalta());
            
            statement.setDouble(4, matriculas.getCosto());
                 
            statement.executeUpdate();
            
            ResultSet rs = statement.getGeneratedKeys();
            
            if (rs.next()) {
                matriculas.setIdmatriculas(rs.getInt(1));
            } else {
                System.out.println("No se pudo obtener el ID luego de insertar una Matricula");
            }
            statement.close();
    
        }catch (SQLException ex) {
            System.out.println("Error al insertar un Natricula: " + ex.getMessage());
        }
    }
    
    public void actualizarMatricula(Matriculas matriculas){   
        try {
            
            String sql = "UPDATE matriculas SET idpersonas = ?, idcursos = ? , fechaalta =?, costo = ? WHERE idmatriculas = ?;";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, matriculas.getPersonas().getIdpersonas());
            statement.setInt(2, matriculas.getCursos().getIdcursos());
            statement.setDate(3, matriculas.getFechaalta());
            statement.setDouble(4, matriculas.getCosto());
            statement.setInt(5, matriculas.getIdmatriculas());            
            statement.executeUpdate();
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al modificar una matricula: " + ex.getMessage());
        }
    
    }
    
    public Matriculas buscarMatriculaPorID(int id){
        Matriculas matriculas = null;
    try {           
            String sql = "SELECT * FROM matriculas WHERE idmatriculas = ?;";
            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, id);
           
            ResultSet resultSet=statement.executeQuery();
            
            while(resultSet.next()){
               matriculas = new Matriculas();
               matriculas.setIdmatriculas(resultSet.getInt("idmatriculas"));
               
               matriculas.setFechaalta(resultSet.getDate("fecha"));
               matriculas.setCosto(resultSet.getDouble("costo"));
               
               Personas p = buscarPersona(resultSet.getInt("idpersonas"));
               matriculas.setPersonas(p);
               
               Cursos c = buscarCurso(resultSet.getInt("idcursos"));
               matriculas.setCursos(c);             
            }           
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al buscar una matricula: " + ex.getMessage());
        }        
        return matriculas;
    } 
    
    public Personas buscarPersona(int id){
    
        PersonasData ad=new PersonasData(conexion);
        
        return ad.buscarPersonas(id);
        
    }
    
    public Cursos buscarCurso(int id){
    
        CursosData ad = new CursosData(conexion);
        
        return ad.buscarCursos(id);
        
    }

}

package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import Modelo.CursosData;
import java.util.ArrayList;
import java.util.List;

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
          
            String sql = "INSERT INTO matriculas (idpersonas, idcursos, fechaalta, costo) VALUES ( ?, ?, ?, ?);";
           
            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
           
            statement.setInt(1, matriculas.getPersonas().getIdpersonas());
           
            statement.setInt(2, matriculas.getCursos().getIdcursos());
      
            statement.setDate(3, matriculas.getFechaalta());
            
            statement.setDouble(4, matriculas.getCosto());
                 
            statement.executeUpdate();
            
            ResultSet rs = statement.getGeneratedKeys();
                                             
            statement.close();
    
        }catch (SQLException ex) {
            System.out.println("Error al insertar un Matricula: " + ex.getMessage());
        }
    }
    
    public void actualizarMatricula(Matriculas matriculas){   
        try {
            
            String sql = "UPDATE matriculas SET idpersonas = ?, idcursos = ? , fechaalta =?, costo = ?, activo = ? WHERE idmatriculas = ?;";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, matriculas.getPersonas().getIdpersonas());           
            statement.setInt(2, matriculas.getCursos().getIdcursos());
            statement.setDate(3, matriculas.getFechaalta());
            statement.setDouble(4, matriculas.getCosto());
            statement.setBoolean(5, matriculas.getActivo()); 
            statement.setInt(6, matriculas.getIdmatriculas());              
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
               
               matriculas.setFechaalta(resultSet.getDate("fechaalta"));
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
    
    public List <Matriculas> obtenerMatriculas(int id){
        List <Matriculas> Listamatriculas = new ArrayList<Matriculas>();           
        try {
            String sql = "SELECT * FROM matriculas WHERE activo = 1 AND idpersonas = ?;";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            
            ResultSet resultSet = statement.executeQuery();
            Matriculas matriculas;
            while(resultSet.next()){               
                matriculas = new Matriculas();   
                matriculas.setIdmatriculas(resultSet.getInt("idmatriculas"));
                
                Personas p = buscarPersona(resultSet.getInt("idpersonas"));
                matriculas.setPersonas(p);
                
                Cursos c = buscarCurso(resultSet.getInt("idcursos"));               
                matriculas.setCursos(c);
                                           
                matriculas.setFechaalta(resultSet.getDate("fechaalta"));
                matriculas.setCosto(resultSet.getDouble("costo"));
                

                
                Listamatriculas.add(matriculas);
                
            }      
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener los matriculas: " + ex.getMessage());
        }
        return Listamatriculas;
    }
    
    public Personas buscarPersona(int id){
    
        PersonasData ad = new PersonasData(conexion);
        
        return ad.buscarPersonasPorId(id);
        
    }
    
    public Cursos buscarCurso(int id){
    
        CursosData ad = new CursosData(conexion);
        
        return ad.buscarCursosPorID(id);
        
    }
    public List <Matriculas> obtenerPersonasPorCurso(int id){
        List <Matriculas> Listamatriculas = new ArrayList<Matriculas>();           
        try {
            String sql = "SELECT * FROM matriculas WHERE idcursos = ?;";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
           
            ResultSet resultSet = statement.executeQuery();
            Matriculas matriculas;
            while(resultSet.next()){               
                matriculas = new Matriculas();   
                matriculas.setIdmatriculas(resultSet.getInt("idmatriculas"));
                
                Personas p = buscarPersona(resultSet.getInt("idpersonas"));
                matriculas.setPersonas(p);
                
                Cursos c = buscarCurso(resultSet.getInt("idcursos"));               
                matriculas.setCursos(c);
                                           
                matriculas.setFechaalta(resultSet.getDate("fechaalta"));
                matriculas.setCosto(resultSet.getDouble("costo"));
                

                
                Listamatriculas.add(matriculas);
                
            }      
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener los matriculas: " + ex.getMessage());
        }
        return Listamatriculas;
    }
}

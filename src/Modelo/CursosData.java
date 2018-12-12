package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class CursosData {
    private Connection connection = null;
    private Conexion conexion;

    public CursosData(Conexion conexion) {
        try {
            this.conexion=conexion;
            connection = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error al abrir al obtener la conexion");
        }
    }
    
        public void guardarCurso(Cursos cursos){
        
            try{
          
            String sql = "INSERT INTO cursos (idpersonas, nombre, descripcion, costo, cupomaximo, activo, habilitado) VALUES ( ?, ?, ?, ?, ?, ?, ?);";
           
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
            
//            if (rs.next()) {
//                matriculas.setIdmatriculas(rs.getInt(1));
//            } else {
//                System.out.println("No se pudo obtener el ID luego de insertar un curso");
//            }
            statement.close();
    
        }
            catch (SQLException ex) {
            System.out.println("Error al insertar un curso: " + ex.getMessage());
        }          
    }
        public void modificarCurso(Cursos cursos){   
        try {
            
            String sql = "UPDATE cursos SET idpersonas = ?, nombre = ?, descripcion = ?, costo = ?, cupomaximo = ?, activo = ?, habilitado = ? WHERE idcursos = ?;";
            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, cursos.getPersonas().getIdpersonas());
            statement.setString(2, cursos.getNombre());
            statement.setString(3, cursos.getDescripcion());
            statement.setDouble(4, cursos.getCosto());
            statement.setInt(5, cursos.getCupomaximo());
            statement.setBoolean(6, cursos.getActivo());
            statement.setBoolean(7, cursos.getHabilitado());
            statement.setInt(8, cursos.getIdcursos());
            
            statement.executeUpdate();
            
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al modidicar un curso: " + ex.getMessage());
        }
    
    }        
        public Cursos buscarCursosPorID(int id){
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
               Personas p = buscarPersona(resultSet.getInt("idpersonas"));
               cursos.setPersonas(p);                                        
            }           
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al buscar el curso: " + ex.getMessage());
        }        
        return cursos;
    }
        
        public Personas buscarPersona(int id){
    
        PersonasData ad=new PersonasData(conexion);
        
        return ad.buscarPersonasPorId(id);
        
    }
        
        public List<Cursos> obtenerCursos(String tipo,String dato){
        List<Cursos> Listacursos = new ArrayList<Cursos>(); 
        String sql;    
        PreparedStatement statement;
        try {
            if("Nombre".equals(tipo))
            {
                sql = "SELECT * FROM cursos WHERE nombre LIKE '%"+dato+"%' AND activo = 1 ;";
                statement = connection.prepareStatement(sql);
//                statement.setString(1,dato);
            }
            else if("Descripcion".equals(tipo))
            {
                sql = "SELECT * FROM cursos WHERE descripcion LIKE '"+dato+"%' AND activo = 1 ;";
                statement = connection.prepareStatement(sql);
//                statement.setInt(1,Integer.parseInt(dato));
            }
            else if("Costo".equals(tipo))
            {
                sql = "SELECT * FROM cursos WHERE costo LIKE '"+dato+"%' AND activo = 1 ;";
                statement = connection.prepareStatement(sql);
//                statement.setInt(1,Integer.parseInt(dato));
            }
            else if("Cupo".equals(tipo))
            {
                sql = "SELECT * FROM cursos WHERE cupomaximo LIKE '"+dato+"%' AND activo = 1;";
                 statement = connection.prepareStatement(sql);
              
            }
            else if("Activos".equals(tipo))
            {
                sql = "SELECT * FROM cursos WHERE activo = 1 ;";
                 statement = connection.prepareStatement(sql);
              
            }
            else if("Desactivado".equals(tipo))
            {
                sql = "SELECT * FROM cursos WHERE activo = 0 ;";
                 statement = connection.prepareStatement(sql);
                
            }
            else{              
                sql = "SELECT * FROM cursos WHERE activo = 1;";
                 statement = connection.prepareStatement(sql);
            }                  
            ResultSet resultSet = statement.executeQuery();
            Cursos  cursos;
            while(resultSet.next()){
               cursos = new Cursos();
               cursos.setIdcursos(resultSet.getInt("Idcursos"));
               cursos.setNombre(resultSet.getString("nombre"));
               cursos.setDescripcion(resultSet.getString("descripcion"));
               cursos.setCosto(resultSet.getFloat("costo"));
               cursos.setCupomaximo(resultSet.getInt("cupomaximo"));
               cursos.setActivo(resultSet.getBoolean("activo"));
               cursos.setHabilitado(resultSet.getBoolean("habilitado"));
               Personas p = buscarPersona(resultSet.getInt("idpersonas"));
               cursos.setPersonas(p);
               Listacursos.add(cursos);
            }      
            statement.close();
        } catch (SQLException ex) {
            System.out.println("ERROR AL OBTENER CURSOS " + ex.getMessage());
        }
        return Listacursos;      
    }    
//        List<Cursos> Listacursos = new ArrayList<Cursos>();           
//        try {
//            String sql = "SELECT * FROM cursos c, personas p WHERE c.idpersonas = p.idpersonas;";
//            PreparedStatement statement = connection.prepareStatement(sql);
//            ResultSet resultSet = statement.executeQuery();
//            Cursos cursos;
//            while(resultSet.next()){
//                cursos = new Cursos();
//                cursos.setIdcursos(resultSet.getInt("idcursos"));
//                cursos.setNombre(resultSet.getString("nombre"));
//                cursos.setDescripcion(resultSet.getString("descripcion"));
//                cursos.setCosto(resultSet.getDouble("costo"));
//                cursos.setCupomaximo(resultSet.getInt("cupomaximo"));
//                cursos.setActivo(resultSet.getBoolean("activo"));
//                cursos.setActivo(resultSet.getBoolean("habilitado"));
//                
//                Personas p = buscarPersona(resultSet.getInt("idpersonas"));
//                cursos.setPersonas(p);
//                
//                Listacursos.add(cursos);
//                
//            }      
//            statement.close();
//        } catch (SQLException ex) {
//            System.out.println("Error al obtener los cursos: " + ex.getMessage());
//        }
//        return Listacursos;
//    }
        public List<Cursos> obtenerCursosPorCupoMaximo(int cupo){
        List<Cursos> Listacursos = new ArrayList<Cursos>();           
        try {
            String sql = "SELECT * FROM cursos WHERE cupomaximo = ?;";           
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, cupo);
            ResultSet resultSet = statement.executeQuery();          
            Cursos cursos;
            while(resultSet.next()){
                cursos = new Cursos();
                cursos.setIdcursos(resultSet.getInt("idcursos"));
                cursos.setNombre(resultSet.getString("nombre"));
                cursos.setDescripcion(resultSet.getString("descripcion"));
                cursos.setCosto(resultSet.getDouble("costo"));
                cursos.setCupomaximo(resultSet.getInt("cupomaximo"));
                cursos.setActivo(resultSet.getBoolean("activo"));
                cursos.setActivo(resultSet.getBoolean("habilitado"));
                
                Personas p = buscarPersona(resultSet.getInt("idpersonas"));
                cursos.setPersonas(p);
                
                Listacursos.add(cursos);
                
            }      
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener los cursos: " + ex.getMessage());
        }
        return Listacursos;
    }       
}


package Modelo;


public class Personas {
    private int idpersonas =-1;
    private String nombre;
    private String dni;
    private String celular;
    private boolean habilitado;
    private boolean activo;

    public Personas(int idpersonas, String nombre, String dni, String celular, boolean habilitado, boolean activo) {
        this.idpersonas = idpersonas;
        this.nombre = nombre;
        this.dni = dni;
        this.celular = celular;
        this.habilitado = habilitado;
        this.activo = activo;
    }

    public Personas(String nombre, String dni, String celular, boolean habilitado, boolean activo) {
        this.idpersonas =-1;
        this.nombre = nombre;
        this.dni = dni;
        this.celular = celular;
        this.habilitado = habilitado;
        this.activo = activo;
    }
     public Personas() {
        this.idpersonas =-1;
    }

    public int getIdpersonas() {
        return idpersonas;
    }

    public void setIdpersonas(int idpersonas) {
        this.idpersonas = idpersonas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public boolean getHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }

    public boolean getActivo() {
        return activo;
    }

    
    
    
    public void setActivo(boolean activo) {
        this.activo = activo;
    }
     
    
    
    //gfgfg
}

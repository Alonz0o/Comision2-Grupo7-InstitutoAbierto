package Modelo;

public class Cursos {    
    private int idcursos = -1;
    private Personas personas;
    private String nombre;
    private String descripcion;
    private double costo;
    private int cupomaximo;
    private boolean activo;
    private boolean habilitado;
//modificar
    public Cursos(int idcursos, Personas personas, String nombre, String descripcion, double costo, int cupomaximo, boolean activo, boolean habilitado) {
        this.idcursos = idcursos;
        this.personas = personas;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.costo = costo;
        this.cupomaximo = cupomaximo;
        this.activo = activo;
        this.habilitado = habilitado;
    }

    public Cursos(Personas personas, String nombre, String descripcion, double costo, int cupomaximo, boolean activo, boolean habilitado) {
        this.idcursos = -1;
        this.personas = personas;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.costo = costo;
        this.cupomaximo = cupomaximo;
        this.activo = activo;
        this.habilitado = habilitado;
    }
    
    public Cursos() {
        this.idcursos = -1;
    }

    public int getIdcursos() {
        return idcursos;
    }

    public void setIdcursos(int idcursos) {
        this.idcursos = idcursos;
    }

    public Personas getPersonas() {
        return personas;
    }

    public void setPersonas(Personas personas) {
        this.personas = personas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public int getCupomaximo() {
        return cupomaximo;
    }

    public void setCupomaximo(int cupomaximo) {
        this.cupomaximo = cupomaximo;
    }

    public boolean getActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public boolean getHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }
    
    
    
}

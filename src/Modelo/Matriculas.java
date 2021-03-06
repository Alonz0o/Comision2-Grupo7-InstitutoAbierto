package Modelo;

import java.sql.Date;

public class Matriculas {
    private int idmatriculas = -1;
    private Personas personas;
    private Cursos cursos;
    private Date fechaalta;
    private double costo;
    private boolean activo;
    private int cantidad;
//Se utiliza para actualizar
    public Matriculas(int idmatriculas, Personas personas, Cursos cursos, Date fechaalta, double costo, boolean activo) {
        this.idmatriculas = idmatriculas;
        this.personas = personas;
        this.cursos = cursos;
        this.fechaalta = fechaalta;
        this.costo = costo;
        this.activo = activo;
    }
//Se utiliza cuando se va a guardar    
    public Matriculas(Personas personas, Cursos cursos, Date fechaalta, double costo) {
        this.idmatriculas = -1;
        this.personas = personas;
        this.cursos = cursos;
        this.fechaalta = fechaalta;
        this.costo = costo;
    }
    
    public Matriculas() {
        this.idmatriculas = -1;
    }

    public int getIdmatriculas() {
        return idmatriculas;
    }

    public void setIdmatriculas(int idmatriculas) {
        this.idmatriculas = idmatriculas;
    }

    public Personas getPersonas() {
        return personas;
    }

    public void setPersonas(Personas personas) {
        this.personas = personas;
    }

    public Cursos getCursos() {
        return cursos;
    }

    public void setCursos(Cursos cursos) {
        this.cursos = cursos;
    }

    public Date getFechaalta() {
        return fechaalta;
    }

    public void setFechaalta(Date fechaalta) {
        this.fechaalta = fechaalta;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public boolean getActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
}

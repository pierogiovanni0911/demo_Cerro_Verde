package com.saluddigital.cerroverde.model;

import java.time.LocalDate;

public class Empleado extends Persona{
    private int idEmpleado;
    private LocalDate fechaIngreso;
    private String area;
    private String cargo;
    private String correoCentroSalud;

    public Empleado(int idEmpleado, LocalDate fechaIngreso, String area, String cargo, 
                    String correoCentroSalud, int idPersona, String documento, String seguroSocial,
                    String primerNombre, String segundoNombre, String apellidoPaterno, String apellidoMaterno,
                    String sexo, String telefono, String correoElectronico, String direccion, String nacionalidad,
                    String estadoCivil, LocalDate fechaNacimiento) {
        super(idPersona, documento, seguroSocial, primerNombre, segundoNombre, apellidoPaterno, apellidoMaterno, 
                sexo, telefono, correoElectronico, direccion, nacionalidad, estadoCivil, fechaNacimiento);
        this.idEmpleado = idEmpleado;
        this.fechaIngreso = fechaIngreso;
        this.area = area;
        this.cargo = cargo;
        this.correoCentroSalud = correoCentroSalud;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCorreoCentroSalud() {
        return correoCentroSalud;
    }

    public void setCorreoCentroSalud(String correoCentroSalud) {
        this.correoCentroSalud = correoCentroSalud;
    }
    
    
}

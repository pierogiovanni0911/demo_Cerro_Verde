package com.saluddigital.cerroverde.model;

import java.util.Date;

public class Empleado extends Persona{
    private int idEmpleado;
    private Date fechaIngreso;
    private String area;
    private String cargo;
    private String correoCentroSalud;

    public Empleado(int idEmpleado, Date fechaIngreso, String area, String cargo, 
                    String correoCentroSalud, int idPersona, String documento, String tipoDoc, String seguroSocial,
                    String primerNombre, String segundoNombre, String apellidoPaterno, String apellidoMaterno,
                    String sexo, String telefono, String correoElectronico, String direccion, String departamento, 
                    String provincia, String distrito,String nacionalidad, String estadoCivil, Date fechaNacimiento) {
        super(idPersona, documento, tipoDoc, seguroSocial, primerNombre, segundoNombre, apellidoPaterno, apellidoMaterno, 
                sexo, telefono, correoElectronico, direccion, departamento, provincia, distrito, nacionalidad, estadoCivil,
                fechaNacimiento);
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

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
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

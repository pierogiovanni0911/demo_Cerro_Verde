package com.saluddigital.cerroverde.model;

import java.util.Date;

public class Empleado extends Persona{
    private int idEmpleado;
    private Date fechaIngreso;
    private String area;
    private String cargo;
    private String correoCentroSalud;
    private String claveCentroSalud;

    public Empleado(int idEmpleado, Date fechaIngreso, String area, String cargo, String correoCentroSalud, 
                    String claveCentroSalud, String documento, String seguroSocial, String nombre, String apellido,
                    String sexo, String telefono, String correoElectronico, String direccion, String departamento,
                    String provincia, String distrito, String estadoCivil, Date fechaNacimiento) {
        super(documento, nombre, apellido, seguroSocial, sexo, telefono, correoElectronico, direccion, departamento,
            provincia, distrito, estadoCivil, fechaNacimiento);
        this.idEmpleado = idEmpleado;
        this.fechaIngreso = fechaIngreso;
        this.area = area;
        this.cargo = cargo;
        this.correoCentroSalud = correoCentroSalud;
        this.claveCentroSalud = claveCentroSalud;
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

    public String getClaveCentroSalud() {
        return claveCentroSalud;
    }

    public void setClaveCentroSalud(String claveCentroSalud) {
        this.claveCentroSalud = claveCentroSalud;
    }
}

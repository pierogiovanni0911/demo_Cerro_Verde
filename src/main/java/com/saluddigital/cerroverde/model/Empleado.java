package com.saluddigital.cerroverde.model;

import java.util.Date;

public class Empleado extends Persona{
    private int idEmpleado;
    private Date fechaIngreso;
    private String area;
    private String cargo;
    private String username;
    private String password;

    public Empleado(int idEmpleado, Date fechaIngreso, String area, String cargo, String username, 
                    String password, int idPersona, String documento, String seguroSocial, String nombre, String apellido,
                    String sexo, String telefono, String correoElectronico, String direccion, String departamento,
                    String provincia, String distrito, String estadoCivil, Date fechaNacimiento) {
        super(idPersona, documento, nombre, apellido, seguroSocial, sexo, telefono, correoElectronico, direccion, departamento,
            provincia, distrito, estadoCivil, fechaNacimiento);
        this.idEmpleado = idEmpleado;
        this.fechaIngreso = fechaIngreso;
        this.area = area;
        this.cargo = cargo;
        this.username = username;
        this.password = password;
    }

    public Empleado(){
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString(){
        return "Empleado{" +
                "idEmpleado=" + idEmpleado +
                ", fechaIngreso=" + fechaIngreso +
                ", area='" + area + '\'' +
                ", cargo='" + cargo + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

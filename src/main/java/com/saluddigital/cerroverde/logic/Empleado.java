package com.saluddigital.cerroverde.logic;

import java.time.LocalDate;

public class Empleado extends Persona{
    private int idEmpleado;
    private LocalDate fechaIngreso;
    private String area;
    private String cargo;
    private String correoCentroSalud;

    public Empleado() {
        super();
        idEmpleado = 0;
        fechaIngreso = LocalDate.now();
        area = "";
        cargo = "";
        correoCentroSalud = "";
    }

    public Empleado(int idEmpleado, LocalDate fechaIngreso, String area, String cargo, 
                    String correoCentroSalud, int idPersona, String nombres, String apellidos, 
                    String tipoDocumento, String numeroDocumento, String sexo, LocalDate fechaNacimiento, 
                    String direccion, String telefono, String correo) {
        super(idPersona, tipoDocumento, numeroDocumento, nombres, nombres, apellidos, apellidos, sexo, 
        telefono, correo, direccion, telefono, correo, fechaNacimiento);
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

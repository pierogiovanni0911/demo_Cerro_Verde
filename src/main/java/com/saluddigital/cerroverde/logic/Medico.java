package com.saluddigital.cerroverde.logic;

import java.time.LocalDate;

public class Medico extends Empleado{
    private int idMedico;
    private String numConsultorio;
    private String especialidad;
    private String servicio;
    private String estado;

    public Medico(){
        idMedico = 0;
        numConsultorio = "";
        especialidad = "";
        servicio = "";
        estado = "";
    }

    public Medico(int idMedico, String numConsultorio, String especialidad, String servicio, String estado, 
                  int idEmpleado, LocalDate fechaIngreso, String area, String cargo, String correoCentroSalud, 
                  int idPersona, String nombres, String apellidos, String tipoDocumento, String numeroDocumento, 
                  String sexo, LocalDate fechaNacimiento, String direccion, String telefono, String correo) {
        super(idEmpleado, fechaIngreso, area, cargo, correoCentroSalud, idPersona, nombres, apellidos, tipoDocumento, 
              numeroDocumento, sexo, fechaNacimiento, direccion, telefono, correo);
        this.idMedico = idMedico;
        this.numConsultorio = numConsultorio;
        this.especialidad = especialidad;
        this.servicio = servicio;
        this.estado = estado;
    }
    
    public int getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
    }

    public String getNumConsultorio() {
        return numConsultorio;
    }

    public void setNumConsultorio(String numConsultorio) {
        this.numConsultorio = numConsultorio;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    
}

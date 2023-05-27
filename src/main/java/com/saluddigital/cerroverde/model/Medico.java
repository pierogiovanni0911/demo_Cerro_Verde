package com.saluddigital.cerroverde.model;

import java.time.LocalDate;

public class Medico extends Empleado{
    private int idMedico;
    private String numConsultorio;
    private String especialidad;
    private String servicio;
    private String estado;

    public Medico(int idMedico, String numConsultorio, String especialidad, String servicio, String estado, 
                int idEmpleado, LocalDate fechaIngreso, String area, String cargo, String correoCentroSalud,
                int idPersona, String documento, String seguroSocial, String primerNombre, String segundoNombre,
                String apellidoPaterno, String apellidoMaterno, String sexo, String telefono, String correoElectronico,
                String direccion, String nacionalidad, String estadoCivil, LocalDate fechaNacimiento) {
        super(idEmpleado, fechaIngreso, area, cargo, correoCentroSalud, idPersona, documento, seguroSocial, primerNombre,
                segundoNombre, apellidoPaterno, apellidoMaterno, sexo, telefono, correoElectronico, direccion, nacionalidad, 
                estadoCivil, fechaNacimiento);
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

    @Override
    public String toString() {
        return "Medico{" + "idMedico=" + idMedico + ", numConsultorio=" + numConsultorio + 
            ", especialidad=" + especialidad + ", servicio=" + servicio + ", estado=" + estado + '}';
    }


}

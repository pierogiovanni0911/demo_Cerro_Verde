package com.saluddigital.cerroverde.model;

import java.util.Date;

public class Medico extends Empleado{
    private int idMedico;
    private String numConsultorio;
    private String especialidad;

    public Medico(int idMedico, String numConsultorio, String especialidad, int idEmpleado, Date fechaIngreso, 
                    String area, String cargo, String correoCentroSalud, String claveCentroSalud, int idPersona, String documento,
                    String seguroSocial, String nombre, String apellido, String sexo, String telefono, String correoElectronico,
                    String direccion, String departamento, String provincia, String distrito, String estadoCivil, Date fechaNacimiento) {
        super(idEmpleado, fechaIngreso, area, cargo, correoCentroSalud, claveCentroSalud, idPersona, documento, seguroSocial, nombre, 
                apellido, sexo, telefono, correoElectronico, direccion, departamento, provincia, distrito, estadoCivil, fechaNacimiento);
        this.idMedico = idMedico;
        this.numConsultorio = numConsultorio;
        this.especialidad = especialidad;
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

    @Override
    public String toString() {
        return "Medico{" + "idMedico=" + idMedico + ", numConsultorio=" + numConsultorio + ", especialidad=" + especialidad + '}';
    }


}

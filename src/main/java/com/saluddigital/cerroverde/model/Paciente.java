package com.saluddigital.cerroverde.model;

import java.util.Date;

public class Paciente extends Persona {
    private int idPaciente;
    private String grupoSanguineo;
    private HistorialMedico historialMedico;

    public Paciente(int idPaciente, String grupoSanguineo, HistorialMedico historialMedico, int idPersona, String documento, String nombre,
                    String apellido, String seguroSocial, String sexo, String telefono, String correoElectronico, String direccion,
                    String departamento, String provincia, String distrito, String estadoCivil, Date fechaNacimiento) {
        super(idPersona, documento, nombre, apellido, seguroSocial, sexo, telefono, correoElectronico, direccion, departamento,
            provincia, distrito, estadoCivil, fechaNacimiento);
        this.idPaciente = idPaciente;
        this.grupoSanguineo = grupoSanguineo;
        this.historialMedico = historialMedico;
    }

    public Paciente(){
    }

    public int getIdPaciente() {
        return idPaciente;
    }
    
    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getGrupoSanguineo() {
        return grupoSanguineo;
    }

    public void setGrupoSanguineo(String grupoSanguineo) {
        this.grupoSanguineo = grupoSanguineo;
    }

    public HistorialMedico gethistorialMedico() {
        return historialMedico;
    }

    public void setHistorialMedico(HistorialMedico historialMedico) {
        this.historialMedico = historialMedico;
    }

    @Override
    public String toString(){
        return "Paciente{" +
            "idPaciente=" + idPaciente +
            ", idPersona=" + getIdPersona() +
            ", documento='" + getDocumento() + '\'' +
            ", nombre='" + getNombre() + '\'' +
            ", apellido='" + getApellido() + '\'' +
            ", seguroSocial='" + getSeguroSocial() + '\'' +
            ", sexo='" + getSexo() + '\'' +
            ", telefono='" + getTelefono() + '\'' +
            ", correoElectronico='" + getCorreoElectronico() + '\'' +
            ", direccion='" + getDireccion() + '\'' +
            ", departamento='" + getDepartamento() + '\'' +
            ", provincia='" + getProvincia() + '\'' +
            ", distrito='" + getDistrito() + '\'' +
            ", estadoCivil='" + getEstadoCivil() + '\'' +
            ", fechaNacimiento=" + getFechaNacimiento() +
            ", grupoSanguineo='" + grupoSanguineo + '\'' +
            ", historialMedico=" + historialMedico.toString() +
            '}';

    }
}

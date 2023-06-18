package com.saluddigital.cerroverde.model;

import java.util.Date;

public class Paciente extends Persona {
    private String antecedentesPersonales;
    private String antecedentesFamiliares;
    private String antecedentesObstetricos;
    private String grupoSanguineo;

    public Paciente(String antecedentesPersonales, String antecedentesFamiliares,
            String antecedentesObstetricos, String grupoSanguineo, int idPersona, String documento, String tipoDoc,
            String seguroSocial, String primerNombre, String segundoNombre, String apellidoPaterno, String apellidoMaterno,
            String sexo, String telefono, String correoElectronico, String direccion, String departamento, String provincia,
            String distrito, String nacionalidad, String estadoCivil, Date fechaNacimiento) {
        super(idPersona, documento, tipoDoc, seguroSocial, primerNombre, segundoNombre, apellidoPaterno, apellidoMaterno, sexo,
                telefono, correoElectronico, direccion, departamento, provincia, distrito, nacionalidad, estadoCivil, fechaNacimiento);
        this.antecedentesPersonales = antecedentesPersonales;
        this.antecedentesFamiliares = antecedentesFamiliares;
        this.antecedentesObstetricos = antecedentesObstetricos;
        this.grupoSanguineo = grupoSanguineo;
    }

    public Paciente(){
    }

    public String getAntecedentesPersonales() {
        return antecedentesPersonales;
    }

    public void setAntecedentesPersonales(String antecedentesPersonales) {
        this.antecedentesPersonales = antecedentesPersonales;
    }

    public String getAntecedentesFamiliares() {
        return antecedentesFamiliares;
    }

    public void setAntecedentesFamiliares(String antecedentesFamiliares) {
        this.antecedentesFamiliares = antecedentesFamiliares;
    }

    public String getAntecedentesObstetricos() {
        return antecedentesObstetricos;
    }

    public void setAntecedentesObstetricos(String antecedentesObstetricos) {
        this.antecedentesObstetricos = antecedentesObstetricos;
    }

    public String getGrupoSanguineo() {
        return grupoSanguineo;
    }

    public void setGrupoSanguineo(String grupoSanguineo) {
        this.grupoSanguineo = grupoSanguineo;
    }

    @Override
    public String toString(){
        return "Paciente{" +
                "antecedentesPersonales='" + antecedentesPersonales + '\'' +
                ", antecedentesFamiliares='" + antecedentesFamiliares + '\'' +
                ", antecedentesObstetricos='" + antecedentesObstetricos + '\'' +
                ", grupoSanguineo='" + grupoSanguineo + '\'' +
                ", idPersona=" + getIdPersona() +
                ", documento='" + getDocumento() + '\'' +
                ", tipoDoc='" + getTipoDoc() + '\'' +
                ", seguroSocial='" + getSeguroSocial() + '\'' +
                ", primerNombre='" + getPrimerNombre() + '\'' +
                ", segundoNombre='" + getSegundoNombre() + '\'' +
                ", apellidoPaterno='" + getApellidoPaterno() + '\'' +
                ", apellidoMaterno='" + getApellidoMaterno() + '\'' +
                ", sexo='" + getSexo() + '\'' +
                ", telefono='" + getTelefono() + '\'' +
                ", correoElectronico='" + getCorreoElectronico() + '\'' +
                ", direccion='" + getDireccion() + '\'' +
                ", departamento='" + getDepartamento() + '\'' +
                ", provincia='" + getProvincia() + '\'' +
                ", distrito='" + getDistrito() + '\'' +
                ", nacionalidad='" + getNacionalidad() + '\'' +
                ", estadoCivil='" + getEstadoCivil() + '\'' +
                ", fechaNacimiento=" + getFechaNacimiento() +
                '}';
    }
}

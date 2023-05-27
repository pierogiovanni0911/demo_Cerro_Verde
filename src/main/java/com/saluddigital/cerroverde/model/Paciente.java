package com.saluddigital.cerroverde.model;

import java.time.LocalDate;

public class Paciente extends Persona {
    private int idPaciente;
    private int idHistoria;
    private String antecedentesPersonales;
    private String antecedentesFamiliares;
    private String antecedentesObstetricos;
    private String habitos;
    private String condicion;
    private String grupoSanguineo;

    public Paciente(int idPaciente, int idHistoria, String antecedentesPersonales, String antecedentesFamiliares,
            String antecedentesObstetricos, String habitos, String condicion, String grupoSanguineo, int idPersona, 
            String documento, String seguroSocial, String primerNombre, String segundoNombre, String apellidoPaterno,
            String apellidoMaterno, String sexo, String telefono, String correoElectronico, String direccion,
            String nacionalidad, String estadoCivil, LocalDate fechaNacimiento) {
        super(idPersona, documento, seguroSocial, primerNombre, segundoNombre, apellidoPaterno, apellidoMaterno, sexo,
                telefono, correoElectronico, direccion, nacionalidad, estadoCivil, fechaNacimiento);
        this.idPaciente = idPaciente;
        this.idHistoria = idHistoria;
        this.antecedentesPersonales = antecedentesPersonales;
        this.antecedentesFamiliares = antecedentesFamiliares;
        this.antecedentesObstetricos = antecedentesObstetricos;
        this.habitos = habitos;
        this.condicion = condicion;
        this.grupoSanguineo = grupoSanguineo;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public int getIdHistoria() {
        return idHistoria;
    }

    public void setIdHistoria(int idHistoria) {
        this.idHistoria = idHistoria;
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

    public String getHabitos() {
        return habitos;
    }

    public void setHabitos(String habitos) {
        this.habitos = habitos;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

    public String getGrupoSanguineo() {
        return grupoSanguineo;
    }

    public void setGrupoSanguineo(String grupoSanguineo) {
        this.grupoSanguineo = grupoSanguineo;
    }

    @Override
    public String toString(){
        return "Paciente{" + "idPaciente=" + idPaciente + ", idHistoria=" + idHistoria + 
            ", antecedentesPersonales=" + antecedentesPersonales + ", antecedentesFamiliares=" + antecedentesFamiliares + 
            ", antecedentesObstetricos=" + antecedentesObstetricos + ", habitos=" + habitos + ", condicion=" + condicion +
            ", grupoSanguineo=" + grupoSanguineo + '}';
    }
}

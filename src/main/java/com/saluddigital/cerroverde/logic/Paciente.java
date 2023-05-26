package com.saluddigital.cerroverde.logic;

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

    public Paciente() {
        super();
        idPaciente = 0;
        idHistoria = 0;
        antecedentesPersonales = "";
        antecedentesFamiliares = "";
        antecedentesObstetricos = "";
        habitos = "";
        condicion = "";
        grupoSanguineo = "";
    }

    public Paciente(int idPaciente, int idHistoria, String antecedentesPersonales, String antecedentesFamiliares,
            String antecedentesObstetricos, String habitos, String condicion, String grupoSanguineo, int idPersona,
            String tipoDocumento, String numeroDocumento, String nombres, String apellidos, String sexo,
            LocalDate fechaNacimiento, String direccion, String telefono, String correo) {
        super(idPersona, tipoDocumento, numeroDocumento, nombres, nombres, apellidos, apellidos, sexo, telefono,
                correo, direccion, telefono, correo, fechaNacimiento);
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


    
}

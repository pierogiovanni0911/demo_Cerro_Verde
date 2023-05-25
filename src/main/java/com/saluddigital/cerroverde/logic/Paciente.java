package com.saluddigital.cerroverde.logic;

import java.time.LocalDate;

public class Paciente extends Persona {
    private String antecedentesPersonales;
    private String antecedentesFamiliares;
    private String antecedentesObstetricos;
    private String habitos;
    private String condicion;

    // Constructor
    public Paciente(int id, String documento, String seguroSocial, String primerNombre, String segundoNombre,
            String apellidoPaterno, String apellidoMaterno, String sexo, String telefono, String correoElectronico,
            String direccion, String nacionalidad, String estadoCivil, LocalDate fechaNacimiento,
            String antecedentesPersonales, String antecedentesFamiliares, String antecedentesObstetricos,
            String habitos, String condicion) {
        super(id, documento, seguroSocial, primerNombre, segundoNombre, apellidoPaterno, apellidoMaterno, sexo,
                telefono, correoElectronico, direccion, nacionalidad, estadoCivil, fechaNacimiento);
        this.antecedentesPersonales = antecedentesPersonales;
        this.antecedentesFamiliares = antecedentesFamiliares;
        this.antecedentesObstetricos = antecedentesObstetricos;
        this.habitos = habitos;
        this.condicion = condicion;
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
}

package com.saluddigital.cerroverde.model;

import java.util.ArrayList;

public class Receta {
    private int idReceta;
    private ArrayList<String> medicamentos;
    private String indicaciones;
    private Paciente paciente;
    private Medico medico;

    public Receta(int idReceta, ArrayList<String> medicamentos, String indicaciones, Paciente paciente, Medico medico) {
        this.idReceta = idReceta;
        this.medicamentos = medicamentos;
        this.indicaciones = indicaciones;
        this.paciente = paciente;
        this.medico = medico;
    }

    public Receta() {
    }

    public int getIdReceta() {
        return idReceta;
    }
    public void setIdReceta(int idReceta) {
        this.idReceta = idReceta;
    }
    public ArrayList<String> getMedicamentos() {
        return medicamentos;
    }
    public void setMedicamentos(ArrayList<String> medicamentos) {
        this.medicamentos = medicamentos;
    }
    public String getIndicaciones() {
        return indicaciones;
    }
    public void setIndicaciones(String indicaciones) {
        this.indicaciones = indicaciones;
    }
    public Paciente getPaciente() {
        return paciente;
    }
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    public Medico getMedico() {
        return medico;
    }
    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    @Override
    public String toString(){
        return "Receta{" +
                "idReceta=" + idReceta +
                ", medicamentos=" + medicamentos +
                ", indicaciones='" + indicaciones + '\'' +
                ", paciente=" + paciente +
                ", medico=" + medico +
                '}';
    }
}

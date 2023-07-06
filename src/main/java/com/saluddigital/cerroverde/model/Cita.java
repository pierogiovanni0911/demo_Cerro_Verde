package com.saluddigital.cerroverde.model;

import java.time.LocalTime;
import java.util.Date;

public class Cita {
    private int idCita;
    private Date fechaCita;
    private LocalTime hora;
    private Paciente paciente;
    private Medico medico;
    private String motivo;

    public Cita(int idCita, Date fechaCita, LocalTime hora, Paciente paciente, Medico medico, String motivo) {
        this.idCita = idCita;
        this.fechaCita = fechaCita;
        this.hora = hora;
        this.paciente = paciente;
        this.medico = medico;
        this.motivo = motivo;
    }

    public Cita() {
    }

    public int getIdCita() {
        return idCita;
    }

    public void setIdCita(int idCita) {
        this.idCita = idCita;
    }

    public Date getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(Date fechaCita) {
        this.fechaCita = fechaCita;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
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

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    @Override
    public String toString(){
        return "Cita{" + "idCita=" + idCita + ", fechaCita=" + fechaCita + ", hora="
         + hora + ", paciente=" + paciente + ", medico=" + medico + ", motivo=" + motivo + '}';
    }
    
}

package com.saluddigital.cerroverde.controller;

import java.util.ArrayList;
import java.util.List;

import com.saluddigital.cerroverde.model.Paciente;

public class GestorPaciente {
    private List<Paciente> pacientes;

    public GestorPaciente() {
        pacientes = new ArrayList<Paciente>();
    }

    public void agregarPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }

    public void eliminarPaciente(Paciente paciente) {
        pacientes.remove(paciente);
    }

    public Paciente buscarPaciente(String documento) {
        for (Paciente paciente : pacientes) {
            if (paciente.getDocumento().equals(documento)) {
                return paciente;
            }
        }
        return null;
    }

    public List<Paciente> obtenerPacientes() {
        return pacientes;
    }
}

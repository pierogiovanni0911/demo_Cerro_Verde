package com.saluddigital.cerroverde.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.saluddigital.cerroverde.dao.ConnectionFactory;
import com.saluddigital.cerroverde.dao.PacienteDAO;
import com.saluddigital.cerroverde.model.Paciente;

public class PacienteController {
    private final PacienteDAO pacienteDAO;

    public PacienteController() {
        this.pacienteDAO = new PacienteDAO(new ConnectionFactory().realizarConexion());
    }

    public List<Paciente> obtenerTodosLosPacientes() throws SQLException {
        return pacienteDAO.obtenerTodosLosPacientes();
    }

    public void guardarPaciente(Paciente paciente) throws SQLException {
        pacienteDAO.insertarPaciente(paciente);
    }

    public Paciente obtenerPacientePorDocumento(String documento) throws SQLException {
        return pacienteDAO.obtenerPacientePorDocumento(documento);
    }

    public void actualizarPaciente(Paciente paciente) throws SQLException {
        pacienteDAO.actualizarPaciente(paciente);
    }

    /*public void eliminarPaciente(Paciente paciente) {
        pacientes.remove(paciente);
    }

    public Paciente buscarPaciente(String documento) {
        for (Paciente paciente : pacientes) {
            if (paciente.getDocumento().equals(documento)) {
                return paciente;
            }
        }
        return null;
    }*/
}

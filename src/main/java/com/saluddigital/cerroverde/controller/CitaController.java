package com.saluddigital.cerroverde.controller;

import java.sql.SQLException;
import java.util.List;

import com.saluddigital.cerroverde.dao.CitaDAO;
import com.saluddigital.cerroverde.dao.ConnectionFactory;
import com.saluddigital.cerroverde.model.Cita;

public class CitaController {
    private final CitaDAO citaDAO;

    public CitaController(){
        this.citaDAO = new CitaDAO(new ConnectionFactory().realizarConexion());
    }

    public List<Cita> obtenerCitasPorDocumentoPaciente(String documento) throws SQLException {
        try {
            return citaDAO.obtenerCitasPorDocumentoPaciente(documento);
        } catch (SQLException e) {
            System.out.println("Error al obtener las citas por documento del paciente");
            return null;
        }    
    }

    public void insertarCita(Cita cita) throws SQLException {
        try {
            citaDAO.insertarCita(cita);
        } catch (SQLException e) {
            System.out.println("Error al insertar la cita");
        }
    }

    public void actualizarCita(Cita cita) {
        try {
            citaDAO.actualizarCita(cita);
        } catch (SQLException e) {
            System.out.println("Error al actualizar la cita");
        }
    }

    public void eliminarCita(int idCita) {
        try {
            citaDAO.eliminarCita(idCita);
        } catch (SQLException e) {
            System.out.println("Error al eliminar la cita");
        }
    }
}

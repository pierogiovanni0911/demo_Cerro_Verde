package com.saluddigital.cerroverde.controller;

import java.sql.SQLException;

import com.saluddigital.cerroverde.dao.ConnectionFactory;
import com.saluddigital.cerroverde.dao.MedicoDAO;
import com.saluddigital.cerroverde.model.Medico;

public class MedicoController {
    private final MedicoDAO medicoDAO;

    public MedicoController() {
        this.medicoDAO = new MedicoDAO(new ConnectionFactory().realizarConexion());
    }

    public void insertarMedico(Medico medico) throws SQLException{
        medicoDAO.insertarMedico(medico);
    }

    public void obtenerTodosLosMedicos() throws SQLException {
        medicoDAO.obtenerTodosLosMedicos();
    }

    public void obtenerMedicoPorId(int idMedico) throws SQLException {
        medicoDAO.obtenerMedicoPorId(idMedico);
    }

    public void actualizarMedico(Medico medico) throws SQLException {
        medicoDAO.actualizarMedico(medico);
    }

    public void eliminarMedico(int idMedico) throws SQLException {
        medicoDAO.eliminarMedico(idMedico);
    }

    public void eliminarMedicoTotal(int idMedico) throws SQLException {
        medicoDAO.eliminarMedicoTotal(idMedico);
    }

}

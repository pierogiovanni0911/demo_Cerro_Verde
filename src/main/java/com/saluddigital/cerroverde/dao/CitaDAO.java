package com.saluddigital.cerroverde.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.saluddigital.cerroverde.model.Cita;
import com.saluddigital.cerroverde.model.Medico;
import com.saluddigital.cerroverde.model.Paciente;

import java.util.ArrayList;

public class CitaDAO {
    private final Connection connection;

    public CitaDAO(Connection connection) {
        this.connection = connection;
    }

    public void insertarCita(Cita cita) throws SQLException {
        String query = "INSERT INTO cita (fecha_cita, hora, id_paciente, id_medico, motivo) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setDate(1, new java.sql.Date(cita.getFechaCita().getTime()));
            statement.setTime(2, java.sql.Time.valueOf(cita.getHora()));
            statement.setInt(3, cita.getPaciente().getIdPaciente());
            statement.setInt(4, cita.getMedico().getIdMedico());
            statement.setString(5, cita.getMotivo());
            statement.executeUpdate();
        }
    }

    public List<Cita> obtenerCitasPorDocumentoPaciente(String documentoPaciente) throws SQLException {
        List<Cita> citas = new ArrayList<>();
        String query = "SELECT * FROM cita " +
                "INNER JOIN paciente ON cita.id_paciente = paciente.id_paciente " +
                "INNER JOIN medico ON cita.id_medico = medico.id_medico " +
                "WHERE paciente.documento = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, documentoPaciente);
            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    Cita cita = new Cita();
                    cita.setIdCita(resultSet.getInt("id_cita"));
                    cita.setFechaCita(resultSet.getDate("fecha_cita"));
                    cita.setHora(resultSet.getTime("hora").toLocalTime());
                    cita.setMotivo(resultSet.getString("motivo"));

                    // Obtener el paciente de la cita
                    Paciente paciente = new Paciente();
                    paciente.setIdPaciente(resultSet.getInt("paciente.id_paciente"));
                    paciente.setDocumento(resultSet.getString("paciente.documento"));
                    // Establecer los demás atributos del paciente...

                    // Obtener el médico de la cita
                    Medico medico = new Medico();
                    medico.setIdMedico(resultSet.getInt("medico.id_medico"));
                    medico.setNumConsultorio(resultSet.getString("medico.num_consultorio"));
                    medico.setEspecialidad(resultSet.getString("medico.especialidad"));
                    // Establecer los demás atributos del médico...

                    // Establecer el paciente y el médico en la cita
                    cita.setPaciente(paciente);
                    cita.setMedico(medico);

                    citas.add(cita);
                }
            }
        }
        return citas;
    }

    public void actualizarCita(Cita cita) throws SQLException {
        String query = "UPDATE cita SET fecha_cita = ?, hora = ?, id_paciente = ?, id_medico = ?, motivo = ? WHERE id_cita = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setDate(1, new java.sql.Date(cita.getFechaCita().getTime()));
            statement.setTime(2, java.sql.Time.valueOf(cita.getHora()));
            statement.setInt(3, cita.getPaciente().getIdPaciente());
            statement.setInt(4, cita.getMedico().getIdMedico());
            statement.setString(5, cita.getMotivo());
            statement.setInt(6, cita.getIdCita());
            statement.executeUpdate();
        }
    }

    public void eliminarCita(int idCita) throws SQLException {
        String query = "DELETE FROM cita WHERE id_cita = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, idCita);
            statement.executeUpdate();
        }
    }

}

package com.saluddigital.cerroverde.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.saluddigital.cerroverde.model.HistorialMedico;
import com.saluddigital.cerroverde.model.Receta;

public class HistorialDAO {
    private final Connection connection;

    public HistorialDAO(Connection connection) {
        this.connection = connection;
    }

    /**
     * Almacenar el modelo de HistoriaMedico en la base de datos
     * @param historialMedico
     */
    public void insertarHistorialMedico(HistorialMedico historialMedico) throws SQLException {
        String query = "INSERT INTO historias_medicas (id_historia, antecedentes_medicos, id_receta, diagnostico, tratamiento) " +
                "VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, historialMedico.getIdHistoria());
            statement.setString(2, historialMedico.getAntecedentesMedicos());
            statement.setInt(3, historialMedico.getReceta().getIdReceta());
            statement.setString(4, historialMedico.getDiagnostico());
            statement.setString(5, historialMedico.getTratamiento());
            statement.executeUpdate();
        }
    }

    /**
     * Obtener el modelo de HistoriaMedico de la base de datos por su id
     * @param idHistoria
     * @return HistoriaMedico
     * @throws SQLException
     */
    public HistorialMedico obtenerHistoriaPorId(int idHistoria) throws SQLException {
        HistorialMedico historia = null;
        String query = "SELECT * FROM historias_medicas WHERE id_historia = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, idHistoria);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    int idReceta = resultSet.getInt("id_receta");
                    RecetaDAO recetaDAO = new RecetaDAO(connection);
                    Receta receta = recetaDAO.obtenerRecetaPorId(idReceta);

                    historia = new HistorialMedico(
                            resultSet.getInt("id_historia"),
                            resultSet.getString("antecedentes_medicos"),
                            receta,
                            resultSet.getString("diagnostico"),
                            resultSet.getString("tratamiento")
                    );
                }
            }
        }
        return historia;
    }

    /**
     * Actualizar el modelo de HistoriaMedico en la base de datos
     * @param historia
     * @throws SQLException
     */
    public void actualizarHistoria(HistorialMedico historia) throws SQLException {
        String query = "UPDATE historias_medicas SET antecedentes_medicos = ?, id_receta = ?, diagnostico = ?, tratamiento = ? " +
                "WHERE id_historia = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, historia.getAntecedentesMedicos());
            statement.setInt(2, historia.getReceta().getIdReceta());
            statement.setString(3, historia.getDiagnostico());
            statement.setString(4, historia.getTratamiento());
            statement.setInt(5, historia.getIdHistoria());
            statement.executeUpdate();
        }
    }

    /**
     * Eliminar el modelo de HistoriaMedico de la base de datos por su id
     * @param idHistoria
     * @throws SQLException
     */
    public void eliminarHistoria(int idHistoria) throws SQLException {
        String query = "DELETE FROM historias_medicas WHERE id_historia = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, idHistoria);
            statement.executeUpdate();
        }
    }
}

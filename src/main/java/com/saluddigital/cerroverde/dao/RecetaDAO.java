package com.saluddigital.cerroverde.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.saluddigital.cerroverde.model.Medico;
import com.saluddigital.cerroverde.model.Paciente;
import com.saluddigital.cerroverde.model.Receta;

public class RecetaDAO {
    private Connection connection;

    public RecetaDAO(Connection connection) {
        this.connection = connection;
    }

    public void insertarReceta(Receta receta) throws SQLException {
        String query = "INSERT INTO receta (medicamentos, indicaciones, id_paciente, id_medico) VALUES (?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, convertirListaMedicamentos(receta.getMedicamentos()));
            statement.setString(2, receta.getIndicaciones());
            statement.setInt(3, receta.getPaciente().getIdPaciente());
            statement.setInt(4, receta.getMedico().getIdMedico());
            statement.executeUpdate();
        }
    }

    public void actualizarReceta(Receta receta) throws SQLException {
        String query = "UPDATE receta SET medicamentos = ?, indicaciones = ?, id_paciente = ?, id_medico = ? WHERE id_receta = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, convertirListaMedicamentos(receta.getMedicamentos()));
            statement.setString(2, receta.getIndicaciones());
            statement.setInt(3, receta.getPaciente().getIdPaciente());
            statement.setInt(4, receta.getMedico().getIdMedico());
            statement.setInt(5, receta.getIdReceta());
            statement.executeUpdate();
        }
    }

    public void eliminarReceta(int idReceta) throws SQLException {
        String query = "DELETE FROM receta WHERE id_receta = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, idReceta);
            statement.executeUpdate();
        }
    }

    public Receta obtenerRecetaPorId(int idReceta) throws SQLException {
    String query = "SELECT * FROM receta WHERE id_receta = ?";
    try (PreparedStatement statement = connection.prepareStatement(query)) {
        statement.setInt(1, idReceta);
        try (ResultSet resultSet = statement.executeQuery()) {
            if (resultSet.next()) {
                Receta receta = new Receta();
                receta.setIdReceta(resultSet.getInt("id_receta"));
                receta.setIndicaciones(resultSet.getString("indicaciones"));

                // Obtener el paciente de la receta
                Paciente paciente = new Paciente();
                paciente.setIdPaciente(resultSet.getInt("paciente.id_paciente"));
                // Establecer los demás atributos del paciente...

                // Obtener el médico de la receta
                Medico medico = new Medico();
                medico.setIdMedico(resultSet.getInt("medico.id_medico"));
                // Establecer los demás atributos del médico...

                // Establecer el paciente y el médico en la receta
                receta.setPaciente(paciente);
                receta.setMedico(medico);

                // Obtener los medicamentos como una lista de cadenas
                String medicamentosString = resultSet.getString("medicamentos");
                ArrayList<String> medicamentos = new ArrayList<>(Arrays.asList(medicamentosString.split(",")));
                receta.setMedicamentos(medicamentos);

                return receta;
            }
        }
    }
    return null;
}

    // public List<Receta> obtenerRecetasPorPaciente(int idPaciente) throws SQLException {
    //     String query = "SELECT * FROM receta WHERE id_paciente = ?";
    //     try (PreparedStatement statement = connection.prepareStatement(query)) {
    //         statement.setInt(1, idPaciente);
    //         try (ResultSet resultSet = statement.executeQuery()) {
    //             List<Receta> recetas = new ArrayList<>();
    //             while (resultSet.next()) {
    //                 recetas.add(crearRecetaDesdeResultSet(resultSet));
    //             }
    //             return recetas;
    //         }
    //     }
    // }

    // private Receta crearRecetaDesdeResultSet(ResultSet resultSet) throws SQLException {
    //     int idReceta = resultSet.getInt("id_receta");
    //     String medicamentosString = resultSet.getString("medicamentos");
    //     ArrayList<String> medicamentos = convertirStringAMedicamentos(medicamentosString);
    //     String indicaciones = resultSet.getString("indicaciones");
    //     int idPaciente = resultSet.getInt("id_paciente");
    //     int idMedico = resultSet.getInt("id_medico");
    //     PacienteDAO pacienteDAO = new PacienteDAO(connection);
    //     MedicoDAO medicoDAO = new MedicoDAO(connection);
    //     Paciente paciente = pacienteDAO.obtenerPacientePorId(idPaciente);
    //     Medico medico = medicoDAO.obtenerMedicoPorId(int idMedico);
    //     return new Receta(idReceta, medicamentos, indicaciones, paciente, medico);
    // }

    private String convertirListaMedicamentos(ArrayList<String> medicamentos) {
        StringBuilder sb = new StringBuilder();
        for (String medicamento : medicamentos) {
            sb.append(medicamento);
            sb.append(",");
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1); // Eliminar la última coma
        }
        return sb.toString();
    }

    private ArrayList<String> convertirStringAMedicamentos(String medicamentosString) {
        String[] medicamentosArray = medicamentosString.split(",");
        ArrayList<String> medicamentos = new ArrayList<>();
        for (String medicamento : medicamentosArray) {
            medicamentos.add(medicamento);
        }
        return medicamentos;
    }
}

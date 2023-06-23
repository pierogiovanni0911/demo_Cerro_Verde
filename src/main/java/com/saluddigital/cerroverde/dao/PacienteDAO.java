package com.saluddigital.cerroverde.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.saluddigital.cerroverde.model.Paciente;

public class PacienteDAO {
    private Connection connection;

    public PacienteDAO(Connection connection){
        this.connection = connection;
    }

    public void insertarPaciente(Paciente paciente) throws SQLException{
        PersonaDAO personaDAO = new PersonaDAO(connection);
        personaDAO.insertarPersona(paciente);
        int idPersona = personaDAO.obtenerUltimoIdPersona();        
        
        int ultimoIdHistoria = obtenerUltimoIdHistoria();
        int nuevoIdHistoria = ultimoIdHistoria++;

        // Insertar info del paciente en tabla paciente
        String query = "INSERT INTO paciente (id_persona, grupo_sanguineo, id_historia) " +
                "VALUES (?, ?, ?)";
        try(PreparedStatement statement = connection.prepareStatement(query)){
            statement.setInt(1, idPersona);
            statement.setString(2, paciente.getGrupoSanguineo());
            statement.setInt(3, nuevoIdHistoria);
            statement.executeUpdate();
        }
    }

    public List<Paciente> obtenerTodosLosPacientes() throws SQLException {
        List<Paciente> pacientes = new ArrayList<>();
        String query = "SELECT * FROM paciente JOIN persona ON paciente.id_persona = persona.id_persona";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    Paciente paciente = new Paciente();
                    paciente.setIdPaciente(resultSet.getInt("id_paciente"));
                    paciente.setGrupoSanguineo(resultSet.getString("grupo_sanguineo"));
                    
                    // Obtener la información de la persona relacionada
                    paciente.setDocumento(resultSet.getString("documento"));
                    paciente.setNombre(resultSet.getString("nombre"));
                    paciente.setApellido(resultSet.getString("apellido"));
                    paciente.setSeguroSocial(resultSet.getString("seguro_social"));
                    paciente.setSexo(resultSet.getString("sexo"));
                    paciente.setTelefono(resultSet.getString("telefono"));
                    paciente.setCorreoElectronico(resultSet.getString("correo_electronico"));
                    paciente.setDireccion(resultSet.getString("direccion"));
                    paciente.setDepartamento(resultSet.getString("departamento"));
                    paciente.setProvincia(resultSet.getString("provincia"));
                    paciente.setDistrito(resultSet.getString("distrito"));
                    paciente.setEstadoCivil(resultSet.getString("estado_civil"));
                    paciente.setFechaNacimiento(resultSet.getDate("fecha_nacimiento"));
                    
                    pacientes.add(paciente);
                }
            }
        }
        return pacientes;
    }

    public Paciente obtenerPacientePorDocumento(String documento) throws SQLException {
        Paciente paciente = null;
        String query = "SELECT * FROM paciente JOIN persona ON paciente.id_persona = persona.id_persona WHERE persona.documento = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, documento);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    paciente = new Paciente();
                    paciente.setIdPaciente(resultSet.getInt("id_paciente"));
                    paciente.setGrupoSanguineo(resultSet.getString("grupo_sanguineo"));

                    // Obtener la información de la persona relacionada
                    paciente.setDocumento(resultSet.getString("documento"));
                    paciente.setNombre(resultSet.getString("nombre"));
                    paciente.setApellido(resultSet.getString("apellido"));
                    paciente.setSeguroSocial(resultSet.getString("seguro_social"));
                    paciente.setSexo(resultSet.getString("sexo"));
                    paciente.setTelefono(resultSet.getString("telefono"));
                    paciente.setCorreoElectronico(resultSet.getString("correo_electronico"));
                    paciente.setDireccion(resultSet.getString("direccion"));
                    paciente.setDepartamento(resultSet.getString("departamento"));
                    paciente.setProvincia(resultSet.getString("provincia"));
                    paciente.setDistrito(resultSet.getString("distrito"));
                    paciente.setEstadoCivil(resultSet.getString("estado_civil"));
                    paciente.setFechaNacimiento(resultSet.getDate("fecha_nacimiento"));
                }
            }
        }
        return paciente;
    }

    public void actualizarPaciente(Paciente paciente) throws SQLException {
        PersonaDAO personaDAO = new PersonaDAO(connection);
        personaDAO.actualizarPersona(paciente);

        String query = "UPDATE paciente SET grupo_sanguineo = ? WHERE id_paciente = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, paciente.getGrupoSanguineo());
            statement.executeUpdate();
        }
    }

    private int obtenerUltimoIdHistoria() throws SQLException {
        String query = "SELECT MAX(id_historia) FROM paciente";
        try (Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query)) {
            if (resultSet.next()) {
                return resultSet.getInt(1);
            }
            // Si no se encuentra ningún registro, se retorna 0
            return 0;
        }
    }

    
}

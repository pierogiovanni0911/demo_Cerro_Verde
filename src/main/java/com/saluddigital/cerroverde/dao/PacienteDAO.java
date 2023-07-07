package com.saluddigital.cerroverde.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.saluddigital.cerroverde.model.Paciente;

/**
 * Definiendo la capa Data Acess Object la cual permite acceder a los
 * atributos de la clase Paciente e interactuar con las operaciones
 * en Base de datos
 * 
 * @author piero
 *
 */
public class PacienteDAO {
    private final Connection connection;

    public PacienteDAO(Connection connection) {
        this.connection = connection;
    }

    /**
     * Permite almacenar el modelo de datos de Paciente, en la tabla "paciente"
     * 
     * @param paciente
     * @throws SQLException
     */
    public void insertarPaciente(Paciente paciente) throws SQLException {
        PersonaDAO personaDAO = new PersonaDAO(connection);
        personaDAO.insertarPersona(paciente);
        int idPersona = personaDAO.obtenerUltimoIdPersona();

        int ultimoIdHistoria = obtenerUltimoIdHistoria();
        int nuevoIdHistoria = ultimoIdHistoria++;

        // Insertar info del paciente en tabla paciente
        String query = "INSERT INTO paciente (id_persona, grupo_sanguineo, id_historia) " +
                "VALUES (?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, idPersona);
            statement.setString(2, paciente.getGrupoSanguineo());
            statement.setInt(3, nuevoIdHistoria);
            statement.executeUpdate();
        }
    }

    /**
     * Obtiene todos los pacientes registrados en la tabla "paciente"
     * 
     * @return List<Paciente>
     * @throws SQLException
     */
    public List<Paciente> obtenerTodosLosPacientes() throws SQLException {
        List<Paciente> pacientes = new ArrayList<>();
        String query = "SELECT * FROM paciente JOIN persona ON paciente.id_persona = persona.id_persona";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    Paciente paciente = new Paciente();
                    paciente.setIdPaciente(resultSet.getInt("id_paciente"));
                    paciente.setGrupoSanguineo(resultSet.getString("grupo_sanguineo"));

                    // Obtener la informaci�n de la persona relacionada
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

    /**
     * Obtiene un paciente por su documento
     * 
     * @param documento
     * @return Paciente
     * @throws SQLException
     */
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

                    // Obtener la informaciÃ³n de la persona relacionada
                    paciente.setIdPersona(resultSet.getInt("id_persona"));
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

    /**
     * Obtiene paciente por el apellido
     * 
     * @param apellido
     * @return List<Paciente>
     * @throws SQLException
     */
    public List<Paciente> obtenerPacientesPorApellido(String apellido) throws SQLException {
        List<Paciente> pacientes = new ArrayList<>();
        String query = "SELECT * FROM paciente JOIN persona ON paciente.id_persona = persona.id_persona WHERE persona.apellido LIKE ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, "%" + apellido + "%");
            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    Paciente paciente = new Paciente();
                    paciente.setIdPaciente(resultSet.getInt("id_paciente"));
                    paciente.setGrupoSanguineo(resultSet.getString("grupo_sanguineo"));
                    // paciente.setHistorialMedico(resultSet.getInt("ïd_historia"));

                    // Obtener la información de la persona relacionada
                    paciente.setIdPersona(resultSet.getInt("id_persona"));
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

    /**
     * Actualiza la informacion de un paciente
     * 
     * @param paciente
     * @throws SQLException
     */
    public void actualizarPaciente(Paciente paciente) throws SQLException {
        PersonaDAO personaDAO = new PersonaDAO(connection);
        personaDAO.actualizarPersona(paciente);

        String query = "UPDATE paciente SET grupo_sanguineo = ? WHERE id_paciente = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, paciente.getGrupoSanguineo());
            statement.executeUpdate();
        }
    }

    /**
     * Elimina un paciente por su id
     * 
     * @return
     * @throws SQLException
     */
    public void eliminarPaciente(int idPaciente) throws SQLException {
        // Eliminar el registro del paciente en la tabla "paciente"
        String deletePacienteQuery = "DELETE FROM paciente WHERE id_paciente = ?";
        try {
            connection.setAutoCommit(false); // Deshabilita el modo de confirmación automática
            try (PreparedStatement deletePacienteStatement = connection.prepareStatement(deletePacienteQuery)) {
            deletePacienteStatement.setInt(1, idPaciente);
            deletePacienteStatement.executeUpdate();
            }            
            connection.commit();
        } catch (SQLException e) {
            connection.rollback();
            throw e;
        } finally {
            connection.setAutoCommit(true); // Habilita el modo de confirmación automática
        }
    }

    /**
     * Elimina un paciente y su persona asociada
     * @param idPaciente
     * @throws SQLException
     */
    public void eliminarPacienteTotal(int idPaciente) throws SQLException {
        try {
            // Obtener info de la persona asociada al paciente
            int idPersona = obtenerIdPersonaPorIdPaciente(idPaciente);

            // Eliminaar paciente de la tabla "paciente"
            eliminarPaciente(idPaciente);
            
            // Eliminar persona de la tabla "persona"
            PersonaDAO personaDAO = new PersonaDAO(connection);
            personaDAO.eliminarPersona(idPersona);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    private int obtenerUltimoIdHistoria() throws SQLException {
        String query = "SELECT MAX(id_historia) FROM paciente";
        try (Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(query)) {
            if (resultSet.next()) {
                return resultSet.getInt(1);
            }
            // Si no se encuentra ningï¿½n registro, se retorna 0
            return 0;
        }
    }

    private int obtenerIdPersonaPorIdPaciente(int idPaciente) throws SQLException {
        String query = "SELECT id_persona FROM paciente WHERE id_paciente = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)){
            statement.setInt(1, idPaciente);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()){
                    return resultSet.getInt("id_persona");
                }
            }
        }
        return 0;
    }
}

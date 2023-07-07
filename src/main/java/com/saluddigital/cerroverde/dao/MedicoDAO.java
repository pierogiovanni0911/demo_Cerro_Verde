package com.saluddigital.cerroverde.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.saluddigital.cerroverde.model.Medico;

public class MedicoDAO {
    private final Connection connection;

    public MedicoDAO(Connection connection) {
        this.connection = connection;
    }

    /**
     * Inserta un medico en la base de datos
     * @param medico
     * @throws SQLException
     */
    public void insertarMedico(Medico medico) throws SQLException {
        PersonaDAO personaDAO = new PersonaDAO(connection);
        personaDAO.insertarPersona(medico);
        //int idPersona = personaDAO.obtenerUltimoIdPersona();

        EmpleadoDAO empleadoDAO = new EmpleadoDAO(connection);
        empleadoDAO.insertarEmpleado(medico);
        int idEmpleado = empleadoDAO.obtenerUltimoIdEmpleado();

        String query = "INSERT INTO medico (id_empleado, num_consultorio, especialidad) VALUES (?, ?, ?)";
        try(PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, idEmpleado);
            statement.setString(2, medico.getNumConsultorio());
            statement.setString(3, medico.getEspecialidad());
            statement.executeUpdate();
        }
    }

    public List<Medico> obtenerTodosLosMedicos() throws SQLException {
        List<Medico> medicos = new ArrayList<>();
        String query = "SELECT * FROM medico JOIN empleado ON medico.id_empleado = empleado.id_empleado " +
                "JOIN persona ON empleado.id_persona = persona.id_persona";
        try (PreparedStatement statement = connection.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                Medico medico = new Medico();
                medico.setIdMedico(resultSet.getInt("id_medico"));
                medico.setNumConsultorio(resultSet.getString("num_consultorio"));
                medico.setEspecialidad(resultSet.getString("especialidad"));

                medico.setIdEmpleado(resultSet.getInt("id_empleado"));
                medico.setFechaIngreso(resultSet.getDate("fecha_ingreso"));
                medico.setArea(resultSet.getString("area"));
                medico.setCargo(resultSet.getString("cargo"));
                medico.setUsername(resultSet.getString("username"));
                medico.setPassword(resultSet.getString("password"));

                medico.setIdPersona(resultSet.getInt("id_persona"));
                medico.setDocumento(resultSet.getString("documento"));
                medico.setNombre(resultSet.getString("nombre"));
                medico.setApellido(resultSet.getString("apellido"));
                medico.setSeguroSocial(resultSet.getString("seguro_social"));
                medico.setSexo(resultSet.getString("sexo"));
                medico.setTelefono(resultSet.getString("telefono"));
                medico.setCorreoElectronico(resultSet.getString("correo_electronico"));
                medico.setDireccion(resultSet.getString("direccion"));
                medico.setFechaNacimiento(resultSet.getDate("fecha_nacimiento"));

                medicos.add(medico);
            }
        }
        return medicos;
    }

    /**
     * Obtener medico por id
     * @param idMedico
     * @return Medico
     * @throws SQLException
     */
    public Medico obtenerMedicoPorId(int idMedico) throws SQLException {
        Medico medico = null;
        String query = "SELECT * FROM medico JOIN empleado ON medico.id_empleado = empleado.id_empleado " +
                "JOIN persona ON empleado.id_persona = persona.id_persona WHERE id_medico = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, idMedico);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    medico = new Medico();
                    medico.setIdMedico(resultSet.getInt("id_medico"));
                    medico.setNumConsultorio(resultSet.getString("num_consultorio"));
                    medico.setEspecialidad(resultSet.getString("especialidad"));

                    medico.setIdEmpleado(resultSet.getInt("id_empleado"));
                    medico.setFechaIngreso(resultSet.getDate("fecha_ingreso"));
                    medico.setArea(resultSet.getString("area"));
                    medico.setCargo(resultSet.getString("cargo"));
                    medico.setUsername(resultSet.getString("username"));
                    medico.setPassword(resultSet.getString("password"));

                    medico.setIdPersona(resultSet.getInt("id_persona"));
                    medico.setDocumento(resultSet.getString("documento"));
                    medico.setNombre(resultSet.getString("nombre"));
                    medico.setApellido(resultSet.getString("apellido"));
                    medico.setSeguroSocial(resultSet.getString("seguro_social"));
                    medico.setSexo(resultSet.getString("sexo"));
                    medico.setTelefono(resultSet.getString("telefono"));
                    medico.setCorreoElectronico(resultSet.getString("correo_electronico"));
                    medico.setDireccion(resultSet.getString("direccion"));
                    medico.setDepartamento(resultSet.getString("departamento"));
                    medico.setProvincia(resultSet.getString("provincia"));
                    medico.setDistrito(resultSet.getString("distrito"));
                    medico.setEstadoCivil(resultSet.getString("estado_civil"));
                    medico.setFechaNacimiento(resultSet.getDate("fecha_nacimiento"));
                }
            }
        }
        return medico;
    }

    public void actualizarMedico(Medico medico) throws SQLException {
        PersonaDAO personaDAO = new PersonaDAO(connection);
        personaDAO.actualizarPersona(medico);

        EmpleadoDAO empleadoDAO = new EmpleadoDAO(connection);
        empleadoDAO.actualizarEmpleado(medico);

        String query = "UPDATE medico SET num_consultorio = ?, especialidad = ? WHERE id_medico = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, medico.getNumConsultorio());
            statement.setString(2, medico.getEspecialidad());
            statement.setInt(3, medico.getIdMedico());
            statement.executeUpdate();
        }
    }

    public void eliminarMedico(int idMedico) throws SQLException {
        String query = "DELETE FROM medico WHERE id_medico = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, idMedico);
            statement.executeUpdate();
        }
    }

    public void eliminarMedicoTotal(int idMedico) throws SQLException {
        try {
            EmpleadoDAO empleadoDAO = new EmpleadoDAO(connection);
            int idEmpleado = obtenerIdEmpleadoPorIdMedico(idMedico);
            
            eliminarMedico(idMedico);
            empleadoDAO.eliminarEmpleadoTotal(idEmpleado);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public int obtenerIdEmpleadoPorIdMedico(int idMedico) throws SQLException {
        String query = "SELECT id_empleado FROM medico WHERE id_medico = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, idMedico);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    return resultSet.getInt("id_empleado");
                }
            }
        }
        return 0;
    }
}


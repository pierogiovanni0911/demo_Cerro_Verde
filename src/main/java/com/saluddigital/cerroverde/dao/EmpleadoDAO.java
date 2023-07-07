package com.saluddigital.cerroverde.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.saluddigital.cerroverde.model.Empleado;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EmpleadoDAO {
    private final Connection connection;

    public EmpleadoDAO(Connection connection) {
        this.connection = connection;
    }

    /**
     * Inserta un empleado en la base de datos.
     * 
     * @param empleado
     * @throws SQLException
     */
    public void insertarEmpleado(Empleado empleado) throws SQLException {
        PersonaDAO personaDAO = new PersonaDAO(connection);
        personaDAO.insertarPersona(empleado);
        int idPersona = personaDAO.obtenerUltimoIdPersona();

        // Insertar info del empleado
        String query = "INSERT INTO empleado (id_persona, fecha_ingreso, area, cargo, username, password) VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, idPersona);
            statement.setDate(2, new java.sql.Date(empleado.getFechaIngreso().getTime()));
            statement.setString(3, empleado.getArea());
            statement.setString(4, empleado.getCargo());
            statement.setString(5, empleado.getUsername());
            statement.setString(6, empleado.getPassword());
            statement.executeUpdate();
        }
    }

    /**
     * Obtener todos los empleados de la base de datos
     * 
     * @return List<Empleado>
     * @throws SQLException
     */
    public List<Empleado> obtenerTodosLosEmpleados() throws SQLException {
        List<Empleado> empleados = new ArrayList<>();
        String query = "SELECT * FROM empleado JOIN persona ON empleado.id_persona = persona.id_persona";
        try (PreparedStatement statement = connection.prepareStatement(query);
                ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                Empleado empleado = new Empleado();
                empleado.setIdEmpleado(resultSet.getInt("id_empleado"));
                empleado.setFechaIngreso(resultSet.getDate("fecha_ingreso"));
                empleado.setArea(resultSet.getString("area"));
                empleado.setCargo(resultSet.getString("cargo"));
                empleado.setUsername(resultSet.getString("username"));
                empleado.setPassword(resultSet.getString("password"));

                // Obtener la información de la persona relacionada
                empleado.setIdPersona(resultSet.getInt("id_persona"));
                empleado.setDocumento(resultSet.getString("documento"));
                empleado.setNombre(resultSet.getString("nombre"));
                empleado.setApellido(resultSet.getString("apellido"));
                empleado.setSeguroSocial(resultSet.getString("seguro_social"));
                empleado.setSexo(resultSet.getString("sexo"));
                empleado.setTelefono(resultSet.getString("telefono"));
                empleado.setCorreoElectronico(resultSet.getString("correo_electronico"));
                empleado.setDireccion(resultSet.getString("direccion"));
                empleado.setDepartamento(resultSet.getString("departamento"));
                empleado.setProvincia(resultSet.getString("provincia"));
                empleado.setDistrito(resultSet.getString("distrito"));
                empleado.setEstadoCivil(resultSet.getString("estado_civil"));
                empleado.setFechaNacimiento(resultSet.getDate("fecha_nacimiento"));

                empleados.add(empleado);
            }
        }
        return empleados;
    }

    /**
     * Permite obtener un empleado por su id
     * 
     * @param idEmpleado
     * @return Empleado
     * @throws SQLException
     */
    public Empleado obtenerEmpleadoPorId(int idEmpleado) throws SQLException {
        Empleado empleado = null;
        String query = "SELECT * FROM empleado JOIN persona ON empleado.id_persona = persona.id_persona WHERE id_empleado = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, idEmpleado);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    empleado = new Empleado();
                    empleado.setIdEmpleado(resultSet.getInt("id_empleado"));
                    empleado.setFechaIngreso(resultSet.getDate("fecha_ingreso"));
                    empleado.setArea(resultSet.getString("area"));
                    empleado.setCargo(resultSet.getString("cargo"));
                    empleado.setUsername(resultSet.getString("username"));
                    empleado.setPassword(resultSet.getString("password"));

                    // Obtener la información de la persona relacionada
                    empleado.setIdPersona(resultSet.getInt("id_persona"));
                    empleado.setDocumento(resultSet.getString("documento"));
                    empleado.setNombre(resultSet.getString("nombre"));
                    empleado.setApellido(resultSet.getString("apellido"));
                    empleado.setSeguroSocial(resultSet.getString("seguro_social"));
                    empleado.setSexo(resultSet.getString("sexo"));
                    empleado.setTelefono(resultSet.getString("telefono"));
                    empleado.setCorreoElectronico(resultSet.getString("correo_electronico"));
                    empleado.setDireccion(resultSet.getString("direccion"));
                    empleado.setDepartamento(resultSet.getString("departamento"));
                    empleado.setProvincia(resultSet.getString("provincia"));
                    empleado.setDistrito(resultSet.getString("distrito"));
                    empleado.setEstadoCivil(resultSet.getString("estado_civil"));
                    empleado.setFechaNacimiento(resultSet.getDate("fecha_nacimiento"));
                }
            }
        }
        return empleado;
    }

    /**
     * Actualiza datos de un empleado en la base de datos
     * 
     * @param empleado
     * @throws SQLException
     */
    public void actualizarEmpleado(Empleado empleado) throws SQLException {
        PersonaDAO personaDAO = new PersonaDAO(connection);
        personaDAO.actualizarPersona(empleado);

        String query = "UPDATE empleado SET fecha_ingreso = ?, area = ?, cargo = ?, username = ?, password = ? WHERE id_empleado = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setDate(1, new java.sql.Date(empleado.getFechaIngreso().getTime()));
            statement.setString(2, empleado.getArea());
            statement.setString(3, empleado.getCargo());
            statement.setString(4, empleado.getUsername());
            statement.setString(5, empleado.getPassword());
            statement.setInt(6, empleado.getIdEmpleado());
            statement.executeUpdate();
        }
    }

    /**
     * Elimina un empleado de la base de datos según su id
     * 
     * @param idEmpleado
     * @throws SQLException
     */
    public void eliminarEmpleado(int idEmpleado) throws SQLException {
        String query = "DELETE FROM empleado WHERE id_empleado = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, idEmpleado);
            statement.executeUpdate();
        }
    }

    /**
     * Elimina un empleado y su persona asociada
     * @param idEmpleado
     * @throws SQLException
     */
    public void eliminarEmpleadoTotal(int idEmpleado) throws SQLException {
        try {
            // Obtener el id de la persona asociada al empleado
            int idPersona = obtenerIdPersonaPorIdEmpleado(idEmpleado);

            // Eliminar el empleado
            eliminarEmpleado(idEmpleado);

            // Elimina la persona de la tabla persona
            PersonaDAO personaDAO = new PersonaDAO(connection);
            personaDAO.eliminarPersona(idPersona);
        } catch (Exception e){
            e.printStackTrace();
            throw e;
        }
        
    }

    private int obtenerIdPersonaPorIdEmpleado(int idEmpleado) throws SQLException {
        String query = "SELECT id_persona FROM empleado WHERE id_empleado = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, idEmpleado);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    return resultSet.getInt("id_persona");
                }
            }
        }
        return 0;
    }

    public int obtenerUltimoIdEmpleado() throws SQLException {
        int ultimoId = 0;
        String query = "SELECT MAX(id_empleado) AS ultimo_id FROM empleado";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    ultimoId = resultSet.getInt("ultimo_id");
                }
            }
        }
        return ultimoId;

    }
}

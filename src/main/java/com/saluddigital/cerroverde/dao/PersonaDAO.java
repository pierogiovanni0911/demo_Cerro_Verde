package com.saluddigital.cerroverde.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import com.saluddigital.cerroverde.model.Persona;

public class PersonaDAO {
    private Connection connection;

    public PersonaDAO(Connection connection){
        this.connection = connection;
    }

    public void insertarPersona(Persona persona) throws SQLException{
        String query = "INSERT INTO persona (documento, nombre, apellido, seguro_social, sexo, telefono, correo_electronico, direccion, departamento, provincia, distrito, estado_civil, fecha_nacimiento) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try(PreparedStatement statement = connection.prepareStatement(query)){
            statement.setString(1, persona.getDocumento());
            statement.setString(2, persona.getNombre());
            statement.setString(3, persona.getApellido());
            statement.setString(4, persona.getSeguroSocial());
            statement.setString(5, persona.getSexo());
            statement.setString(6, persona.getTelefono());
            statement.setString(7, persona.getCorreoElectronico());
            statement.setString(8, persona.getDireccion());
            statement.setString(9, persona.getDepartamento());
            statement.setString(10, persona.getProvincia());
            statement.setString(11, persona.getDistrito());
            statement.setString(12, persona.getEstadoCivil());
            statement.setDate(13, new java.sql.Date(persona.getFechaNacimiento().getTime()));
            statement.executeUpdate();            
        }
    }

    public List<Persona> obtenerTodasLasPersonas() throws SQLException{
        String query = "SELECT * FROM persona";
        List<Persona> personas = new ArrayList<>();
        try {
            try(PreparedStatement statement = connection.prepareStatement(query)){
                try(ResultSet resultSet = statement.executeQuery()){
                    while(resultSet.next()){
                        Persona persona = new Persona();
                        persona.setDocumento(resultSet.getString("documento"));
                        persona.setNombre(resultSet.getString("nombre"));
                        persona.setApellido(resultSet.getString("apellido"));
                        persona.setSeguroSocial(resultSet.getString("seguro_social"));
                        persona.setSexo(resultSet.getString("sexo"));
                        persona.setTelefono(resultSet.getString("telefono"));
                        persona.setCorreoElectronico(resultSet.getString("correo_electronico"));
                        persona.setDireccion(resultSet.getString("direccion"));
                        persona.setDepartamento(resultSet.getString("departamento"));
                        persona.setProvincia(resultSet.getString("provincia"));
                        persona.setDistrito(resultSet.getString("distrito"));
                        persona.setEstadoCivil(resultSet.getString("estado_civil"));
                        persona.setFechaNacimiento(resultSet.getDate("fecha_nacimiento"));
                        personas.add(persona);
                    }
                }
            }
            return personas;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(
                null,
                "Intentelo más tarde",
                "Error al traer datos",
                JOptionPane.ERROR_MESSAGE
            );
            throw new RuntimeException(e);
        }
    }

    public int obtenerUltimoIdPersona() throws SQLException{
        int ultimoId = 0;
        String query = "SELECT MAX(id_persona) AS ultimo_id FROM persona";
        try (PreparedStatement statement = connection.prepareStatement(query)){
            try(ResultSet resultSet = statement.executeQuery()){
                if(resultSet.next()){
                    ultimoId = resultSet.getInt("ultimo_id");
                }
            }
        }
        return ultimoId;
    }

    public void actualizarPersona(Persona persona) throws SQLException {
    String query = "UPDATE persona SET documento = ?, nombre = ?, apellido = ?, seguro_social = ?, sexo = ?, telefono = ?, correo_electronico = ?, direccion = ?, departamento = ?, provincia = ?, distrito = ?, estado_civil = ?, fecha_nacimiento = ? WHERE id_persona = ?";
    try (PreparedStatement statement = connection.prepareStatement(query)) {
        statement.setString(1, persona.getDocumento());
        statement.setString(2, persona.getNombre());
        statement.setString(3, persona.getApellido());
        statement.setString(4, persona.getSeguroSocial());
        statement.setString(5, persona.getSexo());
        statement.setString(6, persona.getTelefono());
        statement.setString(7, persona.getCorreoElectronico());
        statement.setString(8, persona.getDireccion());
        statement.setString(9, persona.getDepartamento());
        statement.setString(10, persona.getProvincia());
        statement.setString(11, persona.getDistrito());
        statement.setString(12, persona.getEstadoCivil());
        statement.setDate(13, new java.sql.Date(persona.getFechaNacimiento().getTime()));
        statement.setInt(14, persona.getIdPersona());
        statement.executeUpdate();
    }
}

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.saluddigital.cerroverde.main;

import java.sql.Connection;
import java.sql.SQLException;

import com.saluddigital.cerroverde.dao.ConnectionFactory;
import com.saluddigital.cerroverde.dao.PacienteDAO;
import com.saluddigital.cerroverde.dao.PersonaDAO;
import com.saluddigital.cerroverde.model.Paciente;
import com.saluddigital.cerroverde.model.Persona;

/**
 *
 * @author piero
 */
public class Main {
    public static void main(String[] args) {
        ConnectionFactory connectionFactory = new ConnectionFactory();
        try (Connection connection = connectionFactory.realizarConexion()) {
            Paciente paciente = new Paciente();
            // Establece los demás atributos del paciente según tus necesidades
            paciente.setDocumento("12345678");
            paciente.setNombre("Jose");
            paciente.setApellido("Campos");
            paciente.setSeguroSocial("55555");
            paciente.setSexo("M");
            paciente.setTelefono("123456789");
            paciente.setCorreoElectronico("");
            paciente.setDireccion("");
            paciente.setDepartamento("");
            paciente.setProvincia("");
            paciente.setDistrito("");
            paciente.setEstadoCivil("Casado");
            paciente.setFechaNacimiento(new java.util.Date());
            paciente.setGrupoSanguineo("O+");

            PacienteDAO pacienteDAO = new PacienteDAO(connection);
            pacienteDAO.insertarPaciente(paciente);
            System.out.println("¡Registro de paciente insertado correctamente!");
        } catch (SQLException e) {
            System.out.println("Error al insertar el registro del paciente: " + e.getMessage());
        }
    }
}

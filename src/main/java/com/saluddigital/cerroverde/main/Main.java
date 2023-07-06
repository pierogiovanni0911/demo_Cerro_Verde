/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.saluddigital.cerroverde.main;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

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

        // Crear un paciente
        // try (Connection connection = connectionFactory.realizarConexion()) {
        //     Paciente paciente = new Paciente();
        //     // Establece los demás atributos del paciente según tus necesidades
        //     paciente.setDocumento("77816153");
        //     paciente.setNombre("Alonso Martin");
        //     paciente.setApellido("Aguilar Perez");
        //     paciente.setSeguroSocial("9999999");
        //     paciente.setSexo("M");
        //     paciente.setTelefono("955324352");
        //     paciente.setCorreoElectronico("martin123@gmail.com");
        //     paciente.setDireccion("Calle Los Pinos 123");
        //     paciente.setDepartamento("Lima");
        //     paciente.setProvincia("Lima");
        //     paciente.setDistrito("Miraflores");
        //     paciente.setEstadoCivil("Casado");
        //     paciente.setFechaNacimiento(new java.util.Date());
        //     paciente.setGrupoSanguineo("O+");

        //     PacienteDAO pacienteDAO = new PacienteDAO(connection);
        //     pacienteDAO.insertarPaciente(paciente);
        //     System.out.println("¡Registro de paciente insertado correctamente!");
        // } catch (SQLException e) {
        //     System.out.println("Error al insertar el registro del paciente: " +
        //     e.getMessage());
        // }

        // Obtener un paciente por su documento
        /*
         * try (Connection connection = connectionFactory.realizarConexion()) {
         * PacienteDAO pacienteDAO = new PacienteDAO(connection);
         * Paciente paciente = pacienteDAO.obtenerPacientePorDocumento("77816153");
         * if (paciente != null){
         * System.out.println(paciente.toString());
         * } else {
         * System.out.println("No se encontró al paciente");
         * }
         * } catch (SQLException e) {
         * System.out.println("Error al obtener al paciente: " + e.getMessage());
         * }
         */

        // Obtener persona por apellido
        /*
         * try (Connection connection = connectionFactory.realizarConexion()) {
         * PersonaDAO personaDAO = new PersonaDAO(connection);
         * List<Persona> personas = personaDAO.obtenerPersonaPorApellido("Gui");
         * if (!personas.isEmpty()) {
         * System.out.println("Personas encontradas:");
         * for (Persona persona : personas) {
         * System.out.println(persona.toString());
         * }
         * } else {
         * System.out.
         * println("No se encontró ninguna persona con el apellido especificado.");
         * }
         * } catch (SQLException e) {
         * System.out.println("Error al obtener los datos de la persona: " +
         * e.getMessage());
         * }
         */

    }
}

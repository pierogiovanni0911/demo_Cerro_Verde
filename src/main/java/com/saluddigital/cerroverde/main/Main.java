/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.saluddigital.cerroverde.main;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.saluddigital.cerroverde.dao.ConnectionFactory;
import com.saluddigital.cerroverde.dao.EmpleadoDAO;
import com.saluddigital.cerroverde.dao.MedicoDAO;
import com.saluddigital.cerroverde.dao.PacienteDAO;
import com.saluddigital.cerroverde.dao.PersonaDAO;
import com.saluddigital.cerroverde.model.Empleado;
import com.saluddigital.cerroverde.model.Medico;
import com.saluddigital.cerroverde.model.Paciente;
import com.saluddigital.cerroverde.model.Persona;
import com.saluddigital.cerroverde.view.ModEliminarPaciente;

/**
 *
 * @author piero
 */
public class Main {
    public static void main(String[] args) {
        ConnectionFactory connectionFactory = new ConnectionFactory();

        // Crear
        // try (Connection connection = connectionFactory.realizarConexion()) {
        // Medico medico = new Medico();
        // medico.setDocumento("10724756");
        // medico.setNombre("Jose Maria");
        // medico.setApellido("Lucar Fernandez");
        // medico.setSeguroSocial("022222");
        // medico.setSexo("F");
        // medico.setTelefono("999999999");
        // medico.setCorreoElectronico("jose555@gmail.com");
        // medico.setDireccion("Calle 234 Lima");
        // medico.setDepartamento("Lima");
        // medico.setProvincia("Lima");
        // medico.setDistrito("Lima");
        // medico.setEstadoCivil("Soltero");
        // medico.setFechaNacimiento(new java.util.Date());

        // medico.setFechaIngreso(new java.util.Date());
        // medico.setArea("Salud");
        // medico.setCargo("Medico");
        // medico.setUsername("josemaria123");
        // medico.setPassword("123456");

        // medico.setNumConsultorio("A-2");
        // medico.setEspecialidad("Pediatra");
        // MedicoDAO medicoDAO = new MedicoDAO(connection);
        // medicoDAO.insertarMedico(medico);
        // System.out.println("Registro de medico insertado correctamente!");
        // } catch (SQLException e) {
        // System.out.println("Error al insertar el registro del medico: " +
        // e.getMessage());
        // }

        // Obtener un paciente por su documento
        // try (Connection connection = connectionFactory.realizarConexion()) {
        // PacienteDAO pacienteDAO = new PacienteDAO(connection);
        // Paciente paciente = pacienteDAO.obtenerPacientePorDocumento("77816153");
        // if (paciente != null) {
        // System.out.println(paciente.toString());
        // } else {
        // System.out.println("No se encontr� al paciente");
        // }
        // } catch (SQLException e) {
        // System.out.println("Error al obtener al paciente: " + e.getMessage());
        // }

        // Obtener paciente por apellido
        // try (Connection connection = connectionFactory.realizarConexion()) {
        // PacienteDAO pacienteDAO = new PacienteDAO(connection);
        // List<Paciente> pacientes = pacienteDAO.obtenerPacientesPorApellido("Gui");
        // if (!pacientes.isEmpty()) {
        // System.out.println("Pacientes encontrados:");
        // for (Paciente paciente : pacientes) {
        // System.out.println(paciente.toString());
        // }
        // } else {
        // System.out.println("No se encontr� ningun paciente con el apellido
        // especificado.");
        // }
        // } catch (SQLException e) {
        // System.out.println("Error al obtener los datos del paciente: " +
        // e.getMessage());
        // }

        // Eliminar un empleado
        try (Connection connection = connectionFactory.realizarConexion()) {
            MedicoDAO medicoDAO = new MedicoDAO(connection);
            Medico medico = medicoDAO.obtenerMedicoPorId(2);
            if (medico != null) {
                medicoDAO.eliminarMedicoTotal(medico.getIdMedico());
                System.out.println("Medico eliminado correctamente");
            } else {
                System.out.println("No se encontr al Medico");
            }
        } catch (SQLException e) {
            System.out.println("Error al eliminar al medico: " + e.getMessage());
        }

        // Actualizar un empleado
        // try (Connection connection = connectionFactory.realizarConexion()) {
        // EmpleadoDAO empleadoDAO = new EmpleadoDAO(connection);
        // Empleado empleado = empleadoDAO.obtenerEmpleadoPorId(1);
        // if (empleado != null) {
        // empleado.setDocumento("131111111");
        // empleado.setNombre("María");
        // empleado.setApellido("Miranda Torres");
        // empleado.setSeguroSocial("0911302");
        // empleado.setSexo("F");
        // empleado.setTelefono("009282823");
        // empleado.setCorreoElectronico("maria123@gmail.com");
        // empleado.setDireccion("Calle 234 Lima");
        // empleado.setDepartamento("Lima");
        // empleado.setProvincia("Lima");
        // empleado.setDistrito("Lima");
        // empleado.setEstadoCivil("Casado");
        // empleado.setFechaNacimiento(new java.util.Date());
        // // empleado.setGrupoSanguineo("O+");
        // empleado.setFechaIngreso(new java.util.Date());
        // empleado.setArea("Administracion");
        // empleado.setCargo("Gerente");
        // empleado.setUsername("maria123");
        // empleado.setPassword("123456");
        // empleadoDAO.actualizarEmpleado(empleado);
        // System.out.println("Empleado actualizado correctamente");
        // }
        // } catch (SQLException e) {
        // System.out.println("Error al actualizar al empleado: " + e.getMessage());
        // }
    }
}

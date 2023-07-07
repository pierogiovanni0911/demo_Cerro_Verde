package com.saluddigital.cerroverde.controller;

import java.sql.SQLException;
import java.util.List;

import com.saluddigital.cerroverde.dao.ConnectionFactory;
import com.saluddigital.cerroverde.dao.EmpleadoDAO;
import com.saluddigital.cerroverde.model.Empleado;

public class EmpleadoController {
    private final EmpleadoDAO empleadoDAO;

    public EmpleadoController() {
        this.empleadoDAO = new EmpleadoDAO(new ConnectionFactory().realizarConexion());
    }

    public List<Empleado> obtenerTodosLosEmpleados() throws SQLException {
        return empleadoDAO.obtenerTodosLosEmpleados();
    }

    public void insertarEmpleado(Empleado empleado) throws SQLException {
        empleadoDAO.insertarEmpleado(empleado);
    }

    public void obtenerEmpleadoPorId(int idEmpleado) throws SQLException {
        empleadoDAO.obtenerEmpleadoPorId(idEmpleado);
    }

    public void actualizarEmpleado(Empleado empleado) throws SQLException {
        empleadoDAO.actualizarEmpleado(empleado);
    }

    public void eliminarEmpleado(int idEmpleado) throws SQLException {
        empleadoDAO.eliminarEmpleado(idEmpleado);
    }

    public void eliminarEmpleadoTotal(int idEmpleado) throws SQLException {
        empleadoDAO.eliminarEmpleadoTotal(idEmpleado);
    }
}

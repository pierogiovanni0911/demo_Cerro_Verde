package com.saluddigital.cerroverde.dao;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;
import javax.swing.JOptionPane;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConnectionFactory {
    private final DataSource dataSource;

    public ConnectionFactory(){
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
        comboPooledDataSource.setJdbcUrl("jdbc:mysql://localhost:3306/sistema_centro_salud");
        comboPooledDataSource.setUser("root");
        comboPooledDataSource.setPassword("mascota1");
        comboPooledDataSource.setMaxPoolSize(10);
        this.dataSource = comboPooledDataSource;
    }


    // Se obtiene la conexión por el método getConnection() de la clase DataSource
    public Connection realizarConexion(){
        try {
            return this.dataSource.getConnection();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al conectar con" +
                "la Base de Datos de MySQL", "Error en la conexiÃ³n", JOptionPane.ERROR_MESSAGE);
            throw new RuntimeException(e);
        }
    }
}

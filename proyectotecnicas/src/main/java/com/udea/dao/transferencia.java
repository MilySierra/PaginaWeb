package com.udea.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.udea.model.Transferencia;

public class transferencia extends ConexionDao {

    private static final String INGRESAR_TRANSFERENCIA = "INSERT INTO transacciones (cantidad, fecha, tipoTransaccion, cliente) VALUES (?, ?, ?, ?)";

    public void insertarTransaccion(Transferencia transferencia) {
        try (Connection conexion = getConnection();
             PreparedStatement preparedStatement = conexion.prepareStatement(INGRESAR_TRANSFERENCIA)) {
            preparedStatement.setDouble(1, transferencia.getCantidad());
            preparedStatement.setDate(2, transferencia.getFecha());
            preparedStatement.setString(3, transferencia.getTipoTransferencia());
            preparedStatement.setInt(4, (transferencia.getUsuario()).getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al ingresar la transferencia: " + e.getMessage());
        }
    }

}
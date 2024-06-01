package com.udea.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.udea.model.Cuenta;

public class cuenta extends ConexionDao {

    private static final String CREAR_CUENTA = "INSERT INTO cuenta (saldo, estado, tipoCuenta, numeroCuenta, cliente) VALUES (?, ?, ?, ?, ?)";
    private static final String SELECCIONAR_CUENTA = "SELECT * FROM cuenta WHERE numeroCuenta = ?";

    public void insertarCuenta(Cuenta nuevaCuenta) {
        try (Connection conexion = getConnection();
             PreparedStatement preparedStatement = conexion.prepareStatement(CREAR_CUENTA)) {
            preparedStatement.setDouble(1, 0);
            preparedStatement.setString(2, nuevaCuenta.getestado());
            preparedStatement.setString(3, nuevaCuenta.gettipoCuenta());
            preparedStatement.setInt(4, nuevaCuenta.getnumeroCuenta());
            preparedStatement.setInt(5, (nuevaCuenta.getusuario()).getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al crear una cuenta: " + e.getMessage());
        }
    }

    public Cuenta seleccionarCuenta(int numeroCuenta) {
        Cuenta cuentaEncontrada = null;
        try (Connection conexion = getConnection();
             PreparedStatement preparedStatement = conexion.prepareStatement(SELECCIONAR_CUENTA)) {
            preparedStatement.setInt(1, numeroCuenta);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                cuentaEncontrada = new Cuenta();
                cuentaEncontrada.setsaldo(resultSet.getDouble("saldo"));
                cuentaEncontrada.setestado(resultSet.getString("estado"));
                cuentaEncontrada.settipoCuenta(resultSet.getString("tipoCuenta"));
                cuentaEncontrada.setnumeroCuenta(resultSet.getInt("numeroCuenta"));
                cuentaEncontrada.setid(resultSet.getInt("id"));
            }
        } catch (SQLException e) {
            System.out.println("Error al seleccionar una cuenta: " + e.getMessage());
        }
        return cuentaEncontrada;
    }

    private static final String SELECCIONAR_CUENTA_POR_USUARIO_Y_TIPO = "SELECT * FROM cuenta WHERE cliente = ? AND tipoCuenta = ?";

    public boolean cuentaDelMismoTipo(int idUsuario, String tipoCuenta) {
        try (Connection conexion = getConnection();
             PreparedStatement preparedStatement = conexion.prepareStatement(SELECCIONAR_CUENTA_POR_USUARIO_Y_TIPO)) {
            preparedStatement.setInt(1, idUsuario);
            preparedStatement.setString(2, tipoCuenta);
            ResultSet resultSet = preparedStatement.executeQuery();
            return resultSet.next();
        } catch (SQLException e) {
            System.out.println("Error al verificar si el usuario tiene una cuenta del mismo tipo: " + e.getMessage());
            return false;
        }
    }

    public void actualizarSaldoCuenta(double cantidad, int id) {
        String actualizarSaldoQuery = "UPDATE cuenta SET saldo = saldo + ? WHERE id= ?";

        try (Connection conexion = getConnection();
             PreparedStatement preparedStatement = conexion.prepareStatement(actualizarSaldoQuery)) {
            preparedStatement.setDouble(1, cantidad);
            preparedStatement.setInt(2, id);
            //preparedStatement.setInt(2, numeroCuenta);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al actualizar el saldo de la cuenta: " + e.getMessage());
        }
    }

    public Cuenta seleccionarCuentaConId(int id) {
        Cuenta cuentaEncontrada = null;
        String query = "SELECT * FROM cuenta WHERE id = ?";
    
        try (Connection conexion = getConnection();
             PreparedStatement preparedStatement = conexion.prepareStatement(query)) {
    
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
    
            if (resultSet.next()) {
                cuentaEncontrada = new Cuenta();
                cuentaEncontrada.setsaldo(resultSet.getDouble("saldo"));
                cuentaEncontrada.setestado(resultSet.getString("estado"));
                cuentaEncontrada.settipoCuenta(resultSet.getString("tipoCuenta"));
                cuentaEncontrada.setnumeroCuenta(resultSet.getInt("numeroCuenta"));
                cuentaEncontrada.setid(resultSet.getInt("id"));
            }
        } catch (SQLException e) {
            System.out.println("Error al seleccionar una cuenta: " + e.getMessage());
        }
    
        return cuentaEncontrada;
    }
}

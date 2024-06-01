package com.udea.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.udea.model.Usuario;

public class usuario extends ConexionDao {

    private static final String INSERTAR_USUARIO = "INSERT INTO usuario (usuario, contraseña) VALUES (?, ?)";
    private static final String SELECCIONAR_USUARIO_POR_USUARIO = "SELECT * FROM usuario WHERE usuario = ?";

    public void insertarUsuario(Usuario nuevoUsuario) {
        try (Connection conexion = getConnection();
             PreparedStatement preparedStatement = conexion.prepareStatement(INSERTAR_USUARIO)) {
            preparedStatement.setString(1, nuevoUsuario.getUsuario());
            //String contraseñaEncriptada = BCrypt.hashpw(nuevoUsuario.getContrasena(), BCrypt.gensalt());
            preparedStatement.setString(2, nuevoUsuario.getContrasena());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al insertar un usuario: " + e.getMessage());
        }
    }

    public Usuario seleccionarUsuario(String usuario) {
        Usuario usuarioEncontrado = null;
        try (Connection conexion = getConnection();
             PreparedStatement preparedStatement = conexion.prepareStatement(SELECCIONAR_USUARIO_POR_USUARIO)) {
            preparedStatement.setString(1, usuario);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                usuarioEncontrado = new Usuario();
                usuarioEncontrado.setId(resultSet.getInt("id"));
                usuarioEncontrado.setUsuario(resultSet.getString("usuario"));
                usuarioEncontrado.setContrasena(resultSet.getString("contraseña"));
            }
        } catch (SQLException e) {
            System.out.println("Error al seleccionar un usuario por usuario: " + e.getMessage());
        }
        return usuarioEncontrado;
    }
}

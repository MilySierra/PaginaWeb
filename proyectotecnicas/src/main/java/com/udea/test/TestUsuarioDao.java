package com.udea.test;

import com.udea.dao.usuario;
import com.udea.model.Usuario;

public class TestUsuarioDao {
    public static void main(String[] args) {
        usuario usuarioDao = new usuario();

        // Crear un nuevo usuario
        Usuario nuevoUsuario = new Usuario();
        nuevoUsuario.setUsuario("Mily");
        nuevoUsuario.setContrasena("salome");
        usuarioDao.insertarUsuario(nuevoUsuario);
        System.out.println("Usuario insertado correctamente");
    }

}

package com.udea.servlets;

import java.io.IOException;

import com.udea.dao.usuario;
import com.udea.model.Usuario;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/RegistroUsuarioServlet")
public class RegistroServlet extends HttpServlet {
    private usuario usuarioL;

    @Override
    public void init() {
        usuarioL = new usuario();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String usuario = request.getParameter("usuario");
        String contrasena = request.getParameter("contrasena");

        Usuario nuevoUsuario = new Usuario();
        nuevoUsuario.setUsuario(usuario);
        nuevoUsuario.setContrasena(contrasena);

        Usuario usuarioExistente = usuarioL.seleccionarUsuario(usuario);
        if (usuarioExistente == null) {
            usuarioL.insertarUsuario(nuevoUsuario);

            HttpSession session = request.getSession();
            session.setAttribute("usuario", nuevoUsuario);

            request.setAttribute("mensaje", "¡Registro exitoso!, Ahora inicie sesión");
        } else {
            request.setAttribute("mensaje", "El usuario ya existe. Por favor, elija otro nombre de usuario.");
        }

        request.getRequestDispatcher("contact.jsp").forward(request, response);
    }
}



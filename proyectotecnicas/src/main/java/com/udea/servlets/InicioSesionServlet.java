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

@WebServlet("/InicioSesionServlet")
public class InicioSesionServlet extends HttpServlet {
    private usuario usuarioL;

    @Override
    public void init() {
        usuarioL = new usuario();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String usuario = request.getParameter("usuario");
        String contrasena = request.getParameter("contrasena");

        Usuario usuarioExistente = usuarioL.seleccionarUsuario(usuario);

        if (usuarioExistente == null) {
            request.setAttribute("mensaje", "El usuario no existe.");
            request.getRequestDispatcher("contact.jsp").forward(request, response);
        } else if (!contrasena.equals(usuarioExistente.getContrasena())) {
            request.setAttribute("mensaje", "Contraseña incorrecta.");
            request.getRequestDispatcher("contact.jsp").forward(request, response);
        } else {
            HttpSession session = request.getSession();
            session.setAttribute("cliente", usuarioExistente);
            response.sendRedirect("count.jsp");
        }
    }
}

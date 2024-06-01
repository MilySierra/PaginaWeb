package com.udea.servlets;

import java.io.IOException;

import com.udea.dao.cuenta;
import com.udea.model.Cuenta;
import com.udea.model.Usuario;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class CrearCuentaServlet extends HttpServlet {
    private cuenta cuentaL;

    @Override
    public void init(){
        cuentaL = new cuenta();
    }

     @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    HttpSession session = request.getSession();
    String tipoCuenta = request.getParameter("tipoCuenta");
    Usuario usuario = (Usuario) session.getAttribute("cliente"); 


    if (cuentaL.cuentaDelMismoTipo(usuario.getId(), tipoCuenta)) {
        String mensaje = "El usuario ya tiene una cuenta del tipo " + tipoCuenta;
        request.setAttribute("mensaje", mensaje);
        request.getRequestDispatcher("count.jsp").forward(request, response);
        return;
    }

    // Si el usuario no tiene una cuenta del mismo tipo, proceder con la creación de la nueva cuenta
    Cuenta nuevaCuenta = new Cuenta();
    nuevaCuenta.setsaldo(0.0); 
    nuevaCuenta.setestado("Abierta"); 
    nuevaCuenta.settipoCuenta(tipoCuenta); 
    nuevaCuenta.setnumeroCuenta(generarNumeroCuenta());
    nuevaCuenta.setusuario(usuario); 

    cuentaL.insertarCuenta(nuevaCuenta);

    session.setAttribute("numeroCuenta", nuevaCuenta.getnumeroCuenta());
    session.setAttribute("tipoCuenta", nuevaCuenta.gettipoCuenta());
    session.setAttribute("saldo", nuevaCuenta.getsaldo());
    //session.setAttribute("id", nuevaCuenta.getid());
    response.sendRedirect("table.jsp");
}

    private int generarNumeroCuenta() {
        return (int) (Math.random() * 1000000000); 
    }
}
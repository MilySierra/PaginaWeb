package com.udea.servlets;

import java.io.IOException;

import com.udea.dao.cuenta;
import com.udea.model.Cuenta;
import com.udea.model.Usuario;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/CuentaServlet")
public class CuentaServlet extends HttpServlet {
    private cuenta cuentaL;

    @Override
    public void init() {
        cuentaL = new cuenta();
    }

    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        Usuario usuario = (Usuario) session.getAttribute("cliente");
        
        String numeroCuentaString = request.getParameter("numeroCuenta");
        int numeroCuenta = Integer.parseInt(numeroCuentaString);

        Cuenta cuentaExistente = cuentaL.seleccionarCuenta(numeroCuenta);

        if (cuentaExistente == null) {
            request.setAttribute("mensaje", "La cuenta no existe");
            request.getRequestDispatcher("inf.jsp").forward(request, response);
        //} else if ((cuentaExistente.getusuario()).getId() != usuario.getId()) {
            //request.setAttribute("mensaje", "El número de cuenta es incorrecto");
            //request.getRequestDispatcher("inf.jsp").forward(request, response);
        } else {
            session.setAttribute("numeroCuenta", cuentaExistente.getnumeroCuenta());
            session.setAttribute("tipoCuenta", cuentaExistente.gettipoCuenta());
            session.setAttribute("saldo", cuentaExistente.getsaldo());
            session.setAttribute("cliente", usuario);
            response.sendRedirect("table.jsp");
        }
    }
}


package com.udea.servlets;

import java.io.IOException;
import java.sql.Date;
import java.time.LocalDate;

import com.udea.dao.cuenta;
import com.udea.dao.transferencia;
import com.udea.model.Cuenta;
import com.udea.model.Transferencia;
import com.udea.model.Usuario;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/transaccionServlet")
public class transferenciaServlet extends HttpServlet {
    private transferencia transferenciaL;
    Double cantidadV;
    Double valor;
    double total;

    @Override
    public void init() {
        transferenciaL = new transferencia();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String tipoTranferencia = request.getParameter("tipoTransaccion");
        String cantidadString = request.getParameter("cantidad");
        Double cantidad = Double.valueOf(cantidadString);
        LocalDate localDate = LocalDate.now();
        Date fecha = Date.valueOf(localDate);
        Usuario usuario = (Usuario) session.getAttribute("cliente");
        String opcion = request.getParameter("moneda");
        //String idString = request.getParameter("id");
       // int id = Integer.parseInt(idString);
        String numeroCuentaString = request.getParameter("numeroCuenta");
        int numeroCuenta = Integer.parseInt(numeroCuentaString);
        cuenta cuentaL = new cuenta();

    
        if ("dolar".equals(opcion)){
            cantidadV=cantidad*3.871;
        } else if ("euro".equals(opcion)){
            cantidadV = cantidad*4.186;
        } else {
            cantidadV = cantidad;
        }

        if ("Deposito".equals(tipoTranferencia)){
            valor = cantidadV;
        } else {
            valor = -cantidadV;
        }


        if (cantidadV<50000 && cantidadV>0){
            total = valor-100;
        } else {
            total = valor - valor*0.01;
        }

        Transferencia transferencia = new Transferencia();
        transferencia.setCantidad(cantidadV); 
        transferencia.setFecha(fecha);
        transferencia.setTipoTransferencia(tipoTranferencia);
        transferencia.setUsuario(usuario); 

        //Cuenta cuenta = cuentaL.seleccionarCuentaConId(id);
        //double saldoActual = cuenta.getsaldo();

        Cuenta cuenta = cuentaL.seleccionarCuenta(numeroCuenta);
        double saldoActual = cuenta.getsaldo();

        if (retirar(saldoActual, cantidadV, tipoTranferencia)){
            transferenciaL.insertarTransaccion(transferencia);
            //int numeroCuenta = cuentaL.seleccionarCuentaConId(usuario.getId()).getnumeroCuenta();
            cuentaL.actualizarSaldoCuenta(total, cuenta.getid());
            request.setAttribute("mensaje", "La transacción fue exitosa");
            request.getRequestDispatcher("consignar.jsp").forward(request, response);
        } else {
            request.setAttribute("mensaje", "No se pudo realizar la transacción");
            request.getRequestDispatcher("retiro.jsp").forward(request, response);
        }
        

    }

    public boolean retirar(double saldo, double cantidad, String tipoTransaccion){
        if ("Retiro".equals(tipoTransaccion)){
            if (saldo >= cantidad && cantidad>0){
                return true;
            } else {
                return false;
            }
        } else {
            return true;
        }
    }
    
}
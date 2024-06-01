package com.udea.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexionDao {
    private static final String URL_DB = "jdbc:mariadb://localhost:3306/banco1";
    private static final String USER_DB = "root";
    private static final String PASSWORD_DB = "root";


    public ConexionDao(){
    }

    protected static Connection getConnection() {
        Connection conexion = null;
        try {
          Class.forName("org.mariadb.jdbc.Driver");
          System.out.println("Conectando a la base de datos...");
          conexion = DriverManager.getConnection(URL_DB, USER_DB, PASSWORD_DB);
          System.out.println(conexion);
        } catch (ClassNotFoundException e) {
          System.out.println("Error: MariaDB JDBC Driver no encontrado.");
        } catch (SQLException e) {
          System.out.println("Error al conectar a la base de datos: " + e.getMessage());
          e.printStackTrace();
        }
        return conexion;
      }
    }
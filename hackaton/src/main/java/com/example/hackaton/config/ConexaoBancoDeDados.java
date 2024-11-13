package com.example.hackaton.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Component
public class ConexaoBancoDeDados {

//    public Connection getConnection() throws SQLException {
//        Connection con = DriverManager.getConnection(SERVER, USER, PASS);
//        con.createStatement().execute("alter session set current_schema=" + SCHEMA);
//
//        return con;
//    }
//
//    public void closeConnection(Connection connection) {
//        try {
//            if (connection != null)
//                connection.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
}
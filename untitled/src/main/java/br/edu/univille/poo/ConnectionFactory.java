package br.edu.univille.poo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//singleton + method factory

public class ConnectionFactory {
    private static ConnectionFactory instance;

    private ConnectionFactory(){}

    public static ConnectionFactory getInstance(){
        if(instance == null) instance = new ConnectionFactory();
        return instance;
    }

    public Connection get() throws SQLException {
        String url = "";
        String user = "root";
        String password = "univille";
        return DriverManager.getConnection(url, user, password);
    }
}

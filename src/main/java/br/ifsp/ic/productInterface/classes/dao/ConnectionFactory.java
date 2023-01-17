package br.ifsp.ic.productInterface.classes.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConnectionFactory implements AutoCloseable{

    private static Connection connection;
    private static PreparedStatement statement;

    public static Connection createConnection() {
        try {
            if (connection == null)
                connection = DriverManager.getConnection("jdbc:mysql://localhost/-----?allowPublicKeyRetrieval=true&useSSL=false", "root", "");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
   }

    public static PreparedStatement createPreparedStatement(String sql) {
        try {
            statement = createConnection().prepareStatement(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return statement;
    }
    public void close() throws Exception {
        if(connection != null){
            connection.close();
            if(statement != null)
                statement.close();
        }}
}

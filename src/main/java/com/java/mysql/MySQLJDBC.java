package com.java.mysql;

import com.mysql.cj.jdbc.Driver;
import java.sql.*;

public class MySQLJDBC {
    public static Connection connect() throws SQLException {
        DriverManager.registerDriver(new Driver());
        Connection connection = DriverManager.getConnection(
                Config.getUrl(),
                Config.getUser(),
                Config.getPassword()
        );
        return connection;
    }
}

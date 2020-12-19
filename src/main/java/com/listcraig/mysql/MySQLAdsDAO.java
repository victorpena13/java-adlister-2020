package com.listcraig.mysql;

import com.listcraig.interfaces.Ads;
import com.listcraig.models.Ad;
import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDAO implements Ads {
    private Connection connection;

    public MySQLAdsDAO() throws SQLException {
        DriverManager.registerDriver(new Driver());
        connection = DriverManager.getConnection(
                Config.getUrl(),
                Config.getUser(),
                Config.getPassword()
        );
    }

    @Override
    public List<Ad> all() throws SQLException {
        String selectQuery = "SELECT * FROM ads";
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(selectQuery);
        return createArray(rs);
    }

    public List<Ad> createArray(ResultSet rs) throws SQLException {
        List<Ad> ads = new ArrayList<>();
        while(rs.next()) {
            ads.add(getDetails(rs));
        }
        return ads;
    }

    public Ad getDetails(ResultSet rs) throws SQLException {
        return new Ad(rs.getLong("id"),
                rs.getString("title"),
                rs.getString("description"));
    }

    @Override
    public long insert(Ad ad) throws SQLException {
        String adding = String.format("INSERT INTO ads (user_id, title, description, categories_id) VALUES (%d, '%s', '%s')",
                ad.getUserID(), ad.getTitle(), ad.getDescription());
        PreparedStatement statement = connection.prepareStatement(adding);
        long queue = statement.executeUpdate(adding);
        return queue;
    }
}

package com.java.DAO;

import com.java.interfaces.Ads;
import com.java.mysql.MySQLAdsDAO;

import java.sql.SQLException;

public class DaoFactory {
    private static Ads adsDao;
    public static Ads getAdsDao() throws SQLException {
        if (adsDao == null) {
            adsDao = new MySQLAdsDAO();
        }
        return adsDao;
    }
}

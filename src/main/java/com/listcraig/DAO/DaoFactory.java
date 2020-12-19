package com.listcraig.DAO;

import com.listcraig.interfaces.Ads;
import com.listcraig.mysql.MySQLAdsDAO;

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

package com.listcraig.interfaces;

import com.listcraig.models.Ad;

import java.sql.SQLException;
import java.util.List;

public interface Ads {
    List<Ad> all() throws SQLException;
    long insert(Ad ad) throws SQLException;
}

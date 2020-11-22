package com.java.models;

import java.util.Date;

public class Ad {
    private long id;
    private long userID;
    private String title;
    private String description;
    private Date date;

    public Ad(long userID, String title, String description) {
        this.userID = userID;
        this.title = title;
        this.description = description;
    }

    public Ad(long id, long userID, String title, String description, Date date) {
        this.id = id;
        this.userID = userID;
        this.title = title;
        this.description = description;
        this.date = date;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUserID() {
        return userID;
    }

    public void setUserID(long userID) {
        this.userID = userID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}

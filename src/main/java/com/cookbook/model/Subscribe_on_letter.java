package com.cookbook.model;

import java.sql.Date;

public class Subscribe_on_letter {
    private Long id;
    private String email;
    private Date date;

    public Subscribe_on_letter(Long id, String email, Date date) {
        this.id = id;
        this.email = email;
        this.date = date;
    }

    public Subscribe_on_letter(String email, Date date) {
        this.email = email;
        this.date = date;
    }

    public Subscribe_on_letter() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Subscribe_on_letter{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", date=" + date +
                '}';
    }
}

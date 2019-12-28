package com.cookbook.model;

import java.sql.Date;

public class ContactUs  {

    private Long id;
    private String nameSends;
    private String textSends;
    private String email;
    private String subjects;
    private Date dateSends;

    public ContactUs(Long id, String nameSends, String textSends, String email, String subjects, Date dateSends) {
        this.id = id;
        this.nameSends = nameSends;
        this.textSends = textSends;
        this.email = email;
        this.subjects = subjects;
        this.dateSends = dateSends;
    }

    public ContactUs(String nameSends, String textSends, String email, String subjects, Date dateSends) {
        this.nameSends = nameSends;
        this.textSends = textSends;
        this.email = email;
        this.subjects = subjects;
        this.dateSends = dateSends;
    }

    public ContactUs() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameSends() {
        return nameSends;
    }

    public void setNameSends(String nameSends) {
        this.nameSends = nameSends;
    }

    public String getTextSends() {
        return textSends;
    }

    public void setTextSends(String textSends) {
        this.textSends = textSends;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public Date getDateSends() {
        return dateSends;
    }

    public void setDateSends(Date dateSends) {
        this.dateSends = dateSends;
    }

    public String getSubjects() {
        return subjects;
    }

    public void setSubjects(String subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "ContactUs{" +
                "id=" + id +
                ", nameSends='" + nameSends + '\'' +
                ", textSends='" + textSends + '\'' +
                ", email='" + email + '\'' +
                ", Subject_id=" + subjects +
                ", dateSends=" + dateSends +
                '}';
    }
}

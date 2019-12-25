package com.cookbook.model;

import java.sql.Date;

public class ContactUs  {

    private Long id;
    private String nameSends;
    private String sonameSends;
    private String email;
    private Integer Subject_id;
    private Date dateSends;

    public ContactUs(Long id, String nameSends, String sonameSends, String email, Integer subject_id, Date dateSends) {
        this.id = id;
        this.nameSends = nameSends;
        this.sonameSends = sonameSends;
        this.email = email;
        Subject_id = subject_id;
        this.dateSends = dateSends;
    }

    public ContactUs(String nameSends, String sonameSends, String email, Integer subject_id, Date dateSends) {
        this.nameSends = nameSends;
        this.sonameSends = sonameSends;
        this.email = email;
        Subject_id = subject_id;
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

    public String getSonameSends() {
        return sonameSends;
    }

    public void setSonameSends(String sonameSends) {
        this.sonameSends = sonameSends;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getSubject_id() {
        return Subject_id;
    }

    public void setSubject_id(Integer subject_id) {
        Subject_id = subject_id;
    }

    public Date getDateSends() {
        return dateSends;
    }

    public void setDateSends(Date dateSends) {
        this.dateSends = dateSends;
    }

    @Override
    public String toString() {
        return "ContactUs{" +
                "id=" + id +
                ", nameSends='" + nameSends + '\'' +
                ", sonameSends='" + sonameSends + '\'' +
                ", email='" + email + '\'' +
                ", Subject_id=" + Subject_id +
                ", dateSends=" + dateSends +
                '}';
    }
}

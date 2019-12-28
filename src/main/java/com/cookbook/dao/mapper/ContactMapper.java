package com.cookbook.dao.mapper;

import com.cookbook.model.ContactUs;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ContactMapper implements RowMapper<ContactUs> {
    @Override
    public ContactUs mapRow(ResultSet resultSet, int i) throws SQLException {
        ContactUs contactUs = new ContactUs();
        contactUs.setId(resultSet.getLong("id"));
        contactUs.setNameSends(resultSet.getString("nameSends"));
        contactUs.setTextSends(resultSet.getString("sonameSends"));
        contactUs.setDateSends(resultSet.getDate("DateSends"));
        contactUs.setSubject_id(resultSet.getString("Subjects"));
        return contactUs;
    }
}

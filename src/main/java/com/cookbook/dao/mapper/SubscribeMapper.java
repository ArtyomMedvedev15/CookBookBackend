package com.cookbook.dao.mapper;

import com.cookbook.model.Subscribe_on_letter;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SubscribeMapper implements RowMapper<Subscribe_on_letter> {
    @Override
    public Subscribe_on_letter mapRow(ResultSet resultSet, int i) throws SQLException {
        Subscribe_on_letter subscribe = new Subscribe_on_letter();
        subscribe.setId(resultSet.getLong("id"));
        subscribe.setEmail(resultSet.getString("email"));
        subscribe.setDate(resultSet.getDate("DateSubscribe"));

        return null;
    }
}

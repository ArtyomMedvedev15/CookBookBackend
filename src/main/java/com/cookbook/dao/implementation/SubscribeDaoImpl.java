package com.cookbook.dao.implementation;

import com.cookbook.dao.interfaces.Subscribe_on_letterDao;
import com.cookbook.dao.mapper.SubscribeMapper;
import com.cookbook.model.Subscribe_on_letter;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class SubscribeDaoImpl implements Subscribe_on_letterDao {

    private JdbcTemplate jdbcTemplate;

    public SubscribeDaoImpl(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public int save(Subscribe_on_letter subscribe) {
        String sql = "INSERT INTO subscribe_on_letter(email,DateSubscribe) VALUES(?,?)";
        return jdbcTemplate.update(sql,subscribe.getEmail(),subscribe.getDate());
    }

    @Override
    public Subscribe_on_letter getById(Integer id) {
        String sql = "SELECT * FROM subscribe_on_letter WHERE id = ?";
        return jdbcTemplate.queryForObject(sql,new SubscribeMapper(),id);
    }

    @Override
    public int update(Subscribe_on_letter subscribe) {
        String sql = "UPDATE subscribe_on_letter SET email = ?, DateSubscribe = ? WHERE id = ?";
        return jdbcTemplate.update(sql,subscribe.getEmail(),subscribe.getDate(),subscribe.getId());
    }

    @Override
    public int deleteById(Integer id) {
        String sql = "DELETE subscribe_on_letter FROM subscribe_on_letter WHERE id = ?";
        return jdbcTemplate.update(sql,id);
    }

    @Override
    public List<Subscribe_on_letter> findAll() {
        String sql = "SELECT * FROM subscribe_on_letter";
        return jdbcTemplate.query(sql,new SubscribeMapper());
    }

    @Override
    public List<Subscribe_on_letter> findByEmail(String email) {
        String patternForFound = "%"+email+"%";
        String sql = "SELECT * FROM subscribe_on_letter WHERE email like ?";
        return jdbcTemplate.query(sql,new SubscribeMapper(),patternForFound);
    }
}

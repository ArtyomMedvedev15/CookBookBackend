package com.cookbook.dao.implementation;

import com.cookbook.dao.interfaces.ContactDao;
import com.cookbook.dao.mapper.ContactMapper;
import com.cookbook.model.ContactUs;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class ContactDaoImpl implements ContactDao {

    private JdbcTemplate jdbcTemplate;

    public ContactDaoImpl(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }


    @Override
    public int save(ContactUs contactUs) {
        String sql = "INSERT INTO ContactUs(nameSends,sonameSends," +
                "email,SubjectId,DateSends) VALUES(?,?,?,?,?)";
        return jdbcTemplate.update(sql,contactUs.getNameSends(),
                contactUs.getSonameSends(),contactUs.getEmail(),
                contactUs.getSubject_id(),contactUs.getDateSends());
     }

    @Override
    public ContactUs getById(Integer id) {
        String sql = "SELECT * FROM ContactUS WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, new ContactMapper(),id);
    }

    @Override
    public int update(ContactUs contactUs) {
        String sql = "UPDATE ContactUs SET nameSends = ?," +
                "sonameSends = ?,email = ?,SubjectId=?,DateSends=?";

        return jdbcTemplate.update(sql,contactUs.getNameSends(),
                contactUs.getSonameSends(),contactUs.getEmail(),contactUs.getSubject_id(),contactUs.getDateSends());
    }

    @Override
    public int deleteById(Integer id) {
        String sql = "DELETE ContactUs FROM ContactUs where id = ?";
        return jdbcTemplate.update(sql,id);
    }

    @Override
    public List<ContactUs> findAll() {
        String sql = "SELECT * FROM ContactUs";
        return jdbcTemplate.query(sql,new ContactMapper());
    }

    @Override
    public List<ContactUs> findByName(String name) {
        String patternForFound = "%"+name+"%";
        String sql = "SELECT * FROM ContactUs WHERE ContactUs.nameSends LIKE ?";
        return jdbcTemplate.query(sql,new ContactMapper(),patternForFound);
     }
}

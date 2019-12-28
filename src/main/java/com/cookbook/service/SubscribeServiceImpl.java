package com.cookbook.service;

import com.cookbook.dao.interfaces.Subscribe_on_letterDao;
import com.cookbook.model.Subscribe_on_letter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

@Service
public class SubscribeServiceImpl implements com.cookbook.service.interfaces.SubscribeService {

    @Autowired
    private Subscribe_on_letterDao subscribeDao;

    @Override
    public int save(Subscribe_on_letter subscribe) {
        subscribe.setDate(new Date(new java.util.Date().getTime()));
        return subscribeDao.save(subscribe);
    }

    @Override
    public Subscribe_on_letter getById(Integer id) {
        return subscribeDao.getById(id);
    }

    @Override
    public int update(Subscribe_on_letter subscribe) {
        return subscribeDao.update(subscribe);
    }

    @Override
    public int deleteById(Integer id) {
        return subscribeDao.deleteById(id);
    }

    @Override
    public List<Subscribe_on_letter> findAll() {
        return subscribeDao.findAll();
    }

    @Override
    public List<Subscribe_on_letter> findByEmail(String email) {
        return subscribeDao.findByEmail(email);
    }
}

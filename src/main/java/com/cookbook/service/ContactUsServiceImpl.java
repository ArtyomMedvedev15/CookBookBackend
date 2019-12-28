package com.cookbook.service;

import com.cookbook.dao.interfaces.ContactDao;
import com.cookbook.model.ContactUs;
import com.cookbook.service.interfaces.ContactUsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactUsServiceImpl implements ContactUsService {

    @Autowired
    private ContactDao contactDao;

    @Override
    public int save(ContactUs contactUs) {
        return contactDao.save(contactUs);
    }

    @Override
    public ContactUs getById(Integer id) {
        return contactDao.getById(id);
    }

    @Override
    public int update(ContactUs contactUs) {
        return contactDao.update(contactUs);
    }

    @Override
    public int deleteById(Integer id) {
        return contactDao.deleteById(id);
    }

    @Override
    public List<ContactUs> findAll() {
        return contactDao.findAll();
    }

    @Override
    public List<ContactUs> findByName(String name) {
        return contactDao.findByName(name);
    }
}

package com.cookbook.dao.interfaces;

import com.cookbook.model.ContactUs;

import java.util.List;

public interface ContactDao{
    int save(ContactUs contactUs);

    ContactUs getById(Integer id);

    int update(ContactUs contactUs);

    int deleteById(Integer id);

    List<ContactUs> findAll();

    List<ContactUs> findByName(String name);
}

package com.cookbook.service.interfaces;

import com.cookbook.model.ContactUs;

import java.util.List;

public interface ContactUsService {
    int save(ContactUs employee);

    ContactUs getById(Integer id);

    int update(ContactUs employee);

    int deleteById(Integer id);

    List<ContactUs> findAll();

    List<ContactUs> findByName(String name);
}

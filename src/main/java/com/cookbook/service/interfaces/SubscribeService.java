package com.cookbook.service.interfaces;

import com.cookbook.model.Subscribe_on_letter;

import java.util.List;

public interface SubscribeService {
    int save(Subscribe_on_letter subscribe);

    Subscribe_on_letter getById(Integer id);

    int update(Subscribe_on_letter subscribe);

    int deleteById(Integer id);

    List<Subscribe_on_letter> findAll();

    List<Subscribe_on_letter> findByEmail(String email);
}

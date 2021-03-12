package com.example.cucumberexample2.Service;

import com.example.cucumberexample2.dao.Entitydao;
import com.example.cucumberexample2.model.entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntityService {

    @Autowired
    public Entitydao entitydao;

    public List<entity> findAll() {
        return entitydao.findAll();
    }

    public entity findById(int id) {
        return entitydao.findById(id);
    }

    public void deleteAll() {
        entitydao.deleteAll();
    }

    public entity findByUsernameAndAndPassword(String username, String password) {
        return entitydao.findByUsernameAndAndPassword(username, password);
    }
    public entity save(entity entity) {
        return entitydao.save(entity);
    }

}

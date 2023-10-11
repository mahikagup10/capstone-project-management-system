package com.example.mew.example;


import org.springframework.stereotype.Repository;
import org.vaadin.crudui.crud.CrudListener;

import java.util.List;

@Repository
public class CapstoneService1 implements CrudListener<Capstone1> {

    private final CapstoneRepository1 repository;

    public CapstoneService1(CapstoneRepository1 repository) {
        this.repository = repository;
    }
    @Override
    public List<Capstone1> findAll() {
        return repository.findAll();
    }

    @Override
    public Capstone1 add(Capstone1 capstone1) {
        return repository.insert(capstone1);
    }
    @Override
    public Capstone1 update(Capstone1 capstone1) {

        return repository.insert(capstone1);
    }
    @Override
    public void delete(Capstone1 capstone1) {

        repository.delete(capstone1);
        //repository.deleteAll();

    }


}
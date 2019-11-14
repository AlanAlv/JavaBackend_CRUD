/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alanalv.ejemplo01.Service;

import com.alanalv.ejemplo01.Model.Person;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.alanalv.ejemplo01.Repository.PersonRepository;

/**
 *
 * @author A01630612
 */
@Service
public class PersonServiceImplement implements PersonService {

    @Autowired
    private PersonRepository repository; 
            
    @Override
    public List<Person> list() {
        return repository.findAll();
    }

    @Override
    public Person listById(int id) {
        return repository.findById(id);
    }

    @Override
    public Person add(Person p) {
        return repository.save(p);
    }

    @Override
    public Person edit(Person p) {
        return repository.save(p);
    }

    @Override
    public Person delete(int id) {
        Person p = repository.findById(id);
        if (p != null){
            repository.delete(p);
        }
        return p;
    }
    
}

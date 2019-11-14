/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alanalv.ejemplo01.Repository;

import com.alanalv.ejemplo01.Model.Person;
import java.util.List;
import org.springframework.data.repository.Repository;

/**
 *
 * @author AlanAlv
 */
public interface PersonRepository extends Repository<Person, Integer>{
    List<Person>findAll();
    Person findById (int id);
    Person save (Person p);
    void delete (Person p);
}

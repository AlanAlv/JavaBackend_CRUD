/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alanalv.ejemplo01.Service;

import com.alanalv.ejemplo01.Model.Person;
import java.util.List;

/**
 *
 * @author AlanAlv
 */
public interface PersonService {
    List<Person>list();
    Person listById(int id);
    Person add(Person p);
    Person edit(Person p);
    Person delete(int id);
    
}

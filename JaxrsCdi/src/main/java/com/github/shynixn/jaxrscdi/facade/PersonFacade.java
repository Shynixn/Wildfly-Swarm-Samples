package com.github.shynixn.jaxrscdi.facade;

import com.github.shynixn.jaxrscdi.entity.Person;

import javax.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Copyright 2017 Shynixn
 * <p>
 * Do not remove this header!
 * <p>
 * Version 1.0
 * <p>
 * MIT License
 * <p>
 * Copyright (c) 2017
 * <p>
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * <p>
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * <p>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
@ApplicationScoped
public class PersonFacade {

    public List<Person> findPersons() {
        final List<Person> persons = new ArrayList<>();
        persons.add(new Person("Max", "Mustermann"));
        persons.add(new Person("Christoph", "Power"));
        Logger.getLogger(PersonFacade.class.getSimpleName()).log(Level.INFO, "Queried persons " + persons + ".");
        return persons;
    }

    public Person findPerson(String lastName) {
        final Person person = new Person("Lea", lastName);
        Logger.getLogger(PersonFacade.class.getSimpleName()).log(Level.INFO, "Queried person " + person + ".");
        return person;
    }

    public void updatePerson(long id, Person person) {
        Logger.getLogger(PersonFacade.class.getSimpleName()).log(Level.INFO, "Updated person " + person + " with id " + id + ".");
    }

    public void deletePerson(Person person) {
        Logger.getLogger(PersonFacade.class.getSimpleName()).log(Level.INFO, "Deleted person " + person + ".");
    }

    public void insertPerson(Person person) {
        Logger.getLogger(PersonFacade.class.getSimpleName()).log(Level.INFO, "Inserted person " + person + ".");
    }
}

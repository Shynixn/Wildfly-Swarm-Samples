package com.github.shynixn.jaxrscdidb.rs.resource;

import com.github.shynixn.jaxrscdidb.entity.Person;
import com.github.shynixn.jaxrscdidb.facade.PersonFacade;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

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
@Path("person")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PersonResource {

   @Inject
    private PersonFacade personFacade;

    @POST
    public void addPerson(Person person) {
       this.personFacade.insertPerson(person);
    }

    @DELETE
    @Path("/{id}")
    public void removePerson(@PathParam("id") long id) {
      this.personFacade.deletePerson(id);
    }

    @PUT
    @Path("/{id}")
    public void updatePerson(@PathParam("id") long id, Person person) {
       this.personFacade.updatePerson(id, person);
    }

    @GET
    @Path("/{lastname}")
    public Person getPersonFromName(@PathParam("lastname") String lastName) {
        return this.personFacade.findPerson(lastName);
    }

    @GET
    public List<Person> getAllPersons() {
        return this.personFacade.findPersons();
    }
}

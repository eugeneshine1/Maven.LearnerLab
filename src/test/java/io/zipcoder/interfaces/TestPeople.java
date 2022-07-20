package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPeople {
    @Test
    public void testAdd () {
        Person person = new Person(3,"Eugene" );

        People<Person> people = new People<Person>();
        people.add(person);

        Assert.assertEquals(people.count(),1);
    }

    @Test
    public void testRemove () {
        Person person = new Person(3,"Eugene" );

        People<Person> people = new People<Person>();
        people.remove(3,person);

        Assert.assertEquals(people.count(),0);
    }

    @Test
    public void testFindByID () {
        Person person = new Person(3,"Eugene" );

        People<Person> people = new People<Person>();
        people.add(person);
        Person ppl = people.findById(3);

        Assert.assertEquals(ppl, person);
    }
}

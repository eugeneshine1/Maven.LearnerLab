package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testConstructor() {
        //given
        long expectedId = 12;
        String expectedName ="Eugene";
        //when
        Person testPerson = new Person(expectedId,expectedName);
        // then
        Assert.assertEquals(expectedId,testPerson.getId());
        Assert.assertEquals(expectedName,testPerson.getName());
    }

    @Test
    public void testSetName() {
        //given
        long expectedId = 12;
        String expectedName ="Eugene";
        //when
        Person testPerson = new Person(expectedId,expectedName);
        String newName = "Paul";
        testPerson.setName(newName);
        String actual = testPerson.getName();
        // then
        Assert.assertEquals(newName,actual);
    }

}

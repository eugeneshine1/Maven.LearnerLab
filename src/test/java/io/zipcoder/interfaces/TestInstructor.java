package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {
    public void Instructor () {

    }
    @Test
    public void implementationTest() {
        Instructor instructor = new Instructor();
        Assert.assertTrue(instructor instanceof Teacher);

    }
    @Test
    public void inheritanceTest() {
        Instructor instructor = new Instructor();
        Assert.assertTrue(instructor instanceof Person);

    }
    @Test
    public void testTeach() {


    }@Test
    public void testLecture() {


    }


}

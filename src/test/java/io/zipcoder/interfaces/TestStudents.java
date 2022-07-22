package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudents {
    @Test
    public void testGetInstance () {
        Student student = new Student(0,"bob");

        Assert.assertTrue(Students.getInstance().contains(student));
    }

}

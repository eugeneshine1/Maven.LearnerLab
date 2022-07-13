package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {
    @Test
    public void testImplementation() {
        long expectedId = 12;
        String expectedName = "Eugene";

        Student student = new Student(expectedId, expectedName);

        Assert.assertTrue(student instanceof Learner);
    }

    @Test
    public void testInheritance() {
        long expectedId = 12;
        String expectedName = "Eugene";

        Student student = new Student(expectedId, expectedName);

        Assert.assertTrue(student instanceof Person);
    }

    @Test
    public void testLearn() {
        long expectedId = 12;
        String expectedName = "Eugene";
        Double numberOfHours =1.0;

        Student student = new Student(expectedId, expectedName);
        student.learn(numberOfHours);

        Assert.assertEquals(numberOfHours,student.getTotalStudyTime());

    }
}

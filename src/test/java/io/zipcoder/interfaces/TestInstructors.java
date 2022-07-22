package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {
    @Test
    public void testGetInstance() {
        Instructor instructor = new Instructor(3, "tim");

        Assert.assertTrue(Instructors.getInstance().contains(instructor));
    }
}

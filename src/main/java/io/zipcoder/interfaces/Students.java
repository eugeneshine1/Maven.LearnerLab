package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.List;

public final class Students extends People<Student>{
    private static final Students INSTANCE = new Students();
    private final List<Student> list;

    public Students () {
        list = new ArrayList<>();

    }
    public void add(Student student) {
        list.add(student);
    }
    public boolean contains(Student student){
        return list.contains(student);
    }
    public static Students getInstance() {
        return INSTANCE;
    }

}

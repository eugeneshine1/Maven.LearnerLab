package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.List;

public final class Instructors extends People<Instructor>{

    private static final Instructors INSTANCE = new Instructors();
    private final List<Instructor> list;

    public Instructors() {
        this.list = new ArrayList<>();
    }

    public void add(Instructor instructor) {
        list.add(instructor);
    }
    public boolean contains(Instructor instructor){
        return list.contains(instructor);
    }
    public static Instructors getInstance() {
        return INSTANCE;
    }
}

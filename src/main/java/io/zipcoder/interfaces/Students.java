package io.zipcoder.interfaces;

public final class Students extends People<Student>{
    private static final Students INSTANCE = new Students();

    public Students () {
        Student bob = new Student(1,"Bob");
        this.add(bob);

    }
    public static Students getInstance() {
        return INSTANCE;
    }

}

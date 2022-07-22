package io.zipcoder.interfaces;

public class Person {
    private final long id;
    private String name;

    public Person () {
        this.id =0;
        this.name="";

    }


    public Person(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setName(String name) {
        this.name =name;
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

}

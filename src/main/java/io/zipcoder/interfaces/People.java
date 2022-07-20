package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People<S extends Person> implements Iterable<Person>{
    private List<Person> personList;
    public People () {

        this.personList = new ArrayList<Person>();
    }

    public void add (Person person) {
        personList.add(person);
    }

    public Person findById (long id) {
        for (Person p : personList) {
            if (p.getId()== id) {
                return p;
            }
        }
        return null;
    }
    public boolean contains (Person person) {
        return personList.contains(person);
    }

    public void remove (long id, Person person) {
        for (Person p : personList) {
            if (p.getId()==id) {
                personList.remove(p);
            }
        }
    }

    public void removeAll () {
//        personList.removeAll(personList);
        personList.clear();
    }

    public int count() {
        return personList.size();
    }

    public Person[] toArray() {
        return personList.toArray(new Person[0]);
    }

    public Iterator<Person> iterator() {
        return personList.iterator();
    }
}

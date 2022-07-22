package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People<E extends Person> implements Iterable<E>{
    private List<E> personList;
    public People () {

        this.personList = new ArrayList<>();
    }

    public void add (E person) {
        personList.add(person);
    }

    public E findById (long id) {
        for (E p : personList) {
            if (p.getId()== id) {
                return p;
            }
        }
        return null;
    }
    public boolean contains (E person) {
        return personList.contains(person);
    }

    public void remove (long id, E person) {
        for (E p : personList) {
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

    public Iterator<E> iterator() {
        return personList.iterator();
    }
}

package org.example.hw3;

import java.util.Iterator;
import java.util.List;

public class StreamIterator implements Iterator<StudentGroup> {
    private List<StudentGroup> studentGroups;
    private int counter;


    @Override
    public boolean hasNext() {
        return counter < studentGroups.size();
    }

    @Override
    public StudentGroup next() {
        if(hasNext()){
            return studentGroups.get(counter++);
        }
        return null;
    }

    @Override
    public void remove() {
        if(hasNext())
            studentGroups.remove(counter);
    }

}

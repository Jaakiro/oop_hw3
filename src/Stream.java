package org.example.hw3;

import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudentGroup>{
    private String nameOfGroup;
    private List<StudentGroup> groups;

    public Stream(String nameOfGroup, List<StudentGroup> groups){
        this.nameOfGroup = nameOfGroup;
        this.groups = groups;
    }

    public String getNameOfGroup() {
        return nameOfGroup;
    }

    public List<StudentGroup> getGroups() {
        return groups;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return groups.iterator();
    }
}

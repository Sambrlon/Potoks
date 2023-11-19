package main.java.edu.GroupsCops.models;

import java.util.Iterator;
import java.util.List;

public class Potok implements Iterable<EducationalGroup> {
    private List<EducationalGroup> educationalGroups;

    public Potok(List<EducationalGroup> educationalGroups) {
        this.educationalGroups = educationalGroups;
    }

    public Iterator<EducationalGroup> iterator() {
        return educationalGroups.iterator();
    }
}

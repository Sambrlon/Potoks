package main.java.edu.GroupsCops.service;

import main.java.edu.GroupsCops.models.EducationalGroup;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PotokService {
    public static void sortEducationalGroups(List<EducationalGroup> educationalGroups) {
        Collections.sort(educationalGroups, Comparator.comparingInt(group -> group.getStudents().size()));
    }
}

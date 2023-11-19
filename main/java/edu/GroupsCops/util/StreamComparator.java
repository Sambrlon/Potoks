package main.java.edu.GroupsCops.util;

import main.java.edu.GroupsCops.models.Potok;

import java.util.Comparator;

public class StreamComparator implements Comparator<Potok> {
    @Override
    public int compare(Potok potok1, Potok potok2) {
        long size1 = potok1.spliterator().getExactSizeIfKnown();
        long size2 = potok2.spliterator().getExactSizeIfKnown();
        
        // Cast the long values to int
        return Long.compare(size1, size2);
    }
}

package org.example.hw3;

import java.util.Comparator;

public class StreamComparator implements Comparator<Stream> {

    @Override
    public int compare(Stream o1, Stream o2) {
        int quantityGroups1 = o1.getGroups().size();
        int quantityGroups2 = o2.getGroups().size();

        return Integer.compare(quantityGroups1,quantityGroups2);
    }
}

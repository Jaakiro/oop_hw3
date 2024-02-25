package org.example.hw3;

import java.util.List;

public class StreamService {
    public List<Stream> sortStream(List<Stream> streams){
        streams.sort(new StreamComparator());
        return streams;
    }
}

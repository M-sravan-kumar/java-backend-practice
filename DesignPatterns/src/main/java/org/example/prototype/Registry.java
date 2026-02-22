package org.example.prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {
    private Map<String,NoteBook> map =
            new HashMap<>();

    public void register(String key , NoteBook noteBook)
    {
        map.put(key,noteBook);
    }
    public NoteBook get(String key)
    {
        return map.get(key);
    }

}

package com.sethanantp.sfgpetclinic.services.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractMapService<T, ID> {
    protected Map<ID, T> map = new HashMap<>();

    Set<T> findAll() {
        return new HashSet<>(this.map.values());
    }

    T findById(ID id) {
        return this.map.get(id);
    }

    T save(ID id, T object) {
        this.map.put(id, object);
        return object;
    }

    void deleteById(ID id) {
        map.remove(id);
    }

    void delete(T object) {
        this.map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }
}

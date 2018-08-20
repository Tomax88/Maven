package com.academy.lesson17;
import java.util.List;
import java.util.Map;

public class Abonents {
    private Map<Long, Abonent> abonents;

    public Abonents(Map<Long, Abonent> abonents) {
        this.abonents = abonents;
    }

    public Map<Long, Abonent> getAbonents() {
        return abonents;
    }
    public Abonent getById(long abonent_id){
        return null;
    }
    public List<Abonent> getAll() {
        return null;
    }
    public  boolean add(Abonent abonent){
        return true;
    }
    public boolean remove(long abonent_id){
        return true;
    }
    public boolean edit(long abonent_id, Abonent abonent){
        return true;
    }
}

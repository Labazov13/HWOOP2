package org.example.exam2;

public abstract class Reptiles {
    private String name;
    public Reptiles(String name){
        this.name = name;
    }
    public abstract String feed();

    @Override
    public String toString() {
        return String.format("Name: %s, feed: %s", name, feed());
    }
}

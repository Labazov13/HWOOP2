package org.example.exam2;

public abstract class Invertebrates extends Reptiles{
    public Invertebrates(String name) {
        super(name);
    }

    public String feed(){
        return "bug or meat";
    }
}

package org.example.exam2;

public abstract class Amphibians extends Reptiles{
    public Amphibians(String name) {
        super(name);
    }
    public String feed(){
        return "bug";
    }
}

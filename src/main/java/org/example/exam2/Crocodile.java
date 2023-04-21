package org.example.exam2;

public class Crocodile extends Amphibians implements SayAble, PoisonAble{
    public Crocodile(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "croc";
    }

    @Override
    public String poisonRate() {
        return "never";
    }
}

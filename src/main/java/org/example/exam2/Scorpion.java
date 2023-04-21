package org.example.exam2;

public class Scorpion extends Invertebrates implements PoisonAble {

    public Scorpion(String name) {
        super(name);
    }

    @Override
    public String poisonRate() {
        return "always";
    }
}

package org.example.exam2;

public class Frog extends Amphibians implements SayAble, PoisonAble{
    public Frog(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Kva";
    }

    @Override
    public String poisonRate() {
        return "sometimes";
    }
}

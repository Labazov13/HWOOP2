package org.example;

public class Rabbit extends Herbivores implements WalkAble{
    public Rabbit(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "FFFF";
    }

    @Override
    public String toString() {
        return String.format("Rabbit, %s", super.toString());
    }

    @Override
    public int speedWalk() {
        return 25;
    }
}

package org.example;

public class Wolf extends Predator implements WalkAble{
    public Wolf(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "wuuuf";
    }

    @Override
    public String toString() {
        return String.format("Wolf, %s", super.toString());
    }

    @Override
    public int speedWalk() {
        return 40;
    }
}

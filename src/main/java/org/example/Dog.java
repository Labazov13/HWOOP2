package org.example;

public class Dog extends Predator implements WalkAble, SayAble, SpeedSwimAble{
    public Dog(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Woof";
    }

    @Override
    public int speedSwim() {
        return 10;
    }

    @Override
    public int speedWalk() {
        return 35;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

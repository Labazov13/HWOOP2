package org.example;

public class Duck extends Herbivores implements WalkAble,FlyAble{

    public Duck(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Krya";
    }

    @Override
    public int speedForFly() {
        return 80;
    }

    @Override
    public int speedWalk() {
        return 5;
    }
}

package org.example.exam2;

public class Spider extends Invertebrates implements PoisonAble{
    public Spider(String name) {
        super(name);
    }

    @Override
    public String poisonRate() {
        return "more often";
    }
}

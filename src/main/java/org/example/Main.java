package org.example;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.setRadio(new Radio());
        zoo.addList(new Wolf("Karl"))
                .addList(new Rabbit("Rabbit"))
                .addList(new Duck("Doc"))
                .addList(new Dog("Sharik"));
        for(var item : zoo.getAnimalList()){
            System.out.println(item);
        }
        System.out.println("*******************************");
        for(var item : zoo.getSayable()){
            System.out.println(item.say());
        }
        System.out.println("*******************************");
        for(var item : zoo.walkAbles()){
            System.out.println(item.toString());
        }
        System.out.println("*******************************");
        for(var item : zoo.flyAbles()){
            System.out.println(item.toString());
        }
        System.out.println("**********");
        System.out.println("Winner " + zoo.winnerWalk());
    }
}
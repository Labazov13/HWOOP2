package org.example.exam2;

public class Main {
    public static void main(String[] args) {
        Terrarium terrarium = new Terrarium();
        terrarium.addList(new Crocodile("Croco"))
                .addList(new Frog("Froggie"))
                .addList(new Spider("Piter"))
                .addList(new Scorpion("Scorpy"));
        //Отображение списка всего террариума:
        for(var item : terrarium.getReptilesList()){
            System.out.println(item);
        }
        //Отображение наличия у рептилии из террариума яда и возможность укуса
        for(var item : terrarium.poisonAbleList()){
            System.out.println(item.poisonRate());
        }
    }
}

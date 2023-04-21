package org.example.exam2;

import org.example.Animal;
import org.example.SayAble;
import org.example.Zoo;

import java.util.ArrayList;
import java.util.List;

public class Terrarium {
    private List<Reptiles> reptilesList = new ArrayList<>();

    public List<Reptiles> getReptilesList() {
        return reptilesList;
    }

    public Terrarium addList(Reptiles rep) {
        reptilesList.add(rep);
        return this;
    }


    public List<PoisonAble> poisonAbleList() {
        List<PoisonAble> poisonAbles = new ArrayList<>();
        for (var item : reptilesList) {
            poisonAbles.add((PoisonAble) item);
        }
        return poisonAbles;
    }

}

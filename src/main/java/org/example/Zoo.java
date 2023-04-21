package org.example;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List <Animal> animalList = new ArrayList<>();
    public List <Animal> getAnimalList(){
        return animalList;
    }

    public Zoo addList(Animal an){
        animalList.add(an);
        return this;
    }

    private Radio radio;

    public void setRadio(Radio radio){
        this.radio = radio;
    }

    public List<SayAble> getSayable(){
        List<SayAble> sayAbles = new ArrayList<>();
        for(var item : animalList){
            sayAbles.add(item);
        }
        sayAbles.add(radio);
        return sayAbles;
    }


    public List<WalkAble> walkAbles(){
        List<WalkAble> walkAbleList = new ArrayList<>();
        for(var item : animalList){
            if(item instanceof WalkAble){
                walkAbleList.add((WalkAble) item);
            }
        }
        return walkAbleList;
    }

    public List<FlyAble> flyAbles(){
        List<FlyAble> flyAbleList = new ArrayList<>();
        for(var item : animalList){
            if(item instanceof FlyAble){
                flyAbleList.add((FlyAble) item);
            }
        }
        return flyAbleList;
    }

    public WalkAble winnerWalk(){
        int index = 0;
        for(int i = 0; i < walkAbles().size(); i++){
            if(walkAbles().get(i).speedWalk() > walkAbles().get(index).speedWalk()){
                index = i;
            }
        }
        return walkAbles().get(index);
    }

}

package com.HeadFirstJAVA;

import javax.lang.model.element.AnnotationMirror;
import java.util.ArrayList;
import java.util.HashMap;

public class testMap {
    public static void main(String[] args) {
        HashMap<String,Integer> scores = new HashMap<String,Integer>();
        scores.put("Snajdan",11);
        scores.put("forfolja",773);
        scores.put("5acad",77);

        System.out.println(scores);
        System.out.println(scores.get("forfolja"));
    }

    public void go(){
        ArrayList<Animal> animals  = new ArrayList<Animal>();
        animals.add(new Dogs());
        animals.add(new Cat());
        animals.add(new Dogs());
        takeAnimals(animals);

        ArrayList<Dogs> dogs1 = new ArrayList<Dogs>();
        dogs.add(new Dogs());
        dogs.add(new Dogs());
        takeAnimals(dogs1);
    }

    public void takeAnimals(ArrayList<? extends Animal>animals){
        for(Animal a:animals);
        a.eat();
    }

}

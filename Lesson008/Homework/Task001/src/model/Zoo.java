package model;

import model.abstractClass.Animal;
import model.interfaceClass.Floating;
import model.interfaceClass.Flyable;
import model.interfaceClass.Runable;
import model.interfaceClass.Sayable;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    List<Animal> animalList = new ArrayList<>();
    Sayable radio;

    public Zoo(List<Object> animals, Sayable talkingObj) {
        List<Animal> animalList = new ArrayList<Animal>();
        this.radio = talkingObj;
        for (Object item: animals) {
            animalList.add((Animal) item);
        }
        this.animalList.addAll(animalList);

    }

    public List<Runable> getRunableList() {
        List<Runable> runableList = new ArrayList<>();
        for (Animal animal : this.animalList) {
            if (animal instanceof Runable) {
                runableList.add((Runable) animal);
            }
        }
        return runableList;
    }

    public List<Flyable> getFlyableList() {
        List<Flyable> flyableList = new ArrayList<>();
        for (Animal animal : this.animalList) {
            if (animal instanceof Flyable) {
                flyableList.add((Flyable) animal);
            }
        }
        return flyableList;
    }

    public List<Floating> getSwimableList() {
        List<Floating> swimableList = new ArrayList<>();
        for (Animal animal : this.animalList) {
            if (animal instanceof Floating) {
                swimableList.add((Floating) animal);
            }
        }
        return swimableList;
    }

    public Animal getRunChampion(){
        List<Runable> runners = getRunableList();
        Runable champion = runners.get(0);
        for (Runable r : runners){
            if(champion.getSpeedRun() < r.getSpeedRun()){
                champion = r;
            }
        }
        return (Animal) champion;
    }

    public Animal getFlightChampion(){
        List<Flyable> flyers = getFlyableList();
        Flyable champion = flyers.get(0);
        for (Flyable r : flyers){
            if(champion.getSpeedFlyable() < r.getSpeedFlyable()){
                champion = r;
            }
        }
        return (Animal) champion;
    }
    public Animal getSwimChampion(){
        List<Floating> swims = getSwimableList();
        Floating champion = swims.get(0);
        for (Floating r : swims){
            if(champion.getFloatingSpeed() < r.getFloatingSpeed()){
                champion = r;
            }
        }
        return (Animal) champion;
    }

}




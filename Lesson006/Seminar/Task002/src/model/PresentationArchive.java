package model;

import java.util.HashMap;
import java.util.Map;

public class PresentationArchive {
    Map<Integer, Bulldogka> buldogkaList = new HashMap<>();

    public void addBuldogca(Bulldogka newBuldogka, Integer place) {
        buldogkaList.put(place, newBuldogka);
    }

    public void toSeeArchive(){
        System.out.println(buldogkaList);
    }

}

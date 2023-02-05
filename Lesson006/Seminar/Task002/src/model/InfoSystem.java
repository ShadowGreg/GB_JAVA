package model;

import java.util.HashMap;
import java.util.Map;

public class InfoSystem {
    Map<ShowTime, Bulldogka> buldogkaList = new HashMap<>();

    public void addBuldogca(Bulldogka newBuldogka, ShowTime nameShow) {
        buldogkaList.put(nameShow, newBuldogka);
    }

    public void toSeeArchive() {
        System.out.println(buldogkaList);

    }

}


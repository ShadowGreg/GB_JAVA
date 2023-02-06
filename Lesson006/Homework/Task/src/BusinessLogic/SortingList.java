package BusinessLogic;

import Entitys.Computer;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;

public class SortingList {
    public static TreeMap<Integer, Computer> sortByPrice(Set<Computer> inputSet) {
        TreeMap<Integer, Computer> sortByPrice = new TreeMap<>();
        for (Computer computer : inputSet) {
            sortByPrice.put(computer.getPrise(), computer);
        }
        return sortByPrice;
    }
}

import BusinessLogic.Filter;
import BusinessLogic.SortingList;
import Entitys.Store;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();

        Map<String, String> sortStore = new HashMap<>();
        sortStore.put("Linux", "RED");
        sortStore.put("Linux", "Blue");

        var filteredTable = Filter.getFilteredComputersBy(sortStore, store.getComputersFromStore());
        System.out.println(filteredTable);

        System.out.println(SortingList.sortByPrice(filteredTable));


    }
}
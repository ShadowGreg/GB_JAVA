package BusinessLogic;

import Entitys.Computer;
import Entitys.Notebook;

import java.util.*;

public class Filter {

    public static Set<Computer> getFilteredComputersBy(Map<String, String> params, List<Computer> putStore) {
        List<String> sortedComputers = new ArrayList<>();
        Set<Computer> filteredComputers = new HashSet<>();
        Set<String> keys = params.keySet();
        for (Computer computer : putStore) {
            for (String key : keys) {
                if (computer.getComputer().contains(key) && computer.getComputer().contains(params.get(key))) {
                    sortedComputers.add(computer.getComputer());
                }
            }
        }
        Collections.sort(sortedComputers);
        for (String computer : sortedComputers) {
            filteredComputers.add(new Notebook(computer));
        }
        return filteredComputers;
    }

}
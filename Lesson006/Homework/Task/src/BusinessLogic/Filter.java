package BusinessLogic;

import Entitys.Computer;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Filter {

    public static List<Computer> getFilteredComputersBy(Map<String, String> params, List<Computer> putStore) {
        List<Computer> filteredComputers = new ArrayList<>();
        Set<String> keys = params.keySet();
        for (Computer computer : putStore) {
            for (String key : keys) {
                if (computer.getComputer().contains(key) && computer.getComputer().contains(params.get(key))) {
                    filteredComputers.add(computer);
                }
            }
        }
        return filteredComputers;
    }

}
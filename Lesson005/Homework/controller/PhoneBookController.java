package controller;

import model.PhoneBook;
import model.PhoneBookEntry;

import java.util.*;
import java.util.stream.Collectors;

public class PhoneBookController {
    PhoneBook temPhoneBook = new PhoneBook();

    public PhoneBookController() {
        List<String> textRecords = Arrays.asList(
                "Иван Иванов 88001122333",
                "Иван Курицин 88001662333",
                "Иван Курицин 88001112333",
                "Иван Незлобин 88001122432",
                "Сергей Потапов 88001112453",
                "Сергей Потапов 8800163214",
                "Сергей Курицин 8800142421",
                "Михаил Незлобин 880012343"
        );

        for (String items : textRecords) {
            PhoneBookEntry temPhoneEntry = new PhoneBookEntry(items);
            temPhoneBook.addEntry(temPhoneEntry);
        }

    }
    public void printNamesList(){
        List<String> printNamesList = getNamesList();
        for (String item : printNamesList) {
            System.out.println(item);
        }
    }

    private List<String> getNamesList() {
        List<String> outList = new ArrayList<>();
        int minCount = 1;
        Map<String, Integer> tempPhoneBook = temPhoneBook.getPopularNameTable();
        List<Integer> valuesList = getReverseList(tempPhoneBook);
        Map<Integer, String> swapped = tempPhoneBook.entrySet().stream().collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey));
        for (Integer number : valuesList) {
            if (number != minCount) {
                outList.add(new StringBuilder(swapped.get(number) + " - " + number).toString());
            }
        }
        return outList;
    }

    private List<Integer> getReverseList(Map<String, Integer> tempPhoneBook) {
        List<Integer> valuesList = new ArrayList<>(tempPhoneBook.values());
        Collections.sort(valuesList);
        Collections.reverse(valuesList);
        return valuesList;
    }
}

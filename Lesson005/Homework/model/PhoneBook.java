package model;

import java.util.*;

public class PhoneBook {
    private final Map<String, List<String>> phoneMap;
    private final Map<String, Integer> popularName;

    public PhoneBook() {
        phoneMap = new HashMap<>();
        popularName = new HashMap<>();
    }

    public void addEntry(PhoneBookEntry entry) {
        addNameRating(entry.getName(), entry.getNameAndSurname());
        if (!phoneMap.containsKey(entry.getNameAndSurname())) {
            setNewEntry(entry);
        } else {
            putNewPhoneInEntry(entry);
        }
    }

    private void setNewEntry(PhoneBookEntry entry) {
        List<String> temp = Arrays.asList(entry.getPhoneNumbers());
        phoneMap.put(entry.getNameAndSurname(), temp);
    }

    private void putNewPhoneInEntry(PhoneBookEntry entry) {
        List<String> phoneList = new ArrayList<>(phoneMap.get(entry.getNameAndSurname()));
        phoneList.add(entry.getPhoneNumbers());
        phoneMap.put(entry.getNameAndSurname(), phoneList);
    }

    private void addNameRating(String name, String nameAndSurname) {
        Integer firstIndex = 1;
        if (popularName.containsKey(name) && !phoneMap.containsKey(nameAndSurname)) {
            popularName.put(name, (popularName.get(name) + 1));
        } else if (!popularName.containsKey(name)){
            popularName.put(name, firstIndex);
        }
    }

    public Map<String, Integer> getPopularNameTable() {
        return popularName;
    }


}

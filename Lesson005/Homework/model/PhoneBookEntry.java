package model;

public class PhoneBookEntry {
    private String name = "";
    private String surname = "";
    private String nameAndSurname = "";
    private String phoneNumber = "";

    public PhoneBookEntry(String inputText) {
        int name = 0;
        int surname = 1;
        int phoneNumber = 2;
        String[] tempText = inputText.split(" ");
        this.name = tempText[name];
        this.surname = tempText[surname];
        this.phoneNumber = tempText[phoneNumber];
        this.nameAndSurname = (new StringBuilder(tempText[name] + " " + tempText[surname])).toString();
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPhoneNumbers() {
        return phoneNumber;
    }

    public String getNameAndSurname() {
        return nameAndSurname;
    }
}

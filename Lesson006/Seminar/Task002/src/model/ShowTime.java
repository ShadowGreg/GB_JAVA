package model;

public class ShowTime {
    private String name = "";
    private String date = "";
    private String time = "";


    public ShowTime(String name, String date, String time) {
        this.name = name;
        this.date = date;
        this.time = time;
    }

    @Override
    public String toString() {
        return String.format(" %s %s \n", date, name);
    }
}

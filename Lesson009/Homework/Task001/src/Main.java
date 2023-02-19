import myList.MyLinkedList;
import myList.MyList;

public class Main {
    public static void main(String[] args) {
        MyList<String> myList = new MyList<>();
        int maxNumber = 10;

        for (int i = 0; i < maxNumber; i++) {
            myList.add(String.format("Hello %d world!", i));
        }

        for (String item : myList) {
            System.out.println(item);
        }

        System.out.println(myList.getHead());
        System.out.println(myList.getTail());


        myList.add("Hello 123 world!");

        for (String item : myList) {
            System.out.println(item);
        }

        System.out.println(myList.getHead());
        System.out.println(myList.getTail());
        System.out.println();

        MyLinkedList<String> linkedList = new MyLinkedList<>();

        for (int i = 0; i < maxNumber; i++) {
            linkedList.add(String.format("Hi %d people!", i));
        }

        for (String item : linkedList) {
            System.out.println(item);
        }

        boolean temp = linkedList.iterator().hasPrevious();

        while (linkedList.iterator().hasPrevious()){
            System.out.println(linkedList.iterator().previous());
        }

    }
}
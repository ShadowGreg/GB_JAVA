import java.util.*;

public class Task001 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
//        вотпрос на диаграмме в леции ArrayList ниже по уровню структуры чем List
//        однако работает струкутра ниже - почему?
        List<Integer> list2 = new ArrayList<>();
        Map<Integer, Integer> map1 = new HashMap<>();
        System.out.println(list1);
        list1.add(13);
        System.out.println(list1);
        System.out.println(list1.get(0));
        System.out.println(list1.indexOf(13));
        System.out.println(list1.indexOf(12));
        list1.add(12);
        list1.add(14);
        list1.add(13);
        list1.add(15);
        System.out.println(list1);
        System.out.println(list1.remove(3));
        System.out.println(list1);
        try {
            System.out.println(list1.set(5, 13));
        } catch (Exception e) {
            System.out.println(e);
        }
//        Почему если в памяти предусматривается больше ячеек на массив - я не могу вставить в ячейку дальше существующего?
        System.out.println(list1);
        System.out.println(list1.set(3, 13));
        System.out.println(list1);
        Integer[] array1 = {2, 6, 341, 98, 1, 5, 89};
        System.out.println(Arrays.toString(array1));
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));
        // Почему если масси в объявлен int[] то я не могу сделать List<Integer> - ведь Integer обёртка?
        list2 = Arrays.asList(array1);
        List<Integer> list3 = list2.subList(1,5);
        System.out.println(list3);
        try {
            list3.clear();
            list2.clear();
//            почему не срабатывает очистка обоих листов?

        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(list3);
        System.out.println(list2);

        Collection<String> list = new LinkedList<String>();

        // use add() method to add elements in the list
        list.add("Geeks");
        list.add("for");
        list.add("Geeks");

        // Output the present list
        System.out.println("The list is: " + list);

        // Clearing the LinkedList
        list.clear();

        // printing the new list
        System.out.println("The new List is: " + list);

        list.add("Geeks");
        list.add("for");
        list.add("Geeks");

        String text = list.toString();

        System.out.println(text);

        List<String> list4 = new ArrayList<>();
        list4.add("Melisa");
        list4.add("Myatnaya");
        list4.add("Lutiki");
        list4.add("Geeks");

        // Почему не работает объявление List<String> list4 = new List<>()?;
       System.out.println(list);
       System.out.println(list4);

       System.out.println( list4.contains(list));



    }
}

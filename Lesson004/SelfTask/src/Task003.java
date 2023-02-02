import java.util.*;

public class Task003 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        ListIterator<String> listIterator = Arrays.asList("One", "Two", "Three").listIterator();

        // Add elements to the map
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");

        // Add elements to the set
        set.add(1);
        set.add(2);
        set.add(3);

        // Add elements to the list iterator


        // Iterate through the map
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // Iterate through the set
        for (Integer i : set) {
            System.out.println(i);
        }

        // Iterate through the list iterator
        while (listIterator.hasPrevious()) {
            String element = listIterator.previous();
            System.out.println(element + " ");
        }

        List<String> list= new ArrayList<String>();
        list.add("hi");
        list.add("whats up");
        list.add("how are you");
        list.add("bye");
        ListIterator<String> iterator = list.listIterator();
        int i=0;
        while(iterator.hasNext()){
            iterator.next();
            iterator.add(Integer.toString(i++));
        }
        System.out.println(list);

    }

}

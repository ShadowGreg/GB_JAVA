import java.lang.reflect.Array;
import java.util.*;

public class Main {
    static Set<Integer> set1 = new HashSet<>();
    static Set<Integer> set2 = new LinkedHashSet<>();
    static Set<Integer> set3 = new TreeSet<>();

    public static void main(String[] args) {
        initHashSet();
        initLinkedHashSet();
        initTreeSet();
        System.out.println(set1);
        System.out.println(set2);
        System.out.println(set3);
    }

    public static void initHashSet(){
        set1 = new HashSet<>(Arrays.asList(1, 2, 3, 2, 4, 5, 6, 3));

    }

    public static void initLinkedHashSet(){
        set2 = new HashSet<>(Arrays.asList(1, 2, 3, 2, 4, 5, 6, 3));

    }

    public static void initTreeSet(){
        set3 = new HashSet<>(Arrays.asList(1, 2, 3, 2, 4, 5, 6, 3));

    }
}
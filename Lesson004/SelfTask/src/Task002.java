import java.util.ArrayList;
import java.util.LinkedList;

public class Task002 {
    public static void main(String[] args) {
        final int ENTITY = 47_483_600;
        ArrayList<Integer> firstCollection = findExecuteTime(createRandomArray(ENTITY));
        LinkedList<Integer> secondCollection = findExecuteTime(createRandomLinkedList(ENTITY));

        findExecuteTime(deleteOneElementArray(firstCollection, 4));
        findExecuteTime(deleteOneElementList(secondCollection, 5));

        findExecuteTime(deleteHalfElementArray(firstCollection));
        findExecuteTime(deleteHalfElementList(secondCollection));

    }
//    Делаем случайный массив :
//    Время выполнения > 1_699 ms
//    Делаем случайный линкедлист :
//    Время выполнения > 13_417 ms
//    Время удаления из массива:
//    Время выполнения > 82 ms
//    Время удаления из линкедлиста:
//    Время выполнения > 0 ms
//    Время удаления половины массива:
//    Время выполнения > 36 ms
//    Время удаления половины линкедлиста:
//    Время выполнения > 141 ms
//    Такой же не очевидный результат после выделеняи в отдельные структуры.
    interface myInterfaceArray {
        ArrayList<Integer> run();
    }
    interface myInterfaceList {
        LinkedList<Integer> run();
    }

    private static ArrayList<Integer> findExecuteTime(myInterfaceArray function) {
        long start = System.currentTimeMillis();
        ArrayList<Integer> outputCollection = function.run();
        long end = System.currentTimeMillis();
        System.out.println("Время выполнения > " + (end - start) + "ms");
        return outputCollection;
    }

    private static LinkedList<Integer> findExecuteTime(myInterfaceList function) {
        long start = System.currentTimeMillis();
        LinkedList<Integer> outputCollection = function.run();
        long end = System.currentTimeMillis();
        System.out.println("Время выполнения > " + (end - start) + "ms");
        return outputCollection;
    }

    private static myInterfaceArray deleteHalfElementArray(ArrayList<Integer> inputCollection) {
        myInterfaceArray myInterfaceArray = new myInterfaceArray() {
            public ArrayList<Integer> run() {
                    System.out.println("Время удаления половины массива: ");
                     inputCollection.remove( inputCollection.size() / 2);

                return inputCollection;
            }
        };
        return myInterfaceArray;
    }
    private static myInterfaceList deleteHalfElementList(LinkedList<Integer> inputCollection) {
        myInterfaceList myInterfaceArray = new myInterfaceList() {
            public LinkedList<Integer> run() {
                    System.out.println("Время удаления половины линкедлиста: ");
                    inputCollection.remove(inputCollection.size() / 2);

                return inputCollection;
            }
        };
        return myInterfaceArray;
    }


    private static myInterfaceArray deleteOneElementArray(ArrayList<Integer> inputCollection, int i) {
        myInterfaceArray myInterfaceArray = new myInterfaceArray() {
            public ArrayList<Integer> run() {
                    System.out.println("Время удаления из массива: ");
                   inputCollection.remove(i);

                return inputCollection;
            }
        };
        return myInterfaceArray;
    }

    private static myInterfaceList deleteOneElementList(LinkedList<Integer> inputCollection, int i) {
        myInterfaceList myInterfaceArray = new myInterfaceList() {
            public LinkedList<Integer> run() {
                    System.out.println("Время удаления из линкедлиста: ");
                    inputCollection.remove(i);

                return inputCollection;
            }
        };
        return myInterfaceArray;
    }


    private static myInterfaceList createRandomLinkedList(int entity) {
        myInterfaceList myInterfaceArray = new myInterfaceList() {

            public LinkedList<Integer> run() {
                System.out.println("Делаем случайный линкедлист :");
                LinkedList<Integer> linkedList = new LinkedList<>();
                for (int i = 0; i < entity; i++) {
                    linkedList.add((int) (Math.random() * entity));
                }
                return linkedList;
            }
        };
        return myInterfaceArray;
    }

    private static myInterfaceArray createRandomArray(int entity) {
        myInterfaceArray myInterfaceArray = new myInterfaceArray() {
            public ArrayList<Integer> run() {
                System.out.println("Делаем случайный массив :");
                ArrayList<Integer> array = new ArrayList<Integer>();
                for (int i = 0; i < entity; i++) {
                    array.add((int) (Math.random() * entity));
                }
                return array;
            }
        };
        return myInterfaceArray;
    }
}

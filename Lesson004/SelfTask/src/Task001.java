import java.util.ArrayList;
import java.util.LinkedList;

public class Task001 {
    public static void main(String[] args) {
        final int ENTITY = 47_483_600;
        ArrayList<Integer> firstCollection = (ArrayList<Integer>) findExecuteTime(createRandomArray(ENTITY));
        LinkedList<Integer> secondCollection = (LinkedList) findExecuteTime(createRandomLinkedList(ENTITY));

        findExecuteTime(deleteOneElement(firstCollection, 4));
        findExecuteTime(deleteOneElement(secondCollection, 5));

        findExecuteTime(deleteHalfElement(firstCollection));
        findExecuteTime(deleteHalfElement(secondCollection));

    }

    interface myInterface {
        Object run();
    }

    private static Object findExecuteTime(myInterface function) {
        long start = System.currentTimeMillis();
        var outputCollection = function.run();
        long end = System.currentTimeMillis();
        System.out.println("Время выполнения > " + (end - start) + "ms");
        return outputCollection;
    }

    private static myInterface deleteHalfElement(Object inputCollection) {
        myInterface myInterfaceArray = new myInterface() {
            public Object run() {
                if (inputCollection instanceof ArrayList<?>) {
                    System.out.println("Время удаления половины массива: ");
                    ((ArrayList<?>) inputCollection).remove(((ArrayList<?>) inputCollection).size() / 2);
                } else if (inputCollection instanceof LinkedList<?>) {
                    System.out.println("Время удаления половины линкедлиста: ");
                    ((LinkedList<?>) inputCollection).remove(((LinkedList<?>) inputCollection).size() / 2);
                }
                return inputCollection;
            }
        };
        return myInterfaceArray;
    }

    private static myInterface deleteOneElement(Object inputCollection, int i) {
        myInterface myInterfaceArray = new myInterface() {
            public Object run() {
                if (inputCollection instanceof ArrayList<?>) {
                    System.out.println("Время удаления из массива: ");
                    ((ArrayList<?>) inputCollection).remove(i);

                } else if (inputCollection instanceof LinkedList<?>) {
                    System.out.println("Время удаления из линкедлиста: ");
                    ((LinkedList<?>) inputCollection).remove(i);
                }
                return inputCollection;
            }
        };
        return myInterfaceArray;
    }


    private static myInterface createRandomLinkedList(int entity) {
        myInterface myInterfaceArray = new myInterface() {

            public Object run() {
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

    private static myInterface createRandomArray(int entity) {
        myInterface myInterfaceArray = new myInterface() {
            public Object run() {
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

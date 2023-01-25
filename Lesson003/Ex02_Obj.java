public class Ex02_Obj {
    public static void main(String[] args) {
        System.out.println(Sum(1, 2));
        System.out.println(Sum(1.0, 2));
        System.out.println(Sum(1, 2.2));
        System.out.println(Sum(1.2, 2.2));
    }

    private static Object Sum(Object v, Object v1) {
        if (v instanceof Double && v1 instanceof Double) {
            return (Object) ((Double) v + (Double) v1);

        } else if (v instanceof Integer && v1 instanceof Integer) {
            return (Object) ((Integer) v + (Integer) v1);

        } else {
            return 0;
        }
    }
}

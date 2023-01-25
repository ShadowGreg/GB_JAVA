public class Ex01_Obj {
    public static void main(String[] args) {
        Object obj = 1;
        GetType(obj);
        obj = 1.2;
        GetType(obj);
    }

    private static void GetType(Object obj) {
        System.out.println(obj.getClass().getName());
    }


}

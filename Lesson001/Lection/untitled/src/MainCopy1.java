//public class MainCopy1 {
//
//    public static void main(String[] args) {
//        short age = 10;
//        int salary = 123456;
//        String name = "Greg";
//        System.out.println(name.charAt(2));
//
//        System.out.println(age);
//        System.out.println(salary);
//        float e = 2.7f;
//        double pi = 3.1415;
//        System.out.println(e); // 2.7
//        System.out.println(pi); // 3.1415
//        char ch = '1';
//        System.out.println(Character.isDigit(ch)); // true
//        ch = 'a';
//        System.out.println(Character.isDigit(ch)); // false
//        boolean flag1 = 123 <= 234;
//        System.out.println(flag1); // true
//        boolean flag2 = 123 >= 234 || flag1;
//        System.out.println(flag2); // true
//        boolean flag3 = flag1 ^ flag2;
//        System.out.println(flag3); // false
//        String msg = "Hello world";
//        System.out.println(msg);
//        var a = 123;
//        System.out.println(a); // 123
//        var d = 123.456;
//        System.out.println(d); // 123.456
//
//        var f = 123;
//        System.out.println(a); // 123
//        var g = 123.456;
//        System.out.println(f); // 123.456
//        System.out.println(getType(f)); // Integer
//        System.out.println(getType(g)); // Double
//        f = 1022;
//        System.out.println(f); // 1022
//        //d = "mistake";
//        //error: incompatible types:
//        //String cannot be converted to double
//
//        System.out.println(Integer.MAX_VALUE); // 2147483647
//        System.out.println(Integer.MIN_VALUE); // -2147483648
//
//        float first = 231f;
//        int bigData = 123_123_123;
//
//        int firstTestIncrement = 123;
//        firstTestIncrement = --firstTestIncrement - firstTestIncrement--;
//        System.out.println(firstTestIncrement);
//        int secondTestIncrement = 123;
//        secondTestIncrement = secondTestIncrement-- - --secondTestIncrement;
//        System.out.println(secondTestIncrement);
//
//
//    }
//
//    static String getType(Object o) {
//        return o.getClass().getSimpleName();
//    }
//
//    Многомерные
// клас
//    public class Program {
//        public static void main(String[] args) {
//            int[] arr[] = new int[3][5];
//            for (int[] line : arr) {
//                for (int item : line) {
//                    System.out.printf("%d ", item);
//                }
//                System.out.println();
//            }
//        }
//    }
//
//    public class Program {
//        public static void main(String[] args) {
//            int[][] arr = new int[3][5];
//
//            for (int i = 0; i < arr.length; i++) {
//                for (int j = 0; j < arr[i].length; j++) {
//                    System.out.printf("%d ", arr[i][j]);
//                }
//                System.out.println();
//            }
//        }
//    }
//
//}
//public class Program {
//    public static void main(String[] args) {
//        int i = 123; double d = i;
//        System.out.println(i); // 123
//        System.out.println(d); // 123.0
//        d = 3.1415; i = (int)d;
//        System.out.println(d); // 3.1415
//        System.out.println(i); // 3
//        d = 3.9415; i = (int)d;
//        System.out.println(d); // 3.9415
//        System.out.println(i); // 3
//        byte b = Byte.parseByte("123");
//        System.out.println(b); // 123
//        b = Byte.parseByte("1234");
//        System.out.p

//
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner iScanner = new Scanner(System.in);
//        System.out.printf("int a: ");
//        int x = iScanner.nextInt();
//        System.out.printf("double a: ");
//        double y = iScanner.nextDouble();
//        System.out.printf("%d + %f = %f", x, y, x + y);
//        iScanner.close();
//    }
//}

//Проверка на соответствие получаемого типа
//import java.util.Scanner;
//public class Program {
//    public static void main(String[] args) {
//        Scanner iScanner = new Scanner(System.in);
//        System.out.printf("int a: ");
//        boolean flag = iScanner.hasNextInt();
//        System.out.println(flag);
//        int i = iScanner.nextInt();
//        System.out.println(i);
//        iScanner.close();
//    } }

//Некоторые примитивы
//import java.util.Scanner;
//public class Program {
//    public static void main(String[] args) {
//        Scanner iScanner = new Scanner(System.in);
//        System.out.printf("int a: ");
//        int x = iScanner.nextInt();
//        System.out.printf("double a: ");
//        double y = iScanner.nextDouble();
//        System.out.printf("%d + %f = %f", x, y, x + y);
//        iScanner.close();
//    }}
//Проверка на соответствие получаемого типа
//import java.util.Scanner;
//public class Program {
//    public static void main(String[] args) {
//        Scanner iScanner = new Scanner(System.in);
//        System.out.printf("int a: ");
//        boolean flag = iScanner.hasNextInt();
//        System.out.println(flag);
//        int i = iScanner.nextInt();
//        System.out.println(i);
//        iScanner.close();
//    } }


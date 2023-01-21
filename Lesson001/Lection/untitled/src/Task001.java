//    Задана натуральная степень k. Сформировать случайным
//    образом список коэффициентов (значения от 0 до 100)
//    многочлена многочлен степени k.
//   *Пример: k=2 => 2*x² + 4*x + 5 = 0 или x² + 5 = 0 или 10*x² = 0

import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;

public class Task001 {
    static String GetRandomDegree() {
        int MIN = 0;
        int MAX = 100;
        return String.valueOf(ThreadLocalRandom.current().nextInt(MIN, MAX + 1));
    }

    static void WriteToFile(String fileName, StringBuilder inputPolynomial) throws IOException {
        FileWriter file = new FileWriter(fileName,false);
        file.write(String.valueOf(inputPolynomial));
        file.flush();
        file.close();
    }

    static StringBuilder GetPolynomial(int inputDegree) {
        StringBuilder outputPolynomial = new StringBuilder(" = 0");
        for (int i = 0; i < inputDegree; i++) {
            if (GetRandomDegree() != "0") {
                if (i == 0)
                    outputPolynomial = new StringBuilder(GetRandomDegree() + outputPolynomial);
                else if (i == 1)
                    outputPolynomial = new StringBuilder(GetRandomDegree() + "*x" + " + " + outputPolynomial);
                else if (i != 0 && i != 1)
                    outputPolynomial = new StringBuilder(GetRandomDegree() + "*x^" + i + " + " + outputPolynomial);
            }
        }
        return outputPolynomial;
    }

    public static void main(String[] args) throws IOException {
        int degree = 5;
        StringBuilder firstRandomPolynomial;

        System.out.printf("k=%d => ", degree);
        firstRandomPolynomial = GetPolynomial(degree);
        System.out.print(firstRandomPolynomial);
        WriteToFile("src/firstPolynomial.txt", firstRandomPolynomial);
        WriteToFile("src/secondPolynomial.txt", GetPolynomial(degree));
    }
}

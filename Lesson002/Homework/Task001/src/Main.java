import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Main {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(Main.class.getName());
        FileHandler fh = new FileHandler("./Task001/log.txt");
        logger.addHandler(fh);
        logger.setUseParentHandlers(false);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);

        WriteToFile("./Task001/result.txt", String.valueOf(EnterNumber(logger)), logger);
    }

    private static void WriteToFile(String fileName, String enterNumber, Logger logger) {
        try {
            File file = new File(fileName);
            if (file.createNewFile()) {
                System.out.println("file.created");
                logger.info("file.created");
            } else {
                FileWriter fileWriter = new FileWriter(file, true);
                fileWriter.append(enterNumber);
                fileWriter.flush();
                fileWriter.close();
            }
        } catch (Exception e) {
            logger.info("Exception WriteToFile: " + e);
            System.out.println("Exception WriteToFile: " + e);
        }
        logger.info("Записали в файл");
    }


    private static Byte EnterNumber(Logger logger) {
        byte numToByte = 0;
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Почалуйста введите число: ");
            int num = scanner.nextInt();
            numToByte = (byte) num;
            logger.info("Введённое число: " + numToByte);
        } catch (Exception e) {
            logger.info("Exception EnterNumber: " + e);
            System.out.println("Exception : " + e);
        }

        return numToByte;
    }
}


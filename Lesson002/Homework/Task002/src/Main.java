import java.io.*;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Main {

    public static void main(String[] args) {
        String path = "./Task002/";
        String fileName = "example.txt";
        String fullPath = String.valueOf(new StringBuilder(path + fileName));
        String fileUrl = "https://raw.githubusercontent.com/aksodar/JSeminar_2/master/src/main/resources/example.txt";
        String userName = "Гриша";

        String textFromURL = getFileAndTextFromURL(fileUrl, fullPath);
        String newText = change(userName, textFromURL);
        saveOnLocal(fullPath, newText);
        writeTextToLogger(fullPath);
        removeFromLocale(fullPath);

    }

    public static String getFileAndTextFromURL(String url, String localFilename) {
        try {
            URL website = new URL(url);
            ReadableByteChannel rbc = Channels.newChannel(website.openStream());
            FileOutputStream fos = new FileOutputStream(localFilename);
            fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
            fos.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return readText(localFilename);
    }

    public static String change(String name, String fileContent) {
        String my_new_str = fileContent.replace("%s", name);

        return my_new_str;
    }

    public static void writeTextToLogger(String localFilename) {
        Logger logger = Logger.getLogger(Main.class.getName());
        String loggerName = "logger.txt";
        String path = "./Task002/";
        String fullPath = String.valueOf(new StringBuilder(path + loggerName));
        try {
            FileHandler fh = new FileHandler(fullPath);
            logger.addHandler(fh);
            SimpleFormatter sFormat = new SimpleFormatter();
            fh.setFormatter(sFormat);
            String textToLogger = readText(localFilename);
            logger.log(Level.INFO, textToLogger);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static String readText(String localFilename) {
        File file = new File(localFilename);
        String line = "";
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            line = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return line;
    }

    public static void saveOnLocal(String fileName, String fileContent) {
        try {
            File localFile = new File(fileName);
            FileWriter fileWriter = new FileWriter(localFile, false);
            fileWriter.write(fileContent);
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static boolean removeFromLocale(String fileName) {
        try {
            Files.delete(Path.of(fileName));
        } catch (NoSuchFileException x) {
            System.err.format("%s: no such" + " file or directory%n", fileName);
        } catch (DirectoryNotEmptyException x) {
            System.err.format("%s not empty%n", fileName);
        } catch (IOException x) {
            System.err.println(x);
        }
        return false;
    }
}

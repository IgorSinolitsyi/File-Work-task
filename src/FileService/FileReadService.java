package FileService;

import Utils.Constants;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileReadService {
    public static String readTextFromFileIO(String filename) {
        String textFromFile = "";
        try (FileInputStream fileInputStream = new FileInputStream(filename)) {
            byte[] bytes = fileInputStream.readAllBytes();
            textFromFile = new String(bytes, Constants.DEFAULT_ENCODING);
        } catch (IOException ex) {
            System.out.println(Constants.ERROR_FILE_READING_MSG);
            System.exit(0);
        }
        return textFromFile;
    }

    public static String readTextFromFileNIO(String filename) {
        String textFromFile = "";
        try {
            textFromFile = Files.readString(Path.of(filename));
        } catch (IOException e) {
            System.out.println(Constants.ERROR_FILE_READING_MSG);
            System.exit(0);
        }
        return textFromFile;


    }
}

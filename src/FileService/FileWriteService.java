package FileService;

import Utils.Constants;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileWriteService {
    public static void CreateFileIO(String fileName) {
        try {
            File file = new File(fileName);
            boolean fl = file.createNewFile();
            if (!fl) System.out.println("Файл уже сушествует!");
            else System.out.println("Файл создан успешно!");
        } catch (IOException e) {
            System.out.println(Constants.ERROR_FILE_CREATION_MSG);
            System.exit(0);
        }
    }

    public static void WriteTextToFileIO(String textToFile, String filename) {
        try (FileOutputStream fileOutputStream = new FileOutputStream(filename)) {
            fileOutputStream.write(textToFile.getBytes());
            System.out.println("Файл записан успешно!");
        } catch (Exception ex) {
            System.out.println(Constants.ERROR_FILE_WRITING_MSG);
            System.exit(0);
        }
    }

    public static void CreateFileNIO(String fileName) {
        try {
            Files.createFile(Path.of(fileName));
            System.out.println("Файл создан успешно!");
        } catch (FileAlreadyExistsException e) {
            System.out.println("Файл уже сушествует!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void WriteTextToFileNIO(String textToFile, String filename) {
        try {
            Files.writeString(Path.of(filename), textToFile);
            System.out.println("Файл записан успешно!");
        } catch (IOException e) {
            System.out.println(Constants.ERROR_FILE_WRITING_MSG);
            System.exit(0);
        }
    }
}

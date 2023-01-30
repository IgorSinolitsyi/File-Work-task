package Controller;

import FileService.FileExists;
import FileService.FileReadService;
import FileService.FileWriteService;

import Utils.Constants;
import FileService.PathToFile;
import View.GetDataScanner;
import View.ViewTextFromFile;

public class FilterActionNumber {

    public static void filterActionNumber(int option, int task, PathToFile path) {

        switch (option) {
            case 1 -> {
                path.setPath(System.getProperty("user.dir") + Constants.DEFAULT_PATH +
                        GetDataScanner.getDataScanner("Введите имя файла: ") + Constants.FILE_TYPE);
                if (task == 1)
                    FileWriteService.CreateFileIO(path.getPath());
                else FileWriteService.CreateFileNIO(path.getPath());
            }
            case 2 -> {
                if (task == 1)
                    FileWriteService.WriteTextToFileIO(GetDataScanner.getDataScanner("Введите текст: "), path.getPath());
                else
                    FileWriteService.WriteTextToFileNIO(GetDataScanner.getDataScanner("Введите текст: "), path.getPath());
            }
            case 3 -> {
                if (task == 1)
                    ViewTextFromFile.textView(FileReadService.readTextFromFileIO(path.getPath()));
                else ViewTextFromFile.textView(FileReadService.readTextFromFileNIO(path.getPath()));
            }
            case 4 -> {
                String filePath = System.getProperty("user.dir") + Constants.DEFAULT_PATH +
                        GetDataScanner.getDataScanner("Введите имя файла: ") + Constants.FILE_TYPE;
                if (FileExists.fileExist(filePath)) {
                    path.setPath(filePath);
                } else System.out.println("Файл не существует!");
            }
            case 0 -> {
                System.exit(0);
            }
            default -> throw new IllegalStateException("Ошибка ввода: " + option);
        }
    }
}

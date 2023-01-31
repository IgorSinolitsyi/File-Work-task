package Controller;

import FileService.FileExists;
import FileService.FileReadService;
import FileService.FileWriteService;
import Utils.Constants;
import FileService.PathToFile;
import View.GetDataScannerView;
import View.TextFromFileView;


public class FilterActionNumberController {

    public static void filterActionNumber(int option, int task, PathToFile path) {

        switch (option) {
            case 1 -> {
                path.setPath(Constants.DEFAULT_PATH +
                        GetDataScannerView.getDataScanner("Введите имя файла: ") + Constants.FILE_TYPE);
                if (task == 1)
                    FileWriteService.createFileIO(path.getPath());
                else FileWriteService.createFileNIO(path.getPath());
            }
            case 2 -> {
                if (task == 1)
                    FileWriteService.writeTextToFileIO(GetDataScannerView.getDataScanner("Введите текст: "), path.getPath());
                else
                    FileWriteService.writeTextToFileNIO(GetDataScannerView.getDataScanner("Введите текст: "), path.getPath());
            }
            case 3 -> {
                if (task == 1)
                    TextFromFileView.textView(FileReadService.readTextFromFileIO(path.getPath()));
                else TextFromFileView.textView(FileReadService.readTextFromFileNIO(path.getPath()));
            }
            case 4 -> {
                String filePath =Constants.DEFAULT_PATH +
                        GetDataScannerView.getDataScanner("Введите имя файла: ") + Constants.FILE_TYPE;
                if (FileExists.fileExist( path.getProjectDirPath()+filePath)) {
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

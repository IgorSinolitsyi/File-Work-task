import Controller.FilterActionNumber;
import Utils.Constants;
import FileService.PathToFile;
import View.GetActionNumber;
import View.GetTaskNumber;

public class Main {
    public static void main(String[] args) {
        int taskNum = GetTaskNumber.getTaskNumber();
        PathToFile pathToFile = new PathToFile(System.getProperty("user.dir") + Constants.DEFAULT_PATH + Constants.DEFAULT_FILE_NAME + Constants.FILE_TYPE);
        while (true) {
            System.out.println("\n" + "Текуший файл: " + pathToFile.getPath());
            FilterActionNumber.filterActionNumber(GetActionNumber.getActionNumber(), taskNum, pathToFile);
        }
    }
}
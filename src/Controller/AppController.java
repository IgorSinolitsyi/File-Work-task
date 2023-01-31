package Controller;

import FileService.PathToFile;
import Utils.Constants;
import View.GetActionNumberView;
import View.GetTaskNumberView;

public class AppController {
    public AppController() {
        int taskNum = GetTaskNumberView.getTaskNumber();
        PathToFile pathToFile = new PathToFile(Constants.DEFAULT_PATH + Constants.DEFAULT_FILE_NAME + Constants.FILE_TYPE);
        while (true) {
            System.out.println("\n" + "Текуший файл: " + pathToFile.getPath());
            FilterActionNumberController.filterActionNumber(GetActionNumberView.getActionNumber(), taskNum, pathToFile);
        }
    }
}

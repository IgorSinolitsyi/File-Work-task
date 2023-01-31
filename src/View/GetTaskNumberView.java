package View;

import Utils.ValidateChoice;

public class GetTaskNumberView {
    public static int getTaskNumber() {
        String taskChoice;
        String CHOOSE_TASK_VIEW = """
                Выбор задания:
                1 - использовать java.io
                2 - использовать java.nio
                """;
        System.out.println("\n"+CHOOSE_TASK_VIEW);
        do {taskChoice = GetDataScannerView.getDataScanner("Введите номер задания"+"\n");}
        while (!ValidateChoice.isTaskChoice(taskChoice));
        return Integer.parseInt(taskChoice);
    }
}


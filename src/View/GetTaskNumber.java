package View;

import Controller.ValidateChoice;

public class GetTaskNumber {
    public static int getTaskNumber() {
        String taskChoice;
        String CHOOSE_TASK_VIEW = """
                Выбор задания:
                1 - использовать java.io
                2 - использовать java.nio
                """;
        System.out.println("\n"+CHOOSE_TASK_VIEW);
        do {taskChoice = GetDataScanner.getDataScanner("Введите номер задания"+"\n");}
        while (!ValidateChoice.isTaskChoice(taskChoice));
        return Integer.parseInt(taskChoice);
    }
}


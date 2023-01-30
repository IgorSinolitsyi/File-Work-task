package View;

import Controller.ValidateChoice;

public class GetActionNumber {
    public static int getActionNumber() {
        String actionChoice;
        String CHOOSE_TASK_VIEW = """
                Выбор действия:
                1 - создать
                2 - записать
                3 - читать
                4 - выбрать
                0 - выход
                """;
        System.out.println("\n" + CHOOSE_TASK_VIEW);
        do {
            actionChoice = GetDataScanner.getDataScanner("Введите номер задания" + "\n");
        }
        while (!ValidateChoice.isActionChoice(actionChoice));
        return Integer.parseInt(actionChoice);
    }
}

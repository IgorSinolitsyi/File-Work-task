package View;

import java.util.Scanner;

public class GetDataScanner {
    public static String getDataScanner(String msg) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(msg);
        return scanner.nextLine();
    }
}
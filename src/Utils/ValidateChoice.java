package Utils;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ValidateChoice {
    public static boolean isTaskChoice(String choice) {
        Set<String> values = new HashSet<>(Arrays.asList("1", "2"));
        return values.contains(choice.trim());
    }

    public static boolean isActionChoice(String choice) {
        Set<String> values = new HashSet<>(Arrays.asList("1", "2", "3", "4", "0"));
        return values.contains(choice.trim());
    }
}

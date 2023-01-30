package FileService;

import java.nio.file.Files;
import java.nio.file.Path;

public class FileExists {
    public static boolean fileExist(String path) {
        return Files.exists(Path.of(path));
    }
}

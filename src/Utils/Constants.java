package Utils;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class Constants {
    public static String DEFAULT_FILE_NAME = "defaultFile";
    public static String FILE_TYPE = ".txt";
    public static String DEFAULT_PATH = "\\files\\";
    public static Charset DEFAULT_ENCODING = StandardCharsets.UTF_8;
    public static String ERROR_FILE_CREATION_MSG = "Can't create file, check path";
    public static String ERROR_FILE_READING_MSG = "Can't read file, check path";
    public static String ERROR_FILE_WRITING_MSG = "Can't write file, check path";
}

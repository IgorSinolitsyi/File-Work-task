package FileService;

import java.io.File;

public class PathToFile {
    private String path;
    private final String projectDirPath;
    public PathToFile(String path) {
        projectDirPath = new File("").getAbsolutePath();
        this.path = projectDirPath + path;
    }

    public String getProjectDirPath() {
        return projectDirPath;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = projectDirPath + path;
    }

}

package FileList;

import java.io.File;

/**
 * Created by Gleb on 05.08.17.
 */
public class FileRecursive {

    public void recFilsDer(String path) {
        File root = new File(path);
        File[] list = root.listFiles();

        if (list == null) return;

        for (File f : list) {
            if (f.isDirectory()) {
                recFilsDer(f.getAbsolutePath());
                System.out.println(f.getName());
            } else {
                System.out.println(f.getName());
            }
        }
    }
    
    public void recFile (String path) {
        File root = new File(path);
        File[] list = root.listFiles();

        if (list == null) return;

        for (File f : list) {
            if (f.isDirectory()) {
                if (f.isFile()) {
                    System.out.println(f.getName());
                }
            }
        }
    }
    public static void main(String[] args) {
        String path = "/Users/imac/IdeaProjects/Test/src/main/java/io/A";
        FileRecursive fileRecursive = new FileRecursive();
        //fileRecursive.recFilsDer(path);
        //System.out.println();
        fileRecursive.recFile(path);
    }
}

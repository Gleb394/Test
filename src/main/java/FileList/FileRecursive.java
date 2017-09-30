package FileList;

import java.io.File;

/**
 * Created by Gleb on 05.08.17.
 */
public class FileRecursive {

    public void recFilesDer(String path) {
        File root = new File(path);
        File[] list = root.listFiles();

        if (list == null) return;

        for (File f : list) {
            if (f.isDirectory()) {
                recFilesDer(f.getAbsolutePath());
                System.out.println(f.getName());
            } else {
                System.out.println(f.getName());
            }
        }
    }
    public void recFiles(String path) {
                File root = new File(path);
                File[] list = root.listFiles();

                if (list == null) return;

                for (File f : list) {
                    if (f.isDirectory()) {
                        recFiles(f.getAbsolutePath());
                    } else {
                System.out.println(f.getName());
            }
        }
    }
    public void recDer(String path) {
        File root = new File(path);
        File[] list = root.listFiles();

        if (list == null) return;

        for (File f : list) {
            if (f.isDirectory()) {
                recDer(f.getAbsolutePath());
                System.out.println(f.getName());
            }
        }
    }
    public static void main(String[] args) {
        String path = "/Users/imac/IdeaProjects/PolyTest/src/main/java/io/A";
        FileRecursive fileRecursive = new FileRecursive();
        fileRecursive.recDer(path);
        fileRecursive.recFiles(path);
        fileRecursive.recFilesDer(path);
        System.out.println();
    }
}

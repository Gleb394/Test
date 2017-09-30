package FileList;

import java.io.File;
import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by Gleb on 19.08.17.
 */

public class FileQueue {

    public final File file;

    public FileQueue(File file) {
        this.file = file;
    }

    @Override
    public String toString() {
        return file.getName();
    }

    public void queFileDer(String path) {
        File dir = new File(path);
        if (!dir.exists() || !dir.isDirectory()) {
        }
        Deque<FileQueue> stack = new ArrayDeque<>();
        stack.add(new FileQueue(dir));
        while (!stack.isEmpty()) {
            FileQueue fileQueue = stack.pollLast();
            System.out.println(fileQueue);
            if (fileQueue.file.isDirectory()) {
                File[] files = fileQueue.file.listFiles();
                for (int i = files.length - 1; i >= 0; i--) {
                    stack.add(new FileQueue(files[i]));
                }
            }
        }
    }
    public void queDer(String path) {
        File dir = new File(path);
        if (!dir.exists() || !dir.isDirectory()) {
        }
        Deque<FileQueue> stack = new ArrayDeque<>();
        stack.add(new FileQueue(dir));
        while (!stack.isEmpty()) {
            FileQueue fileQueue = stack.pollLast();
            /*System.out.println(fileQueue);*/
            if (fileQueue.file.isDirectory()) {
                System.out.println(fileQueue);
                File[] files = fileQueue.file.listFiles();
                for (int i = files.length - 1; i >= 0; i--) {
                    stack.add(new FileQueue(files[i]));
                }
            } else {
            }
        }
    }
    public void queFile(String path) {
        File dir = new File(path);
        if (!dir.exists() || !dir.isDirectory()) {
        }
        Deque<FileQueue> stack = new ArrayDeque<>();
        stack.add(new FileQueue(dir));
        while (!stack.isEmpty()) {
            FileQueue fileQueue = stack.pollLast();
            /*System.out.println(fileQueue);*/
            if (fileQueue.file.isDirectory()) {
                File[] files = fileQueue.file.listFiles();
                for (int i = files.length - 1; i >= 0; i--) {
                    stack.add(new FileQueue(files[i]));
                }
            } else {
                System.out.println(fileQueue);
            }
        }
    }

    public static void main(String[] args) {
        FileQueue fileQueue = new FileQueue(null);
        String path = "/Users/imac/IdeaProjects/PolyTest/src/main/java/io/A";
        fileQueue.queDer(path);
    }
}

package io;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileTest {
    public static void main(String[] args) throws IOException {

        File file = new File("src\\main\\java\\io\\test.txt");
        File dir = new File("src\\main\\java\\io");

        System.out.println(dir.isDirectory());
        System.out.println(file.isFile());

        File[] files = dir.listFiles();
        String[] list = dir.list();

        System.out.println(Arrays.toString(list));

//        new File("src\\main\\java\\io\\test2.txt").createNewFile();

        System.out.println(file.getName());

        System.out.println(file.length());

        File a = new File("src\\main\\java\\io\\A");
    }
}

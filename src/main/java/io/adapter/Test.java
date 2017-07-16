package io.adapter;

import java.io.IOException;
import java.io.InputStream;

public class Test {
    public static void main(String[] args) throws IOException {
        byte[] bytes = {23, 56, 23, 45};

        InputStream inputStream = new CustomByteArrayInputStream(bytes);

        System.out.println(inputStream.read());
        System.out.println(inputStream.read());
        System.out.println(inputStream.read());
        System.out.println(inputStream.read());
    }
}

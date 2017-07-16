package io.decorator;

public class Test {
    public static void main(String[] args) {
        String str = "Hello world!\nHello Earth!";

//        System.out.println(str);

        BufferedReader bufferedReader = new BufferedReader(new StringReader(str));

        System.out.println(bufferedReader.readLine());
    }
}

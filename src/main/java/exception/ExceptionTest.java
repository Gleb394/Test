package exception;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTest {

    @Test
    public void overload() {
        byte b = (byte) 1000000222;
        System.out.println(b);
    }

    @Test
    public void stackOverflow() {
        f();
    }

    static void f() {
        f();
    }

    @Test
    public void outOfMemory() {
        int[] ints = new int[Integer.MAX_VALUE];
    }

    @Test
    public void arithmetic() {
        System.out.println(10 / 0);
    }

    @Test
    public void unchecked() {
        try {
            System.out.println(10 / 0);
        } catch (Exception e) {
            System.out.println("ArithmeticException!");
        } catch (Throwable e) {
            System.out.println("Exception!");
        }
    }

    @Test
    public void processChecked() {
        try {
            throwChecked();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        throwUnchecked();
    }

    public static void throwChecked() throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("");
    }

    public static void throwUnchecked() throws ArithmeticException {
        System.out.println(10 / 0);
    }

    @Test
    public void throwTest() {
        doSomething(2, 0);
    }

    static void doSomething(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("b cant be zero value!");
        }
        int res = a / b;
    }

    @Test
    public void customThrowTest() {
        try {
            throw new UserNotFoundException("User not found");
        } catch (UserNotFoundException e) {
            e.printStackTrace();
        }
    }

    static class UserNotFoundException extends Exception {
        public UserNotFoundException(String message) {
            super(message);
        }
    }
}

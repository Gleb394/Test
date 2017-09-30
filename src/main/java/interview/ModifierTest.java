package interview;

public class ModifierTest {
    protected String s;

    public class A {
        private String a;
    }

    public class B extends A {

        public void f() {
            System.out.println();
        }
    }
}

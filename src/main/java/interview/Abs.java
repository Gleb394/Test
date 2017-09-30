package interview;

public abstract class Abs {

    private String s;

    public Abs(String s) {
        this.s = s;
    }

    public abstract void f();

    public void g(){}

    static class AbsChild extends Abs {

        public AbsChild(String s) {
            super(s);
        }

        @Override
        public void f() {

        }
    }

    public static void main(String[] args) {
        Abs abs = new AbsChild("S");
    }
}

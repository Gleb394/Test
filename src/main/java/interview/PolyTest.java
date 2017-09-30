package interview;

public class PolyTest {
    public static void main(String[] args) {
        Animal[] animals = {
                new Cat(),
                new Dog(),
                new Bird(),
                new Animal()
        };

        for (Animal animal : animals) {
            animal.voice();
        }
    }

    static class Animal {

        public void voice() {
            System.out.println("Animal voice!");
        }
    }

    static class Cat extends Animal {


    }

    static class Dog extends Animal {

        @Override
        public void voice() {
            System.out.println("Dog voice!");
        }
    }

    static class Bird extends Animal {

        @Override
        public void voice() {
            System.out.println("Bird voice!");
        }
    }
}

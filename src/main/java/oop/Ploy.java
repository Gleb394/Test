package oop;

public class Ploy {
    public static void main(String[] args) {
        Cat murka = new Cat("Murka");
        Dog dog = new Dog("Rex");
        Duck duck = new Duck("Ducky");
        Deer deer = new Deer("Melvin");

        Animal[] animals = {dog, murka, duck, deer};

        printAnimalsNames(animals);
    }

    static void printAnimalsNames(Animal[] animals) {
        for (Animal animal : animals) {
            /*if (animal instanceof Cat) {
                Cat cat = (Cat) animal;
                cat.sayHello();
            }*/
            animal.sayHello();
        }
    }

    static class Animal {

        String name;

        public Animal(String name) {
            this.name = name;
        }

        void sayHello() {
            System.out.println("Hello. I'm " + name);
        }
    }

    static class Cat extends Animal {

        public Cat(String name) {
            super(name);
        }

        @Override
        void sayHello() {
            System.out.println("Hello, im super cat " + name);
        }
    }

    static class Dog extends Animal {
        public Dog(String name) {
            super(name);
        }
    }

    static class Duck extends Animal {
        public Duck(String name) {
            super(name);
        }
    }

    static class Deer extends Animal {
        public Deer(String name) {
            super(name);
        }
    }
}

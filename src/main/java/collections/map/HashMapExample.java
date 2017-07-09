package collections.map;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Human, String> hashMap = new HashMap<>();

        Human gleb = new Human("Gleb", 25, false);

        hashMap.put(gleb, "One");

        String s = hashMap.get(gleb);

        System.out.println(gleb.hashCode());

    }

    static class Human {
        String name;
        int age;
        boolean isMarried;

        public Human(String name, int age, boolean isMarried) {
            this.name = name;
            this.age = age;
            this.isMarried = isMarried;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Human human = (Human) o;

            if (age != human.age) return false;
            if (isMarried != human.isMarried) return false;
            if (name != null) return name.equals(human.name);
            else return human.name == null;
        }

        @Override
        public int hashCode() {
            int result = name != null ? name.hashCode() : 0;
            result = 31 * result + age;
            result = 31 * result + (isMarried ? 1 : 0);
            return result;
        }
    }

    static class Point {
        double x;
        double y;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Point point = (Point) o;

            if (Double.compare(point.x, x) != 0) return false;
            return Double.compare(point.y, y) == 0;
        }

        @Override
        public int hashCode() {
//            return (int)(x *  y);
            return (int)(31 * x +  y);
        }

//        new Point(1.4, 5.3)
//        new Point(5.3, 1.4)
    }
}

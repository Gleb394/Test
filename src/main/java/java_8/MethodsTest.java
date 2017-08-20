package java_8;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.junit.Before;
import org.junit.Test;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

public class MethodsTest {

    private List<Employee> employees;

    @Before
    public void setUp() {
       employees = asList(
//               new Employee("Anna", 24, 10000, true),
               new Employee("Anna", 24, 10000, true, asList(3, 5, 12, 777, 6)),
               new Employee("Tom", 18, 8000, true, asList(21, 43, 234, 12, 64)),
               new Employee("Gerald", 35, 30000, false, asList(777, 42, 343, 344, 34)),
               new Employee("Hanna", 43, 35000, false, asList(43, 433, 342, 4344, 777)),
               new Employee("Bruce", 26, 15000, true, asList(35, 51, 1432, 324, 61))
       );
    }

    @Test
    public void getStream() {
        // Java 8
        employees.stream().filter(e -> e.isMarried).forEach(System.out::println);

        // Java 7
        for (Employee employee : employees) {
            if (employee.isMarried) {
                System.out.println(employee);
            }
        }
    }

    @Test
    public void filterAnClass() {
//        PredicateImpl predicate = new PredicateImpl();

        employees.stream().filter(new Predicate<Employee>() {
            @Override
            public boolean test(Employee employee) {
                return employee.isMarried;
            }
        }).forEach(System.out::println);
    }

    @Test
    public void filterLyambda() {
        employees.stream()
                .filter(employee -> employee.isMarried)
                .forEach(System.out::println); // method reference
    }

    @Test
    public void map1() {
        employees.stream()
                .filter(employee -> employee.isMarried)
                .map(employee -> employee.salary)
                .forEach(System.out::println);
    }

    @Test
    public void map2() {
        employees.stream()
                .filter(employee -> employee.isMarried)
                .map(employee -> {
                    employee.salary = employee.salary + 500;
                    return employee;
                })
                .forEach(System.out::println);
    }

    @Test
    public void skip() {
        employees.stream()
                .skip(2)
                .forEach(System.out::println);
    }

    @Test
    public void sort() {
        employees.stream()
                .sorted((o1, o2) -> o1.salary - o2.salary)
                .skip(employees.size() - 1)
                .forEach(System.out::println);
    }

    @Test
    public void limit() {
        employees.stream()
                .sorted((o1, o2) -> o2.salary - o1.salary)
                .limit(3)
                .forEach(System.out::println);
    }

    @Test
    public void distinct() {
        employees.stream()
                .distinct()
                .forEach(System.out::println);
    }

    @Test
    public void peek() {
        employees.stream()
                .peek(employee -> System.out.println(employee.age))
                .forEach(System.out::println);
    }

    @Test
    public void mapToInt() {
        employees.stream()
                .mapToInt(value -> value.salary)
                .forEach(System.out::println);
    }

    @Test
    public void flatMap() {
        System.out.println(employees.stream()
                .flatMap(employee -> employee.luckyNums.stream())
                .max(Comparator.naturalOrder())
                .get()
        );
    }

    @Test
    public void findFirst() {
        Employee employee = employees.stream()
                .filter(e -> e.salary > 1000)
                .findAny()
                .orElse(new Employee("Default", 10, 10000, true, null));

        System.out.println(employee);
    }

    @Test
    public void collect() {
        Map<String, Employee> result = employees
                .stream()
                .filter(e -> e.salary > 10000)
                .collect(Collectors.toMap(e -> e.name, e -> e));

        System.out.println(result);
    }

    @Test
    public void count() {
        System.out.println(employees
                .stream()
                .flatMap(employee -> employee.luckyNums.stream())
                .filter(num -> num == 777)
                .count()
        );
    }

    @Test
    public void anyMatch() {
        System.out.println(employees
                .stream()
//                .anyMatch(employee -> employee.salary > 10000)
//                .noneMatch(employee -> employee.salary > 100_000)
                .allMatch(employee -> employee.salary > 10000)
        );
    }

    @Test
    public void maxAndMin() {
        System.out.println(employees
                        .stream()
                        .flatMap(employee -> employee.luckyNums.stream())
//                .max(Comparator.naturalOrder())
                        .min(Comparator.naturalOrder())
                        .get()
        );
    }

    @Test
    public void forEach() {
        employees.forEach(System.out::println);
    }

    @Test
    public void toArray() {
        Employee[] employees = this.employees
                .stream()
                .filter(e -> e.isMarried)
                .toArray(Employee[]::new);
    }

    @Data
    @AllArgsConstructor
    static class Employee implements Comparable<Employee> {

        private String name;
        private int age;
        private int salary;
        private boolean isMarried;
        private List<Integer> luckyNums;

        @Override
        public int compareTo(Employee o) {
            return this.salary - o.salary;
        }
    }
}

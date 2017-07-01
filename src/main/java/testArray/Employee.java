package testArray;

import java.util.*;

/**
 * Created by Gleb on 27.06.17.
 */
public class Employee implements Comparable<Employee>, Comparator<Employee> {

    private String name;
    private int age;
    private int salary;

    public Employee(String name, int age, int salary) {

        this.name = name;
        this.age = age;
        this.salary = salary;

    }

    @Override
    public String toString() {

        return "name" + ": " + name + " " + "age" + ": " + age + " " + "salary" + ": " + salary;
    }

    @Override
    public int compareTo(Employee employee) {
        return this.name.compareTo(employee.name);
    }

    @Override
    public int compare(Employee o1, Employee o2) {
        return 0;
    }

    public static class comparatorTo implements Comparator<Employee> {
        @Override
        public int compare(Employee employee1, Employee employee2) {
            Integer age1 = new Integer(employee1.age);
            Integer age2 = new Integer(employee2.age);
            return age1.compareTo(age2);
        }

        void anonim (){

        }

    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<Employee>();

        Employee employee1 = new Employee("Gleb", 19, 5000);
        Employee employee2 = new Employee("Vasy", 25, 10000);
        Employee employee3 = new Employee("Grisha", 20, 6000);
        Employee employee4 = new Employee("Max", 30, 10000);
        Employee employee5 = new Employee("Sergey", 28, 9000);
        Employee employee6 = new Employee("Djon", 21, 5000);
        Employee employee7 = new Employee("Valentin", 22, 7000);
        Employee employee8 = new Employee("Igor", 24, 8000);
        Employee employee9 = new Employee("Anton", 20, 8000);
        Employee employee10 = new Employee("Andrey", 18, 9000);

        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);
        employees.add(employee6);
        employees.add(employee7);
        employees.add(employee8);
        employees.add(employee9);
        employees.add(employee10);

        Collections.sort(employees);

        System.out.println(employees.toString());

        Collections.sort(employees, new comparatorTo());

        System.out.println(employees.toString());

    }
}

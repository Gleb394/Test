package java_8;

import java_8.MethodsTest.Employee;

import java.util.function.Predicate;

public class PredicateImpl implements Predicate<Employee> {

    @Override
    public boolean test(Employee employee) {
        return false;
    }
}

package reflection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.junit.Before;
import org.junit.Test;

import java.io.Serializable;
import java.lang.reflect.*;
import java.util.RandomAccess;

public class ReflectionTest {

    private Employee employee;
    private Class<? extends Employee> aClass;

    @Before
    public void setUp() {
        employee = new Employee("Ivan", 20);
        aClass = employee.getClass();
    }

    @Test
    public void simpleNames() {
        System.out.println(aClass.getName());
        System.out.println(aClass.getSimpleName());
    }

    @Test
    public void getSuperClass() {
        Class<?> superclass = aClass.getSuperclass();
        System.out.println(superclass.getSimpleName());
    }

    @Test
    public void getInterfaces() {
        Class<?>[] interfaces = aClass.getInterfaces();
        for (Class<?> anInterface : interfaces) {
            System.out.println(anInterface.getSimpleName());
        }
    }

    @Test
    public void getFields() {
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField.getName());
        }
    }

    @Test
    public void fuckEncapsulation() throws NoSuchFieldException, IllegalAccessException {
        System.out.println(employee.name);
        Field name = aClass.getDeclaredField("name");
        name.setAccessible(true);
        name.set(employee, "Tom");

        Object value = name.get(employee);
        System.out.println(value);

        Field age = aClass.getDeclaredField("age");
        age.setAccessible(true);
        int ageValue = age.getInt(employee);
        System.out.println(ageValue);
    }

    @Test
    public void getType() throws NoSuchFieldException {
        Field name = aClass.getDeclaredField("name");
        Class<?> type = name.getType();
        System.out.println(type.getSimpleName());
    }

    @Test
    public void getModifiers() throws NoSuchFieldException {
        Field name = aClass.getDeclaredField("name");
        int modifiers = name.getModifiers();
        if (Modifier.isStatic(modifiers)) {
            System.out.println("static");
        }
        if (Modifier.isPublic(modifiers)) {
            System.out.println("public");
        }
        if (Modifier.isPrivate(modifiers)) {
            System.out.println("private");
        }
    }

    @Test
    public void getConstructors() throws NoSuchFieldException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Constructor<?>[] declaredConstructors = aClass.getDeclaredConstructors();

        for (Constructor<?> constructor : declaredConstructors) {
            System.out.println(constructor.getName());
            System.out.println(constructor.getParameterCount());
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            for (Class<?> parameterType : parameterTypes) {
                System.out.println(parameterType.getSimpleName());
            }

            Parameter[] parameters = constructor.getParameters();
            for (Parameter parameter : parameters) {
                System.out.println(parameter.getName());
            }
        }

        Object anna = declaredConstructors[0].newInstance("Anna", 26);
        System.out.println(anna);
    }

    @Test
    public void getMethods() throws NoSuchFieldException {
        Method[] declaredMethods = aClass.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod.getName());
        }
    }

    @Test
    public void invokeMethod() throws NoSuchFieldException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method sayHello = aClass.getDeclaredMethod("sayHello");
        sayHello.setAccessible(true);
        sayHello.invoke(employee, null);

        Method lucky = aClass.getDeclaredMethod("lucky", int.class);
        lucky.setAccessible(true);
        lucky.invoke(employee, 10);
    }

    @Test
    public void createInstance() throws NoSuchFieldException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        Employee employee = aClass.newInstance();

        System.out.println(employee);
    }

    @Test
    public void getClassInstance() {
        Class<Employee> employeeClass = Employee.class;
    }


    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    static class Employee implements Serializable, Cloneable, RandomAccess {

        private String name;
        private int age;

        private void lucky(int num) {
            System.out.println(num);
        }
    }
}

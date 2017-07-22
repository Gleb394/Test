package reflection;

public class AnnotationProccessing {
    public static void main(String[] args) {
        Employee gleb = new Employee("Gleb", 28);

        repeat(gleb);
    }

    public static void repeat(Employee emp) {

        Class<? extends Employee> aClass = emp.getClass();

        if (aClass.isAnnotationPresent(MyAnnotation.class)) {
            MyAnnotation annotation = aClass.getAnnotation(MyAnnotation.class);

            for (int i = 0; i < annotation.value(); i++) {
                System.out.println(annotation.name());
            }
        }
    }
}

package reflection;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@MyAnnotation(name = "Hello world", value = 5)
public class Employee {

    private String name;
    private int age;


}

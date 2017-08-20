package serialize;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonEntity // if not presented throw some error when you try to convert som object og this class
public class Employee {

    @JsonField(name = "name")
    private String firstName;

    @JsonField
    private String lastName;

    @JsonField
    private int age;

    private int salary;

}

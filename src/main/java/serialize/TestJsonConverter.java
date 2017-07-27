package serialize;

public class TestJsonConverter {

    public static void main(String[] args) {
        Employee employee = new Employee("Nikita", "Chihaleychik", 22, 12500);
        convert(employee);
    }


    public static String convert(Object obj) {
        return "";
        /*
         {"name":"Nikita","lastName":"Chihaleychik","age":22}
        */
    }

    public static String convert(Object[] objs) {
        return "";
        /*
         [{"name":"Nikita","lastName":"Chihaleychik","age":22},{"name":"Nikita","lastName":"Chihaleychik","age":22}]
        */
    }

    public static String convert(Object obj, boolean isPretty) {
        /*
         {
            "name": "Nikita",
            "lastName": "Chihaleychik",
            "age": 22
         }
        */
        return "";
    }

//    * tasks *
//    - add pretty format
//    - add a ability to save result into file
//    - add a ability to convert array of objects

//    !!! Important !!! Try to avoid code duplicate
}

package dao;

public class Test {
    public static void main(String[] args) {
        EmployeeDaoImpl employeeDao = new EmployeeDaoImpl();

        Employee employee = employeeDao.get(2);

//        employeeDao.save(new Employee(5, "Gleb", "Gleb", 10, 10000));

        System.out.println(employee);
    }
}

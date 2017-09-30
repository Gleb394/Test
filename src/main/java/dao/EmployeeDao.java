package dao;

public interface EmployeeDao extends GenericDao<Employee, Integer> {

    Employee getByName(String name);
}

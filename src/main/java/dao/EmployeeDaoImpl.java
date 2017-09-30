package dao;

import java.sql.*;
import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao {

    private Connection connection = ConnectionFactory.getConnection();

    @Override
    public Employee getByName(String name) {
        return null;
    }

    @Override
    public List<Employee> getAll() {
        return null;
    }

    @Override
    public Employee get(Integer id) {
        Employee employee = null;
        try {
            String sql = "SELECT * FROM employee WHERE employee.id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                employee = new Employee(
                  resultSet.getInt("id"),
                  resultSet.getString("first_name"),
                  resultSet.getString("last_name"),
                  resultSet.getInt("age"),
                  resultSet.getInt("salary"),
                  null
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employee;
    }

    @Override
    public Employee save(Employee entity) {
        return null;
    }

    @Override
    public Employee update(Employee entity) {
        return null;
    }

    @Override
    public void delete(Integer integer) {

    }
}

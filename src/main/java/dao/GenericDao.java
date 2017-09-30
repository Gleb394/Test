package dao;

import java.util.List;

// CRUD (create, read, update, delete)
public interface GenericDao<T, ID> {

    List<T> getAll();

    T get(ID id);

    T save(T entity);

    T update(T entity);

    void delete(ID id);
}

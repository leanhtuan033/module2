package QuanLy_Coffee.Service;

import java.util.List;

public interface IService<T> {
    List<T> findAll();

    void add(T t);

    void delete(int id);

    void edit(int id);

    T findById(int id);

}

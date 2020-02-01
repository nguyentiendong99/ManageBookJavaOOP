package DAOctrl;

import java.util.List;

public interface DAO<T> {
    void add (T t);
    boolean edit (T t);
    boolean remove (String id);
    T findById(String id);
    List<T> findByName(String name);
    List<T> findByType(String type);
}

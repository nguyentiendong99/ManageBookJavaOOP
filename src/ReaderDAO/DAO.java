package ReaderDAO;

public interface DAO<T> {
    void add(T t);
    boolean edit(T t);
    boolean remove(String id);
}

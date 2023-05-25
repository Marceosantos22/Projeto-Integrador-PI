package Data;

/**
 * @author Marcelo Oliveira
 */
public interface GenericoDAO<T> {

	int insert(T obj);

	int update(T obj);

	boolean delete(int id);

	T select(int id);
}

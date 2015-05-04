package echuang.com.dao;

import java.util.List;

public interface AbstractBaseDAO {
	public <T> T save(final T entity);
	public void delete(final Object entity);
	public <T> T get(final Class<T> type, final Long  id);
	public <T> T merge(final T o);
	public <T> void saveOrUpdate(final T o);
	public <T> List<T> getAll(final Class<T> type);
}

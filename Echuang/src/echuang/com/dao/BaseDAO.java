package echuang.com.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;


@Repository("baseDao")
@SuppressWarnings("unchecked")
public abstract class BaseDAO implements AbstractBaseDAO {
	
    protected SessionFactory sessionFactory;
	
	public BaseDAO(SessionFactory sessionFactory){
		this.sessionFactory = sessionFactory;
	}
	
	 
	public <T> T save(final T entity){
		 sessionFactory.getCurrentSession().save(entity);
		 return entity;
	}
	
	public void delete(final Object entity){
		sessionFactory.getCurrentSession().delete(entity);
	}
	
	public <T> T get(final Class<T> type, final Long  id){
		return (T) sessionFactory.getCurrentSession().get(type, id);
	}
	
	 public <T> T merge(final T o) {
		 return (T) sessionFactory.getCurrentSession().merge(o);
	 }
	 
	 public <T> void saveOrUpdate(final T o){
		 sessionFactory.getCurrentSession().saveOrUpdate(o);
	 }
	 
	 public <T> List<T> getAll(final Class<T> type){
		 final Session session = sessionFactory.getCurrentSession();
	     final Criteria crit = session.createCriteria(type);
	     return crit.list();
	 }
}

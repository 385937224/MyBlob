package cn.pbq.dao.impl;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;

import cn.pbq.dao.IBaseDao;


public class BaseDao<T> implements IBaseDao<T> {
	
	SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}


	private Class<T> clazz;
	private String	clazzName;
	
	/***反射泛型**/
	public BaseDao() {
		//得到父类类型  BaseDao<T>
		ParameterizedType pType = (ParameterizedType) this.getClass().getGenericSuperclass();
		//获取 BaseDao<T> 真实类型参数，返回数组。---T：即Article/admin/Tag/LeaveWord
		Type[] types = pType.getActualTypeArguments();
//		System.out.println(types[0]);
		//从数组中取出就是类。
		clazz = (Class<T>) types[0];
		clazzName = clazz.getName();
	}
	
	
	@Override
	public void save(T temp) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.save(temp);	
	}

	@Override
	public T findById(int id) {
		Session currentSession = sessionFactory.getCurrentSession();
		T temp =(T) currentSession.get(clazz, id);
		return temp;
	}

	@Override
	public void delete(int id) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query query = currentSession.createQuery("delete from " + clazzName + " where id=?");
		query.setParameter(0, id);
		query.executeUpdate();
		
//		Query query = currentSession.createQuery("delete from " + clazzName + " where id= "+id);
//		query.executeUpdate();
	}

	@Override
	public void update(T temp) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.update(temp);
		
	}

	@Override
	public List<T> getAll() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query query = currentSession.createQuery("from " +clazzName);
		List<T> list = query.list();
		return list;
	}

	
}

package cn.pbq.dao;

import java.util.List;

import cn.pbq.po.Article;

public interface IBaseDao<T> {
	
	void save(T temp);
	
	T findById(int id);
	
	void delete(int id);
	
	void update(T temp);
	
	List<T> getAll();
}

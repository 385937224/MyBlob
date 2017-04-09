package cn.pbq.dao;


import java.util.List;

import cn.pbq.po.Article;

public interface IArticleDao {
	
	void save(Article temp);
	
	Article findById(int id);
	
	void delete(int id);
	
	void update(Article temp);
	
	List<Article> getAll();
	
	
	/**
	 * 根据文章标签找文章。
	 * @return
	 */
	public List<Article> fingByTag(String TagName);
	
}

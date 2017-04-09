package cn.pbq.service;

import java.util.List;

import cn.pbq.po.Article;

public interface IArticleService {
	
	void save(Article article);
	
	Article findById(int id);
	
	void delete(int id);
	
	void update(Article article);
	
	List<Article> getAll();
	
}

package cn.pbq.service.impl;

import java.util.List;
import cn.pbq.dao.IArticleDao;
import cn.pbq.po.Article;
import cn.pbq.service.IArticleService;


public class ArticleService implements IArticleService {

//	ArticleDao articleDao;
	/*****提到过的一定要用接口的。但是这里又忘记了,而且还忘了用private 修饰**/
	private IArticleDao  articleDao;
	public void setArticleDao(IArticleDao articleDao) {
		this.articleDao = articleDao;
	}


	@Override
	public void save(Article article) {
		articleDao.save(article);

	}

	@Override
	public Article findById(int id) {
		return articleDao.findById(id);
	}

	@Override
	public void delete(int id) {
		 articleDao.delete(id);

	}

	@Override
	public void update(Article article) {
		articleDao.update(article);

	}

	@Override
	public List<Article> getAll() {
		// TODO Auto-generated method stub
		return articleDao.getAll();
	}

}

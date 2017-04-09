package cn.pbq.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;

import cn.pbq.dao.IArticleDao;
import cn.pbq.po.Article;

public class OldArticleDao_0327 {

	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void save(Article article) {
		Session session = sessionFactory.getCurrentSession();
		session.save(article);
	}

	public Article findById(int id) {
		Session session = sessionFactory.getCurrentSession();
		Article article = (Article) session.get(Article.class, id);
		return article;
	}

	public void delete(int id) {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("delete from Article  where id=?");
		query.setParameter(0, id);
		query.executeUpdate();
	}


	public void update(Article article) {
		Session session = sessionFactory.getCurrentSession();
		session.update(article);

	}


	public List<Article> getAll() {
		Session session = sessionFactory.getCurrentSession();
		return session.createQuery("from Article").list();
		
	}



}

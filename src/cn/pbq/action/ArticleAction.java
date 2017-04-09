package cn.pbq.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cn.pbq.po.Article;
import cn.pbq.service.IArticleService;
import cn.pbq.service.impl.ArticleService;
import jdk.nashorn.internal.ir.RuntimeNode.Request;

/**
 * 文章模块
 * @author panbingqi
 * 1.文章列表
 */

public class ArticleAction extends ActionSupport implements ModelDriven<Article>,RequestAware{

	/********************* 自动封装struts提交的数据。***************/
	
	private Article article = new Article();
	public Article getArticle() {
		return article;
	}
	public void setArticle(Article article) {
		this.article = article;
	}

	@Override
	public Article getModel() {
		
		return article;
	}
	
	/** 
	 * Action中两种方式得到域对象。
	 * 方式1：struts框架专门有个ActionContext，通过它获取其他域对象。
     * 方式2：实现RequestAware接口，复写方法，那个方法就是注入requestMap对象，struts框架自己完成注入。（与Spring无关）
     */
//	Map<String, Object> requestMap =ActionContext.getContext().getContextMap();
	private Map<String,Object> request;
	@Override
	public void setRequest(Map<String, Object> request) {
		this.request=request;	
	}
	
	/**
	 * IOC容器注入创建对象 
	 */
	private IArticleService articleService;
	public void setArticleService(IArticleService articleService) {
		this.articleService = articleService;
	}

	
	/***************** 文章模块的功能。*************************/
	
	public String list(){
		List<Article> allArticles = articleService.getAll();
		request.put("allArticles", allArticles);
		return "allList";
	}
	
	public String viewAdd(){
		return "viewAdd";
	}
	public String save(){
		articleService.save(article);
		return "allListAction";
	}
	
	public String delete(){		
		articleService.delete(article.getId());
		return "allListAction";
	}

	public String viewUpdate() {
		
		article = articleService.findById(article.getId());
		request.put("article", article);
		return "viewUpdate";
	}
	public String update() {
		articleService.update(article);
		return "allListAction";
	}
	
}

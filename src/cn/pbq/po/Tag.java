package cn.pbq.po;

import java.util.Set;
/**
 * 
 * @author panbingqi
 *
 */
public class Tag {
	private int id;
	private String tagName;
//	其实不需要变量articles的，通过Article方来维护Tag表就好。
//	这里又用tag来维护Aricle是为了功能 根据标签来找出对应文章。
//	private Set<Article> articles;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTagName() {
		return tagName;
	}
	public void setTagName(String tagName) {
		this.tagName = tagName;
	}


}

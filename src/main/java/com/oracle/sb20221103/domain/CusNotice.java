package com.oracle.sb20221103.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
//import javax.persistence.SequenceGenerator;




@Entity
public class CusNotice {

	@Id
	@GeneratedValue
	private Long cusNo;
	
	//OneToOne
	private String Id;
	private String title;
	private String content;
	private String regdate;
	
	
	
	public CusNotice(Long cusNo, String Id, String title, String content, String regdate) {
		super();
		this.cusNo = cusNo;
		this.Id = Id;
		this.title = title;
		this.content = content;
		this.regdate = regdate;
	}
	
	
	public CusNotice() {
		
	}


	public Long getCusNo() {
		return cusNo;
	}
	public void setCusNo(Long cusNo) {
		this.cusNo = cusNo;
	}
	public String getId() {
		return Id;
	}
	public void setMemberId(String Id) {
		this.Id = Id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	
	
}

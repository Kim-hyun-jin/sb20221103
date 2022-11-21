package com.oracle.sb20221103.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
//import javax.persistence.SequenceGenerator;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;




@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@SequenceGenerator(name = "CUSNOTICE_SEQ_GEN",               // 객체  SEQ
sequenceName = "CUS_NOTICE_SEQ", // DB SEQ
initialValue = 10,
allocationSize =1 )
public class CusNotice {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,
    generator = "CUSNOTICE_SEQ_GEN")
	private Long cusNo;
	
//	//OneToOne
	private String Id;
//	@ManyToOne
//	@JoinColumn(name = "id")
//	private Member member;
	
	@Column(length = 500, nullable = false)
	private String title;
	
	@Column(length = 2000, nullable = false)
	private String content;
	private String regdate;
	



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

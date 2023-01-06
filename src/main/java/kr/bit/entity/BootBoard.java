package kr.bit.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity // DataBase의 테이블
@Data
public class BootBoard {  // VO <--ORM--> Table
	
	@Id  // id PK 지정
	@GeneratedValue(strategy = GenerationType.IDENTITY) // autoIncredent Auto사용가능
	private Long idx;
	private String title;
	private String content;
	@Column(updatable = false)
	private String writer;
	
	@Column(insertable = false, updatable = false, columnDefinition = "datetime default now()") //컬럼 세부지정
	private Date indate; // now
	@Column(insertable = false, updatable = false, columnDefinition = "int default 0")
	private Long count;
	
}

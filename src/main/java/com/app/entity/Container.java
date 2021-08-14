package com.app.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="container")
public class Container {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Column(name="name", nullable=false)
	private String name;

	@Column(name="level", nullable=false)
	private String level;
	
	@Column(name="lenword", nullable=false)
	private Integer lenWords;
	
	@Column(name="iduser", nullable=false)
	private long idUser;
	
	public Container() {
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	
	public Integer getLenWords() {
		return lenWords;
	}

	public void setLenWords(Integer lenWords) {
		this.lenWords = lenWords;
	}

	public long getIdUser() {
		return idUser;
	}

	public void setIdUser(long idUser) {
		this.idUser = idUser;
	}
	
	
	
	
}

package com.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="word")
public class Word {


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Column(name="name", nullable=false)
	private String name;
	
	@Column(name="meaning", nullable=false)
	private String meaning;
	
	@Column(name="urlimage", nullable=true)
	private String urlimage;
	
	@Column(name="sentence", nullable=false)
	private String sentence;

	@Column(name="idcontainer", nullable=false)
	private long idContainer;
	
	
	public Word() {
		
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

	public String getMeaning() {
		return meaning;
	}

	public void setMeaning(String meaning) {
		this.meaning = meaning;
	}

	public String getUrlimage() {
		return urlimage;
	}

	public void setUrlimage(String urlimage) {
		this.urlimage = urlimage;
	}

	public String getSentence() {
		return sentence;
	}

	public void setSentence(String sentence) {
		this.sentence = sentence;
	}

	public long getIdContainer() {
		return idContainer;
	}

	public void setIdContainer(long idContainer) {
		this.idContainer = idContainer;
	}
}

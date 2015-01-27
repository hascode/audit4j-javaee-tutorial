package com.hascode.tutorial.entity;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Book {
	private String id;
	private String title;

	public Book(final String id, final String title) {
		this.id = id;
		this.title = title;
	}

	public String getId() {
		return id;
	}

	public void setId(final String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(final String title) {
		this.title = title;
	}
}

package com.hascode.tutorial.service;

import java.util.Date;
import java.util.UUID;

import javax.ejb.Stateless;

import org.audit4j.core.annotation.Audit;
import org.audit4j.core.annotation.AuditField;
import org.audit4j.core.annotation.SelectionType;

import com.hascode.tutorial.entity.Book;

@Stateless
public class BookBean {

	@Audit
	public Book create(final String title) {
		Book book = new Book();
		book.setTitle(title);

		persist(book, new Date());

		return book;
	}

	@Audit(selection = SelectionType.MARKED)
	private void persist(@AuditField(field = "id") final Book book, final Date date) {
		book.setId(UUID.randomUUID().toString());
	}
}

package com.hascode.tutorial.repository;

import java.util.Queue;
import java.util.UUID;
import java.util.concurrent.ConcurrentLinkedQueue;

import javax.ejb.Singleton;

import org.audit4j.core.annotation.Audit;
import org.audit4j.core.annotation.AuditField;
import org.audit4j.core.annotation.SelectionType;

import com.hascode.tutorial.entity.Book;

@Singleton
public class BookRepository {
	private final Queue<Book> bookStore = new ConcurrentLinkedQueue<>();

	@Audit(selection = SelectionType.ALL)
	public Book create(final String title) {
		Book book = new Book(UUID.randomUUID().toString(), title);
		persist(book);
		return book;
	}

	@Audit(selection = SelectionType.MARKED)
	private void persist(@AuditField(field = "book") final Book book) {
		bookStore.add(book);
	}

	public Queue<Book> getBooks() {
		return bookStore;
	}
}

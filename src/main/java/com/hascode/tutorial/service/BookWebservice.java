package com.hascode.tutorial.service;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.hascode.tutorial.entity.Book;

@Stateless
@Path("/book")
public class BookWebservice {
	@Inject
	private BookBean bookBean;

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Response createBook(final String title) {
		Book book = bookBean.create(title);
		return Response.ok(book).build();
	}
}

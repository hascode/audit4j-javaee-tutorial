package com.hascode.tutorial.service;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.Path;

@Stateless
@Path("/book")
public class BookWebservice {
	@Inject
	private BookBean bookBean;
}

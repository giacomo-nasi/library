package it.html.tutorial.library.api;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("books")
public class BookServices {
	List<Book> books = new ArrayList<Book>();
	
	@GET
	public List<Book> list() {
		List<Author> authors = new ArrayList<Author>();
		Author author = new Author();
		author.setId(1);
		author.setName("Joanne");
		author.setSurname("Rowling");
		Book book1 = new Book();
		book1.setId(1);
		book1.setTitle("Harry Potter and the Philosopher's Stone");
		book1.setLanguage("english");
		authors.add(author);
		book1.setAuthors(authors);
		books.add(book1);
		Book book2 = new Book();
		book2.setId(2);
		book2.setTitle("Harry Potter and the Chamber of Secrets");
		book2.setLanguage("english");
		book2.setAuthors(authors);
		books.add(book2);
		return books;
	}
	@GET
	@Path("{id}")
	public Book get(@PathParam("{id}") long id) {
		for(Book b : books) {
			if(b.getId() == id)	{
				return b;
			}
		}
		return null;
	}
	@POST
	@Path("{id}")
	public Response add(Book book) throws URISyntaxException {
		long newId = 3;
		book.setId(newId);
		books.add(book);
		return Response.created(new URI("books/" + newId)).build();
	}
	@PUT
	@Path("{id}")
	public Response update(@PathParam("{id}") long id, Book book) {
		return Response.noContent().build();
	}
	@DELETE
	@Path("{id}")
	public Response delete(@PathParam("{id}") long id) {
		return Response.noContent().build();
	}
}

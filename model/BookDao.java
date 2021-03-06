import java.util.List;

public interface BookDao 
{

	public List<Book> getAll();
	public Book add(Book book);
	public Book delete(int bookId);
	public Book update(int id, double price);
	public Book getById(int bookId);
	public Book getBookByIsbn(String isbn);
}

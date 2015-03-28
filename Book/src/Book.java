public class Book
{
	/**
	 * Define a book by title, auhtor and the number of pages
	 */
	private String title;
	private String author;
	private int numberOfPages;
	/**
	 * Set the constructor of the book
	 * @param title
	 * @param author
	 * @param pageNumber
	 */
	public Book(String title, String author, int pageNumber)
	{	
		this.title = title;
		this.author = author;
		this.numberOfPages = pageNumber;
	}	
	/**
	 * a toString Method
	 */
	public String toString()
	{	
		return	"\n"+"Title: "+title+"\n"+
				"Author: "+author+"\n"+
				"PageNumber: "+numberOfPages;
	}	
}

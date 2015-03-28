import java.util.Arrays;
public class Volume
{
	/**
	 * Define a volume by the name, book object array, and number of books
	 */
	private String volumeName;	
	private Book[] bookArray;
	private int numberOfBooks;
	
	/**
	 * Set the constructor of the volume
	 * @param volumeName
	 * @param numberOfBooks
	 * @param bookArray
	 */
	public Volume(String volumeName, int numberOfBooks, Book[] bookArray)
	{	
		this.volumeName = volumeName;		
		this.numberOfBooks = numberOfBooks;
		this.bookArray = bookArray;
	}
	/**
	 * toString method
	 */
	public String toString()
	{	
		return	"Volume Name: "+volumeName+"\n"+
				"Book Array: "+Arrays.toString(bookArray)+"\n"+
				"Number Of Books: "+numberOfBooks;
	}
}
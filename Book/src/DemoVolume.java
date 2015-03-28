public class DemoVolume 
{
	public static void main(String[] args)
	{
		/**
		 * Created three books to put into a book array
		 */
		
		Book book1 = new Book("The First King", "McKing Kingston",140);
		Book book2 = new Book("The Second King", "McKing Kingston",160);
		Book book3 = new Book("The Third King", "McKing Kingston",180);	
		/**
		 * create book array of 3 objects
		 */
		Book[] bookArray1= new Book[3];
		/**
		 * initialized the array
		 */
		bookArray1[0]=book1;
		bookArray1[1]=book2;
		bookArray1[2]=book3;
		/**
		 * made a volume using book array I just made
		 */
		
		Volume volume1 = new Volume("King's Volume",3,bookArray1);
		/**
		 * prints out the volume
		 */
		System.out.println(volume1);
	}
}
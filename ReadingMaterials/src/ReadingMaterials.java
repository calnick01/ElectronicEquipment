import java.util.Random;
import java.util.Scanner;
public class ReadingMaterials
{ 
	private String author; 
	private String bookTitle;
	private int numberOfPages;
	private int wordCount;
	private static String[] randomNames={"John","Joe","Jim","Jane","Janey","Julie","Joel","Joseph"};
	private static String[] randomLastNames={"Smith","Nguyen","Johnson","Lopez","Anderson","King","Ludwig","Sanders"};
	private static String[] randomBookTitles={"Harry Potter","Star Wars","Twilight","Percy Jackson","Matrix","Lion, Witch, and the Wardrobe"};
	Scanner keyboard = new Scanner(System.in); 

	public ReadingMaterials() 
	{ 
		author = "";
		numberOfPages=0;
		bookTitle = "";
		wordCount=0;
	}	
	
	public String getAuthor() 
	{		return author;	}
	public void setAuthor(String author)
	{		this.author = author;	}
	public String getBookTitle() 
	{		return bookTitle;	}
	public void setBookTitle(String bookTitle) 
	{		this.bookTitle = bookTitle;	}
	public int getNumberOfPages() 
	{		return numberOfPages;	}
	public void setNumberOfPages(int numberOfPages) 
	{		this.numberOfPages = numberOfPages;	}
	public int getWordCount() 
	{		return wordCount;	}
	public void setWordCount(int wordCount) 
	{		this.wordCount = wordCount;	} 	
	
	public String toString() 
	{
		return "\nReading Materials: "
				+ "\n Author: " + author + "."
				+ "\n Book Title: " + bookTitle + "."
				+ "\n Number of Pages: " + numberOfPages + " pages." 				
				+ "\n Number of Words: " + wordCount + " words.";
	}
	public void randomReadingMaterialInfo()
	{
		System.out.println("\nRandom values will be used for the information."); 
		Random randomNumber = new Random();
		int random  = randomNumber.nextInt(8);
		int random2 = randomNumber.nextInt(8);
		int random3 = randomNumber.nextInt(300) + 100;
		int random4 = randomNumber.nextInt(6);
		int random5 = randomNumber.nextInt(100000)+500000;
		
		author = randomNames[random]+ " " +randomLastNames[random2];
		bookTitle=randomBookTitles[random4];
		numberOfPages=random3;
		wordCount=random5;
	}	
	public void customReadingMaterialInfo() 
	{	System.out.println("The author's name?"); 
		author = keyboard.nextLine(); 		
		System.out.println("Name of the book?");
		bookTitle = keyboard.nextLine();
		System.out.println("How many pages?"); 
		numberOfPages = keyboard.nextInt();
		System.out.println("How many words?");
		wordCount = keyboard.nextInt();		
	}
}

class Textbook extends ReadingMaterials
{
	private int numberOfGlossaryDefinitions;
	private int numberOfSourceImages;
	
	public Textbook()
	{
		numberOfGlossaryDefinitions=0;
		numberOfSourceImages=0;		
	}
	
	public int getnumberOfGlossaryDefinitions() 
	{		return numberOfGlossaryDefinitions;	}
	public void setNumberOfGlossaryDefinitions(int numberOfGlossaryDefinitions)
	{		this.numberOfGlossaryDefinitions =numberOfGlossaryDefinitions ;	}
	public int getnumberOfSourceImages() 
	{		return numberOfSourceImages;	}
	public void setNumberOfSourceImages(int numberOfSourceImages)
	{		this.numberOfSourceImages =numberOfSourceImages ;	}
	
	public void randomTextbook()
	{
		Random randomNumber = new Random();
		int random = randomNumber.nextInt(100) + 65;
		int random2= randomNumber.nextInt(100) + 120;
		System.out.println("Random values will be used for textbook info."); 
		numberOfGlossaryDefinitions = random;
		numberOfSourceImages = random2;
	}
	public void customTextbook() 
	{	
		System.out.println("How many glossary definitions?"); 
		numberOfGlossaryDefinitions = keyboard.nextInt();
		System.out.println("How many source images?");		
		numberOfSourceImages = keyboard.nextInt();	
	}	
	public String toString() 
	{
		return super.toString() 
				+ "\nTextbook Info: "
				+ "\n Total number of glossary definitions: " + numberOfGlossaryDefinitions + " definitions."
				+ "\n Total source images: " + numberOfSourceImages + " source images.";
	}
}

class Novel extends ReadingMaterials
{
	private int chapters;
	private String mainCharacter;
	private static String[] randomNames={"John","Joe","Jim","Jane","Janey","Julie","Joel","Joseph"};
	Scanner keyboard = new Scanner(System.in); 

	public Novel() 
	{ 
		chapters = 0;
		mainCharacter="";
	}	
	
	public int getChapters() 
	{		return chapters;	}
	public void setChapters(int chapters)
	{		this.chapters = chapters;	}
	public String getMainCharacter() 
	{		return mainCharacter;	}
	public void setMainCharacter(String mainCharacter)
	{		this.mainCharacter = mainCharacter;	}
	
	public String toString() 
	{
		return super.toString() + "\nNovel: "
				+ "\n Chapters: " + chapters + "."
				+"\n Main Character: "+mainCharacter+".";
	}
	public void randomNovel()
	{
		System.out.println("\nRandom values will be used for the information."); 
		Random randomNumber = new Random();
		int random  = randomNumber.nextInt(10)+15;
		chapters=random;
		int random2 = randomNumber.nextInt(8);
		mainCharacter=randomNames[random2];
	}	
	public void customNovel() 
	{	System.out.println("The number of chapters?"); 
		chapters = keyboard.nextInt(); 			
		System.out.println("The main character is?");
		mainCharacter=keyboard.nextLine();
	} 
}
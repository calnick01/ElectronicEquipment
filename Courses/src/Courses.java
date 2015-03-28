import java.util.Scanner;
public class Courses
{ 	
	private String title;
	private int roomNumber;
	private String department;
	private String description;
	Scanner keyboard = new Scanner(System.in); 

	public Courses() 
	{ 
		title = "";
		roomNumber=0;
		department="";
		description="";
	}	
	
	public Courses(String title, int roomNumber, String department,	String description) 
	{
		this.title = title;
		this.roomNumber = roomNumber;
		this.department = department;
		this.description = description;
	}
		
	public String getTitle() 
	{		return title;	}
	public void setTitle(String title)
	{		this.title = title;	}
	public int getRoomNumber()
	{		return roomNumber;	}
	public void setRoomNumber(int roomNumber)
	{		this.roomNumber = roomNumber;	}
	public String getDepartment()
	{		return department;	}
	public void setDepartment(String department)
	{		this.department = department;	}
	public String getDescription() 
	{		return description;	}
	public void setDescription(String description)
	{		this.description = description;	} 
	
	public String toString() 
	{
		return "\nCourses: "
				+ "\n Title: " + title + "."
				+ "\n Room Number: " + roomNumber + "."
				+ "\n Department: " + department + " department."
				+ "\n Description: " + description + ".";
	}
	public void inputInfo() 
	{	System.out.println("The course title?"); 
		title = keyboard.nextLine(); 
		System.out.println("The room number?");
		roomNumber = keyboard.nextInt();
		System.out.println("The department?");
		department = keyboard.nextLine();
		System.out.println("The description?");
		description = keyboard.nextLine();
	}
}
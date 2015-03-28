public class CoursesDemo 
{
	public static void main(String[] args)
	{
		Courses math = new Courses("Math 274",312,"Math","Learn integration and calculus");
		System.out.println(math);
		
		Courses science = new Courses("Biology 201",202,"Science","Learn about the body and cells");
		System.out.println(science);
		
		Courses history = new Courses("History 101",105,"History","Learn about history of america");
		System.out.println(history);
		
		Courses english = new Courses("English 111",109,"English","Learn how to properly write an essay");
		System.out.println(english);
	}
}
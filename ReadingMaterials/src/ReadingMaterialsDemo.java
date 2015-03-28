public class ReadingMaterialsDemo 
{
	public static void main(String[] args)
	{
		ReadingMaterials test = new ReadingMaterials();
		test.randomReadingMaterialInfo();
		System.out.println(test);
		
		Textbook texttest = new Textbook();
		texttest.randomReadingMaterialInfo();
		texttest.randomTextbook();
		System.out.println(texttest);
		
		Novel noveltest= new Novel();
		noveltest.randomReadingMaterialInfo();
		noveltest.randomNovel();
		System.out.println(noveltest);		
	}
}
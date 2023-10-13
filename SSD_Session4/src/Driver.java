
public class Driver
{
	public static void main(String[] args)
	{
		Subject[] subjectArray = new Subject[5];
		
		Maths m1 = new Maths("Mathmatics", "Numbers and stuff", "John", "304");
		subjectArray[0] = m1;
		
		Physics p1 = new Physics("Physics", "More numbers and stuff", "Nick", "11");
		subjectArray[1] = p1;
		
		Art a1 = new Art("Art", "Painting and drawing", "Tanner", "342");
		subjectArray[2] = a1;
		
		History h1 = new History("History", "Learning the past", "Rachel", "65");
		subjectArray[3] = h1;
		
		Languages l1 = new Languages("English", "Learning english", "Michael", "75");
		subjectArray[4] = l1;
		
		for(int i = 0; i < subjectArray.length; i++)
		{
			System.out.println(subjectArray[i].toString());
		}
	}
}

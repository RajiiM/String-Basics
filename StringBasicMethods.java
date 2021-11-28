NOTE:
Array - length - State
String - length - Method

String = Character Array
length()
charAt()

public class Task 
{
	public static void main(String[] args) 
	{		
		String str_obj = new String("STRING");
		
		System.out.println(str_obj.length());
		
		for(int i = 0;i<str_obj.length();i++)
		{
		System.out.println(str_obj.charAt(i));	
		}
	}
}
//OUTPUT
6
S
T
R
I
N
G
--------------------
public class Task {
	public static void main(String[] args) 
	{
		Task task_obj = new Task();
		task_obj.countOfVowels();
		task_obj.countOfWords();
		task_obj.countOfSentence();
		
	}
	
	public void countOfVowels()
	{
		String str_obj = new String("RAJII");
		int count = 0;

		for (int i = 0; i < str_obj.length(); i++) 
		{
			char ch = str_obj.charAt(i);

			switch (ch) {
			case 'A':
				count++;
				break;
			case 'E':
				count++;
				break;
			case 'I':
				count++;
				break;
			case 'O':
				count++;
				break;
			case 'U':
				count++;
				break;
			}
		}
		System.out.println("Count of vowels " + count);
	}
	
	public void countOfWords()
	{
		String str_obj = new String("Hi! This is Rajalakshmi");
		int count = 1;
		
		for(int i = 0; i<str_obj.length();i++)
		{
					if(str_obj.charAt(i) == ' ')
					{
						count++;
					}
		}		
		System.out.println("Count of words " + count);
	}
	
	public void countOfSentence()
	{
		String str_obj = new String("This is Rajii. My mail id:mrajiijanu@gmail.com. My mobile number 12345. ");
		int count = 0;
		
		for(int i = 0; i<str_obj.length();i++)
		{
					if(str_obj.charAt(i) == '.' && str_obj.charAt(i+1) == ' ')
					{	
						count++;
					}
		}		
		System.out.println("Count of Sentence " + count);
	}
}
//OUTPUT
Count of vowels 3
Count of words 4
Count of Sentence 3
-------------------
public class Task {
	public static void main(String[] args) 
	{
		Task task_obj = new Task();
		System.out.println("CONTAINS METHOD");
		task_obj.searchLetter();
		System.out.println();
		
		System.out.println("STARTSWITH METHOD");
		task_obj.startLetters();
		System.out.println();
		
		System.out.println("ENDSWITH METHOD");
		task_obj.endLetters();
		System.out.println();
		
		System.out.println("TRIM METHOD");
		task_obj.removeSpace();
		System.out.println();
	}
	
	public void searchLetter()
	{
		String str_obj = new String("RAJII");
		System.out.println("U is presented in RAJII");
		System.out.println(str_obj.contains("U"));	
		System.out.println("A is presented in RAJII");
		System.out.println(str_obj.contains("A"));	
	}
	
	public void startLetters()
	{
		String str_obj = new String("Rajalakshmi");
		System.out.println("Rajalakshmi name starts with Ra");
		System.out.println(str_obj.startsWith("Ra"));
	}
	
	public void endLetters()
	{
		String str_obj = new String("Rajalakshmi");
		System.out.println("Rajalakshmi name ends with xmi");
		System.out.println(str_obj.startsWith("xmi"));
	}
	
	public void removeSpace()
	{
		String str_obj1 = new String("  RAJA LAKSHMI ");
		String str1 = str_obj1.trim();
		System.out.println(str_obj1);
		System.out.println(str_obj1.length());
		System.out.println(str1);
		System.out.println(str1.length());
	}
}
//OUTPUT
CONTAINS METHOD
U is presented in RAJII
false
A is presented in RAJII
true

STARTSWITH METHOD
Rajalakshmi name starts with Ra
true

ENDSWITH METHOD
Rajalakshmi name ends with xmi
false

TRIM METHOD
  RAJA LAKSHMI 
15
RAJA LAKSHMI
12




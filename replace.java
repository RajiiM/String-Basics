Using indexOf method, we found C index position.
String is convertet into character array using toCharArray method.
C index position is passing into character array index.
And assigned E in that index.
Character array is converted into String.

public class Task {
	public static void main(String[] args) 
	{
		String obj1 = "ABCD";
		System.out.println(obj1);
		System.out.println(obj1.replace("C", "E"));
	}		
}
//OUTPUT
ABCD
ABED

public class Task {
	public static void main(String[] args) 
	{
		String obj1 = "ABCD";
		System.out.println(obj1);
		int position = obj1.indexOf("C");
		
        char char_array[] = obj1.toCharArray();
        char_array[position] = 'E';
        obj1 = new String(char_array);
        System.out.println(obj1);
	}		
}
//OUTPUT
ABCD
ABED

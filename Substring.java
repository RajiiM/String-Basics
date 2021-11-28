public class Task {
	public static void main(String[] args) 
	{
		String obj1 = "Rajalakshmi Manikandan";
		System.out.println(obj1);
		System.out.println(obj1.substring(4));
		System.out.println(obj1.substring(4,12));
	}		
}

//OUTPUT
Rajalakshmi Manikandan
lakshmi Manikandan
lakshmi 



public class Task {
	public static void main(String[] args) 
	{
		String obj1 = "Rajalakshmi Manikandan";
		System.out.println(obj1);
	    char char_array1[] = obj1.toCharArray();	    
	    int begin = 4;
	    char char_array2[] = new char[char_array1.length-begin];
	    int j = 0;
	    for(int i = begin; i<char_array1.length;i++)
	    {
	    	char_array2[j] = char_array1[i];
	    	j++;
	    }
	    obj1 = new String(char_array2);
	    System.out.println(obj1);
	}		
}

//OUTPUT
Rajalakshmi Manikandan
lakshmi Manikandan


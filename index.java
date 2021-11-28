index of --> method overloading

public class Task {
	public static void main(String[] args) 
	{
		Task task_obj = new Task();
		System.out.println("INDEX OF METHOD");
		task_obj.find_Index_Position();
		System.out.println();
		
		System.out.println("We give index where to start finding - INDEX OF METHOD");
		task_obj.find_Index_Position_1();
		System.out.println();
		
		System.out.println("LAST INDEX OF METHOD");
		task_obj.findLast_Index_Position();
		System.out.println();
	
		System.out.println("Start & end of the name");
		task_obj.find_Position();
		System.out.println();
	}
	
	public void find_Index_Position()
	{
		String str_obj = new String("RAJII");
		System.out.println("I position in RAJII " + (str_obj.indexOf("I")));
	}
	
	public void find_Index_Position_1()
	{
		String str_obj = new String("RAJALAKSHMI MANIKANDAN");
		System.out.println("A position in RAJALAKSHMI " + (str_obj.indexOf("A", 15)));
	}
	
	public void findLast_Index_Position()
	{
		String str_obj = new String("RAJIIV");
		System.out.println("I position in RAJIIV " + (str_obj.lastIndexOf("I")));
	}
	
	public void find_Position()
	{
		String str_obj = new String("Rajalakshmi");
		int position_1 = str_obj.indexOf("R");
		int position_2 = str_obj.lastIndexOf("i");
		
		if(position_1==0 && position_2==(str_obj.length()-1))
		{
			System.out.println("True: Rajalakshmi starts with R ends with i");
		}
		
		else
		{
			System.out.println("False: Rajalakshmi starts with R ends with i");
		}	
		
		String str_obj1 = new String("Janaki");
		int pos_1 = str_obj1.indexOf("R");
		int pos_2 = str_obj1.lastIndexOf("i");
		
		if(pos_1==0 && pos_2==(str_obj1.length()-1))
		{
			System.out.println("True: Janaki starts with J ends with i");
		}
		
		else
		{
			System.out.println("False: Janaki cannot starts with R ends with i");
		}	
	}	
}
//OUTPUT
INDEX OF METHOD
I position in RAJII 3

We give index where to start finding - INDEX OF METHOD
A position in RAJALAKSHMI 17

LAST INDEX OF METHOD
I position in RAJIIV 4

Start & end of the name
True: Rajalakshmi starts with R ends with i
False: Janaki cannot starts with R ends with i


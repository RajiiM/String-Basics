public class Task {
	public static void main(String[] args) 
	{
		String obj1 = "ABCD";
		String obj2 = "";
		String obj3 = " ";
		
		System.out.println("Inside quotations ABCD");
		System.out.println("Blank: " + (obj1.isBlank()));
		System.out.println("Empty: " + (obj1.isEmpty()));
		
		System.out.println("Inside quotations nothing");
		System.out.println("Blank: " + (obj2.isBlank()));
		System.out.println("Empty: " + (obj2.isEmpty()));
		
		System.out.println("Inside quotations empty single space");
		System.out.println("Blank: " + (obj3.isBlank()));
		System.out.println("Empty: " + (obj3.isEmpty()));				
	}		
}
//OUTPUT
Inside quotations ABCD
Blank: false
Empty: false
Inside quotations nothing
Blank: true
Empty: true
Inside quotations empty single space
Blank: true
Empty: false

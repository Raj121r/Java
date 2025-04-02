public class Default_thread
{
	public static void main(String[] args) 
	{
	    Thread obj=Thread.currentThread();
		
		System.out.println(obj.getName());     // main
	
		obj.setName("Rahul");
		System.out.println(obj.getName());      //Rahul
	
		System.out.println(obj.getPriority());       //5
	
		obj.setPriority(10);
		System.out.println(obj.getPriority());       //10
		
	}
}   

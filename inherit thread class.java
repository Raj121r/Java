public class My_thread extends Thread
{
	public static void main(String[] args) 
	{
	    Thread obj=new Thread();
		
		System.out.println(obj.getName());     // Thread-0
	
		obj.setName("Rahul");
		System.out.println(obj.getName());      //Rahul
	
		System.out.println(obj.getPriority());       //5
	
		obj.setPriority(10);
		System.out.println(obj.getPriority());       //10
		
			}
}   

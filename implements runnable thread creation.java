

public class My_thread implements Runnable
{
    public void run()
    {
        System.out.println("This is overridden method ubder my_thread class");
    }
	public static void main(String[] args) 
	{
	    My_thread m1=new My_thread();       // object of new created class 
	    
	    Thread obj=new Thread(m1);          // object of pre-definbed Thread class
		
		System.out.println(obj.getName());        // thread-0
	
		obj.setName("Rahul");
		System.out.println(obj.getName());         // Rahul
	
		System.out.println(obj.getPriority());          // 5
	
		obj.setPriority(10);
		System.out.println(obj.getPriority());            //10
		
			}
}   

        //  Thread using sleep method


// public class My_thread implements Runnable
// {
//     public void run()
//     {
        
//             try 
//                {
//                 for(int i=1;i<16;i++)
        
//                     {
//                         System.out.println(i);  
//                         Thread.sleep(500);
                
//                     }
//                 }
//             catch(Exception e)
//                 {
                
//                 }
//     }
// 	public static void main(String[] args) 
// 	{
// 	    My_thread m1=new My_thread();    
	    
// 	    Thread obj=new Thread(m1);     
// 	    	    obj.start();
// 	 }
// }   

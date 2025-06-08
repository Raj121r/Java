
import java.lang.Cloneable;
 class Student implements Cloneable{
     int roll;

     public Student (int roll) {
         this.roll = roll;
     }

     @Override
     protected Object clone() throws CloneNotSupportedException {
         return super.clone();
     }
 }
 class About implements Cloneable{
    int marks;
    String ability;
    Student student;
    public About(int marks,String ability,Student student){
        this.marks=marks;
        this.ability=ability;
        this.student=student;
    }

    @Override
     protected Object clone() throws CloneNotSupportedException{
        About abt2= (About)super.clone();
         abt2.student=(Student)student.clone();
         return abt2;
      // return super.clone();
    }
    
    
    
    public void display(){
        System.out.println(student.roll);
    }
 }
 public class Main {
     public static void main(String[] a) throws CloneNotSupportedException{
         Student stu1 = new Student(10);
         About abt1 = new About(100, "good in swiming as well", stu1);
         Student stu2 = (Student)stu1.clone();
         stu2.roll = 11;
         About abt2 = (About)abt1.clone();
         abt2.marks = 101;
         abt2.ability = "can climb";
         System.out.println(abt1.marks+"  " + abt1.ability +"   " + abt2.marks +"   "+ abt2.ability);
         System.out.println(stu1.roll +"   " +stu2.roll);
        
        abt2.student.roll= 12; 
         abt1.display();
         abt2.display();
        

         

     }
 }

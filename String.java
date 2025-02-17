import java.util.*;
public class Main {
    public static void main(String[] args) {
       // Scanner sc=new Scanner(System.in);
       // String str=sc.nextLine();
        String str="Rajat";
        System.out.println(str);
        System.out.println(str.charAt(4));
        System.out.println(str.length());
        System.out.println(str.indexOf('t'));

        String str1="Raghav";
        System.out.println(str.compareTo(str1));  // difference between 'd' and 'j'=6
        System.out.println(str.contains("jat"));
        System.out.println(str.startsWith("n"));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
    //    System.out.println(str.concat("Tiwari"));     // add string
     //   str=str.concat(str);
    //    System.out.println(str);

       str=str+"tiwari";    // can add string
        System.out.println(str);
        str += 't';               // can add character
        System.out.println(str);
        str += 45;                 // can add intiger
        System.out.println(str);

        System.out.println("this is me"+ 10+20);    // left precedence
        System.out.println(10+20+"this is me");
        System.out.println(str.substring(3));          // substrings
        for(int i=0;i<14;i++)
        {
            for(int j=i;j<=14;j++)
            {
                System.out.print(" "+str.substring(i,j));
            }    //inner for loop
        }      // outer for loop
        
    }       



import java.util.*;
public class Sorting {                  // ascending order

   public static int[] selec_sort(int[] arr)
   {
          for(int i=0;i<(arr.length-1);i++)
          {
              int min=i;
              for(int j=i+1;j<(arr.length);j++)
              {
                  if(arr[j]<arr[min])
                  {
                      min=j;
                  }
              }
              int temp=arr[min];
              arr[min]=arr[i];
              arr[i]=temp;
          }
          return arr;
     }

    public static int[] insert_sort(int[] arr) {
        for (int i = 1; i < (arr.length); i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
        return arr;
    }


    public static int[] bubble_sort(int[] arr)
     {
         for(int i=0;i<(arr.length-1);i++){
             for(int j=0;j<(arr.length-1-i);j++)
             {
                 if(arr[j]>arr[j+1])
                 {
                     int temp=arr[j];
                     arr[j]=arr[j+1];
                     arr[j+1]=temp;
                 }
             }
         }
         return arr;
     }


    public static void main(String a[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter size of array");
        int n=sc.nextInt();

           int []arr= new int[n];
        System.out.println("Enter "+n+ " Elements");
           for(int i=0;i<n;i++)
           {
               arr[i]=sc.nextInt();
           }

//         int brr[]=new int[n];
//          brr=selec_sort(arr);        // selection sort method calling
//        System.out.println("sorted elements of array are: ");
//        for(int i=0;i<n;i++)
//        {
//            System.out.println(brr[i]);
//        }

        // int brr1[]=new int[n];
        // brr1=insert_sort(arr);           // insertion sort method calling
        // System.out.println("sorted elements of array are: ");
        // for(int i=0;i<n;i++)
        // {
        //     System.out.println(brr1[i]);
        // }


        int brr2[]=new int[n];
        brr2=bubble_sort(arr);           // Bubble sort method calling
        System.out.println("sorted elements of array are: ");
        for(int i=0;i<n;i++)
        {
            System.out.println(brr2[i]);
        }

    }
}

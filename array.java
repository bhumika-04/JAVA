import java.util.Scanner;  
public class array   
{  
        int array[] = new int[50];  
        int n,sum=0;  
         
    void show(){
        Scanner sc=new Scanner(System.in);  
         System.out.print("Enter the number of elements in array: ");  
          n=sc.nextInt();  
  
        System.out.println("Enter the elements of the array: ");  
        for(int i=0; i<n; i++)  
   {  
    array[i]=sc.nextInt();  
    sum=sum+array[i];
   }  
System.out.println("Sum of the array: "+sum); 
    }
   public static void main(String[] args)   
{  
 array ob=new array();
 ob.show();
}  
}  
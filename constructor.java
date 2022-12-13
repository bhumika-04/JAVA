import java.util.Scanner;
class constructor{
 constructor(){
 int a,b,sum;
    Scanner sc = new Scanner(System.in);
    
      System.out.print("Enter 1 the number : ");
      a = sc.nextInt();

       System.out.print("Enter 2 the number : "); 
      b = sc.nextInt();
      sum = a+b; 
      System.out.print("Sum of Number is: "+sum);
 }
public static void main(String[] args){
    constructor obj= new constructor();
}
}
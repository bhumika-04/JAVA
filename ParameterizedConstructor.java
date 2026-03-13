import java.util.Scanner;
class ParameterizedConstructor{
 ParameterizedConstructor(int x,int y){

      int sum = x+y;
      System.out.print("Sum of Number is: "+sum);
 }
public static void main(String[] args){
    int a,b;
    Scanner sc = new Scanner(System.in);

      System.out.print("Enter 1 the number : ");
      a = sc.nextInt();

       System.out.print("Enter 2 the number : ");
      b = sc.nextInt();
    ParameterizedConstructor obj= new ParameterizedConstructor(a,b);
}
}

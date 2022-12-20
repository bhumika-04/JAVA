  import java.util.Scanner;
class A{
  int x,y,z;
 A(int x,int y,int z){
      this.x=x;
      this.y=y;
      this.z=z;
      int sum = x+y+z; 
      System.out.print("Sum of Number is: "+sum);
 }
public static void main(String[] args){
    int a,b,c;
    Scanner sc = new Scanner(System.in);
    
      System.out.print("Enter 1 the number : ");
      a = sc.nextInt();

       System.out.print("Enter 2 the number : "); 
      b = sc.nextInt();
      System.out.print("Enter 3 the number : "); 
      c = sc.nextInt();
    A obj= new A(a,b,c);
   

}
}
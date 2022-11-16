import java.util.Scanner;
class fun {
   
    float f1(float a,float b, float c){
       float x=a+b+c;
        System.out.println("Sum of digit is :"+x);
        return(x);
    }
    public static void main(String[] args) {
       fun ob= new fun();
        Scanner sc=new Scanner(System.in);   
        System.out.println("Enter 1st number :");
       float p =sc.nextFloat();
        System.out.println("Enter 2nd number :");
       float q =sc.nextFloat();
        System.out.println("Enter 2nd number :");
       float r =sc.nextFloat();
       ob.f1(p,q,r);
    }
}
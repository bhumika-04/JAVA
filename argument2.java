import java.util.Scanner;
class argument2 {
    int p1,q1;
    void sumofint(int p,int q){
        
       p1=p;
       q1=q;
       
        System.out.println("Sum of digit is :"+(p1+q1));
        System.out.println("Sub of digit is :"+(p1-q1));
        System.out.println("Mul of digit is :"+p1*q1);
        System.out.println("Div of digit is :"+p1/q1);
    }
    public static void main(String[] args) {
        
       argument2 ob= new argument2();
       Scanner sc=new Scanner(System.in);   
        System.out.println("Enter 1st number :");
       ob.p1 =sc.nextInt();
        System.out.println("Enter 2nd number :");
       ob.q1 =sc.nextInt();
       ob.sumofint(ob.p1,ob.q1);
       
    }
}
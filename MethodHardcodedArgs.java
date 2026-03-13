import java.util.Scanner;
class MethodHardcodedArgs {

    void sumofint(int p,int q){

        System.out.println("Sum of digit is :"+(p+q));
        System.out.println("Sub of digit is :"+(p-q));
        System.out.println("Mul of digit is :"+p*q);
        System.out.println("Div of digit is :"+p/q);
    }
    public static void main(String[] args) {
       MethodHardcodedArgs ob= new MethodHardcodedArgs();
       ob.sumofint(100,10);
    }
}

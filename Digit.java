import java.util.Scanner;
class Digit {
    int num,dig,sum=0;
    void sumofint(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter digits to add number :");
        num=sc.nextInt();
        while(num!=0){
            
            dig=num%10;
            sum=sum+dig;
            num=num/10;
        }
        System.out.println("Sum of digit is :"+sum);
    }
    public static void main(String[] args) {
       Digit ob= new Digit();
       ob.sumofint();
    }
}
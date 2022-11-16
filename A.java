//Class & Object
import java.util.Scanner;

class A 
{
 public static void main(String args[])
{ int a[ ]=new int[6];
int sum=0;
Scanner sc=new Scanner(System.in);

for(int i=0;i<=5;i++)
{ a[i]=sc.nextInt();
 sum+=a[i];
}
 System.out.println(sum);
}
}
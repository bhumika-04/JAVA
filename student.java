import java.util.Scanner;

class student{
    String name;
    int age;
    float cgpa;

    student(String n,int a,float c){
      name=n;
      age=a;
      cgpa=c;
    }
    void show(){
        System.out.println("Your Name:"+name);
         System.out.println("Your Age:"+age);
          System.out.println("Your CGPA:"+cgpa);
      }
     
    public static void main(String[] args) {
      int age1;
      float cgpa1;
      String name1;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter Your Name:");
      name1=sc.nextLine();
       System.out.println("Enter Your Age:");
      age1=sc.nextInt();
       System.out.println("Enter Your CGPA:");
      cgpa1=sc.nextFloat();
      student obj= new student(name1,age1,cgpa1);
      obj.show();
    
}
}

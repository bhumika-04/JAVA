import java.util.Scanner;

class student3{
    String name;
    int age;
    float cgpa;

    student3(String name,int age,float cgpa){
      this.name=name;
      this.age=age;
      this.cgpa=cgpa;
    }
    void show(){
        System.out.println("Your Name:"+name);
         System.out.println("Your Age:"+age);
          System.out.println("Your CGPA:"+cgpa);
      }

      void f1(){
        
      this.show();
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
      student3 obj= new student3(name1,age1,cgpa1);
    obj.f1();
}
}

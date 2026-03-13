import java.util.Scanner;

class StudentConstructorChaining{
    String name;
    int age;
    float cgpa;

    StudentConstructorChaining(String name,int age,float cgpa){
      this.name=name;
      this.age=age;
      this.cgpa=cgpa;
      System.out.println("Your Name:"+name);
         System.out.println("Your Age:"+age);
          System.out.println("Your CGPA:"+cgpa);
    }
    StudentConstructorChaining(){

        this("Bhumika",19,8.9f);
    }


    public static void main(String[] args) {

      StudentConstructorChaining obj= new StudentConstructorChaining();

}
}

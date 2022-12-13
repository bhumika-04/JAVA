import java.util.Scanner;

class student4{
    String name;
    int age;
    float cgpa;

    student4(String name,int age,float cgpa){
      this.name=name;
      this.age=age;
      this.cgpa=cgpa;
      System.out.println("Your Name:"+name);
         System.out.println("Your Age:"+age);
          System.out.println("Your CGPA:"+cgpa);
    }
    student4(){
     
        this("Bhumika",19,8.9f);
    }
   
     
    public static void main(String[] args) {
     
      student4 obj= new student4();
    
}
}

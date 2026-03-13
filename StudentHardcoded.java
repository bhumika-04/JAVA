import java.util.Scanner;

class StudentHardcoded{
    String name;
    int age;
    float cgpa;

    StudentHardcoded(String name,int age,float cgpa){
      this.name=name;
      this.age=age;
      this.cgpa=cgpa;
    }
    void show(){
        System.out.println("Your Name:"+name);
         System.out.println("Your Age:"+age);
          System.out.println("Your CGPA:"+cgpa);
      }

    public static void main(String[] args) {

      StudentHardcoded obj= new StudentHardcoded("bhumika",19,8.1f);
      obj.show();

}
}

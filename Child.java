// define a class base with datamembers string name,int age,and memeber func getbasedata() and showbasedata() 
// define another class with data memeber string branch and int sem and member functions are 
// getchild data ()and showchild data (),child is a derived class from base initialise obj
// of the child class and access all its member methods as well as member method of base class 
// to show the existence of inheritance amomng them .implement this scenario in java 

import java.util.Scanner;

class Base{ 
    String name;
    int age;

    void GetBaseData(){
         Scanner sc=new Scanner(System.in);  
         System.out.println("Enter Your Name :");
        name =sc.nextLine();
        System.out.println("Enter Your Age :");
        age=sc.nextInt();
    }
   void ShowBaseData(){
    System.out.println(" Name: "+name);
    System.out.println("Age: "+age);
   }
}
class Child extends Base {
    String branch;
    int sem;
     void GetChildData(){
        Scanner sc=new Scanner(System.in);  
         System.out.println("Enter Your Branch :");
        branch =sc.nextLine();
        System.out.println("Enter Your Semester :");
        sem=sc.nextInt();
    }
   void ShowChildData(){
    System.out.println(" Branch: "+branch);
    System.out.println("Semester: "+sem);
   }
   public static void main(String[] args) { 
      Child ob= new Child();
      ob.GetBaseData();
      ob.GetChildData();
      ob.ShowBaseData();
      ob.ShowChildData();
   }
}
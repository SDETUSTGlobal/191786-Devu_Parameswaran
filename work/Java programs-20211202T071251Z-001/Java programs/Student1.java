import java.io.*;
public class Student1{
   String name;
   int age;
   int marks;

   public Student1(String name) {
      this.name = name;
   }


   public void sAge(int sAge) {
      age = sAge;
   }

   public void smarks(int smarks) {
      marks = smarks;
   }


   public void printStudent() {
      System.out.println("Name:"+ name );
      System.out.println("Age:" + age );
      System.out.println("Marks:" + marks );
     
   }
}
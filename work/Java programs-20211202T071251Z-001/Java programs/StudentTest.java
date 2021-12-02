import java.io.*;
public class StudentTest {

   public static void main(String args[]) {
      /* Create two objects using constructor */
      Student1 sOne = new Student1("Anu");
      Student1 sTwo = new Student1("Manu");
	  Student1 sThree = new Student1("Mary");

      // Invoking methods for each object created
      sOne.sAge(16);
      sOne.smarks(150);
      sOne.printStudent();

      sTwo.sAge(15);
      sTwo.smarks(150);
      sTwo.printStudent();
	  
	  sThree.sAge(26);
      sThree.smarks(150);
      sThree.printStudent();
   }
}
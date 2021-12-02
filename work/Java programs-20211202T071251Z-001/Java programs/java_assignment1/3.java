class Student{
     int rollno;
     String name;
     static String college;
     
     static void clg(){
     college = "RSET";
     }

     Student(int r, String n){
     rollno = r;
     name = n;
     }

     void display(){System.out.println(rollno+" "+name+" "+college);}
}
public class StaticMethod{
    public static void main(String args[]){
    Student.clg();
    Student s1 = new Student(1,"Anu");
    Student s2 = new Student(2,"Binu");
    Student s3 = new Student(3,"Dinu");
    Student s4 = new Student(4,"Minu");
    Student s5 = new Student(5,"Sinu");
    //calling display method
    s1.display();
    s2.display();
    s3.display();
    s4.display();
    s5.display();
    }
}
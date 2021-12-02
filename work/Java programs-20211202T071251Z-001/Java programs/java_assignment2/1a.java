class A{  
A(){  
System.out.println("parent class");  
}  
}  
public class B2 extends A{  
String name;
B2(){
    System.out.println("Child class");
}
B2(String name){  
     this.name=name;
}  

{System.out.println("Hai");}  
 void display(){
  System.out.println(name);
 } 
public static void main(String args[]){  
B2 b=new B2(); 
B2 b1=new B2("anu");
b1.display();
}  
}  
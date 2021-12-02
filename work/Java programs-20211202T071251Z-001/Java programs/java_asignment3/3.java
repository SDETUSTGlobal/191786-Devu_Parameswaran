
abstract class One{  
   One(){System.out.println("One constructor is created");}  
   abstract void show();
   String s="Hello";
   void hello(){System.out.println(s);}  
   
   class Two{
       void show2(){
           System.out.println("show2");
       }
   }
 }  

 class Three extends One{  
 void show(){System.out.println("showing.");}  
 
 }  

 public class Abstract{  
 public static void main(String args[]){  
  One obj = new Three();  
  obj.show();  
  obj.hello();  
  One.Two t= obj.new Two();
  t.show2();

 }  
}
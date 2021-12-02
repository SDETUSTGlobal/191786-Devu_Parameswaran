public class Addition 
{ 
   void sum(int a, int b) 
   { 
     int s = a + b; 
     System.out.println("Sum of two numbers: " +s); 
   } 

   void sum(int a, int b, int c) 
   { 
     int t = a + b + c; 
     System.out.println("Sum of three numbers: " +t); 
   } 
   
   void sum(int a, int b,int c,int d){
       int k =a+b+c+d;
       System.out.println("Sum of three numbers: " +k); 
       
   }
public static void main(String[] args) 
{ 
   Addition a = new Addition(); 
    a.sum(10, 20); 
    a.sum(50, 100, 200);
    a.sum(3,6,7,9);
  } 
 }
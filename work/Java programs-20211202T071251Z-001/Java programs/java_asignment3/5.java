 public class Oper extends Exception{  
 int data=50,data2=30;

 static int c=0;
 public Oper(String s)
 {
    super(s);
 }
  
  
 void change(Oper op){  
 op.data=op.data+100;
 }  
     void change1(int data){  
 data2=data2+100;
 }  
static void rec() throws Oper{    
         
            
       c++;
        if(c>5)
           {throw new Oper("c is greater than 5");  } 
       else
        {System.out.println(c);  }
        
         rec();
        }
    
 public static void main(String args[])
 throws ClassNotFoundException
    {
 try {
           
           Class temp=Class.forName("Oper");
           int b=120; 
Integer j=Integer.valueOf(b);

System.out.println(b+" "+j);  
            }
        catch (ClassNotFoundException e) {
           
            System.out.println(
                "Class does not exist check the name of the class");
        }
     
   Oper op=new Oper("c is less than 5");  
 
   System.out.println("before change "+op.data);  
   op.change(op);
   System.out.println("after change "+op.data);  
   System.out.println("before change "+op.data2);  
   op.change1(50);  
   System.out.println("after change "+op.data2);  
    
   int a[]={3,13,4,25};
for(int i=0;i<a.length;i++)
System.out.println(a[i]);  
try{
System.out.println(a[2]/0);
}catch(ArithmeticException e){System.out.println(e);}  
    
 try{
rec();
}
catch( Oper ex)  
        {  
            System.out.println("Caught the exception");  
     System.out.println("Exception occured: " + ex);  
        }  

   
  
 }  
}  
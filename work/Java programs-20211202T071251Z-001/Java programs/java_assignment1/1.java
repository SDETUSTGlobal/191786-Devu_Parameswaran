public class Const
{
String w,p,q,y;
int a1=10,a2=20,r1,sum,i,o,l,r;
 Const()
 {
 r1=a1*a2;
 }
 
 Const(int j)
 {
 o=a2-j;
 }

Const(int a, int b, int c,String w)
 {
 p=w;
 sum=a+b+c;
 
 }
Const(int d,String l)
 {
 y=l;
 r=d/a1;
 }
void addition()
{

System.out.println(p+" "+sum);
}  
void subtraction()
  {
 
  System.out.println("Difference is :"+o);
  }  
void multiplication()
  {
  System.out.println("Product is :"+r1);
  }  
void division()
  {
  System.out.println(y+" "+r);
  }  
   
    public static void main(String args[]){  
    Const s1 = new Const();  
    Const s2 = new Const(15);  
    Const s3 = new Const(30,"Quoient is:");  
    Const s4 = new Const(21,3,14,"sum is:");  

    s1.multiplication();  
    s2.subtraction();  
    s3.division();  
    s4.addition();  
   }  

}
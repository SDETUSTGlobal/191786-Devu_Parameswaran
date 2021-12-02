class A
{
    final int a=10;
   public void methodA()
   {
      System.out.println(" Class A");
       System.out.println(a);
   }
}
class B extends A
{
    static int c;
   final public void methodB()
   {
      System.out.println("Class B");
   }
   static public void smethod(int d)
   {
       c=d;
       System.out.println(c);
   }
}
final class C extends A
{
  public void methodC()
  {
     System.out.println("Class C");
  }
 
}

public class Hierarchial
{
  public static void main(String args[])
  {   B.smethod(5);
     B obj1 = new B();
     C obj2 = new C();
     obj1.methodA();
      obj2.methodA();
  }
}
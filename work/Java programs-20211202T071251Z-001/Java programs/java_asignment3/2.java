interface Eat {
   void eat();
   static int age(int x){
      return x;
       
   }  
}
interface Food extends Eat{
    void nonveg();
}
interface Travel {
   void travel();
   default void msg(){System.out.println("default method");}  
}
public class Animal implements Eat,Travel {
   public void eat() {
      System.out.println("Animal is eating");
   }
      public void nonveg() {
      System.out.println("Non veg animal");
   }
   public void travel() {
      System.out.println("Animal is travelling");
   }


   public static void main(String args[]) {
      Animal a = new Animal();
      a.eat();
      a.travel();
      a.nonveg();
      a.msg();
     System.out.println(Eat.age(23));  
   }
}
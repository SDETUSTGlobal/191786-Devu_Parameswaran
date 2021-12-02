abstract class Animal{
 abstract void sound();
}
public class Dog extends Animal{

   void sound(){
	System.out.println("Barking");
   }
   public static void main(String args[]){
	Animal obj = new Dog();
	obj.sound();
   }
}
class Vehicle{
void engine(){

System.out.println("this is vehicle engine");

}

}

 

 class Bike extends Vehicle{
void engine(){

System.out.println ("this is bike engine");

}

}


 class Car extends Vehicle{
void engine(){

System.out.println ("this is car engine");

}
}
class Bus extends Vehicle{

void engine(){

System.out.println ("this is bus engine");

}
}

public class Overriding{

public static void main(String[] arg) {

Bike honda = new Bike ();

honda.engine();

Car benz = new Car ();

benz.engine (); 

Bus volvo = new Bus();
volvo.engine();

}

}
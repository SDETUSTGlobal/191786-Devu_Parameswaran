class School{
    void learn(){
        System.out.println("Study");
    }
}
public class Stud extends School{
    void learn(){
        System.out.println("Studying English");
    }
    public static void main(String args[]){
        School i= new Stud();
        i.learn();
        Stud j=new Stud();
        System.out.println(j instanceof School);
    }
}
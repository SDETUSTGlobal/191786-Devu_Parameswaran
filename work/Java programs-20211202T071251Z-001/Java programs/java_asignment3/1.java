class Parent {
    private int data=8;  
    private void msgpvt(){
        System.out.println("Hello Private");
        
    }  
    protected void display() {
        System.out.println("Hello Protected");
        msgpvt();
        System.out.println("Private data value="+ data);
    }
    void msg1(){System.out.println("Hello Default");}  
    public void msg2(){System.out.println("Hello Public");}  
}

public class Child extends Parent {
    public static void main(String[] args) {

  
       Child c = new Child();
       c.display();
       c.msg1();
       c.msg2();
       
       
    }
}
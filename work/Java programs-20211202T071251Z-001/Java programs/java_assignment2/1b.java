class A {
    int a=10;
}

class B extends A {
    int a;
    void print(){
                System.out.println(super.a);
    }
    void msg() {    
        System.out.println("B is called here");
    }
 
    B(){
        System.out.println(" B Constructor");
    }

}

public class C extends B {

    void msg() {
        super.msg();
        System.out.println("C is called here");
       }
    C(){  super();
          System.out.println(" C Constructor");
    }
    public static void main(String args[]) {
        C cc = new C();
        cc.msg();
        cc.print();
  
    }
}  
public class Sample{
    

    void print(int a,double b){
       
        System.out.println(a);
        System.out.println(b);
        
    }
    void print(String s){
        for(int i=0;i<5;i++){
            System.out.println(s);
        }
    }
    public static void main(String args[])
    {
        Sample c=new Sample();
       
        c.print("hai");
         c.print(2,3.8);
    }
}
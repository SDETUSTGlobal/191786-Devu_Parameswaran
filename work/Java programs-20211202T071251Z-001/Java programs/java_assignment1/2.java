public class Method
{
    int cal(int a)
    {   int total=100;
        return (a/total)*100;
    }
    int cal(int a, int b,int c,int d,int e)
    {
        return (a+b+c+d+e)/5;
    }
    int cal(int a, int b, int c, int d)
    {
        return (a+b+c+d)/2;
    }
  int cal(int a, int b, int c)
    {
        if (a >= b && a >= c)
        return a;
        else if (b >= a && b >= c)
        return b;
        else
        return c;
        
    }
    int cal(int a, int b)
    {
        if(a<=b)
        return a;
        else 
        return b;
         
    }
    public static void main(String[] args) 
    {   
    	Method obj = new Method();
    
        System.out.println("Percentage: "+obj.cal(800));
   
        System.out.println("Average: "+obj.cal(100, 20,30,40,50));
   
        System.out.println("Median: "+obj.cal(1,  2, 3, 4));
      System.out.println("Maximum: "+obj.cal(10,  20, 30));
      System.out.println("Minimum: "+obj.cal(10, 20));
    }
}
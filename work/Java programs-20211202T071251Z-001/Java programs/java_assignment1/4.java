public class JavaSwitch 
{
    public static void main(String[] args)
    {
        String str = "e";
        switch(str)
        {
            case "a":System.out.println("Odd Nos from 1 to 100");
                    for(int i=1;i<=100;i++)
                    {
                    if(i%2!=0)
                    System.out.println(i);
                     }
                    break;
            case "b":System.out.println("Even Nos from 1 to 100");
                    for(int i=1;i<=100;i++){
                    if(i%2==0)
                    System.out.println(i);
                    }
                     break;
            case "c":int n=9,s;
                System.out.println("Check No is a perfect square:");
                s=(int)Math.sqrt(n);
                if(s*s==n)
                System.out.println(n+ " is perfect Square");
                else
                System.out.println(n+ "is not Perfect Square");
                break;
            case "d":System.out.println(" Nos is +ve or not");
                    int num=-2;
                    if(num>=0)
                    System.out.println(num +"is positive");
                    else
                    System.out.println(num +"is negative");
                    break;
            case "e":System.out.println("Largest among 3 nos ");
                    int n1=12,n2=9,n3=3;
                    if(n1>n2 && n1>n3 )
                    System.out.println("Largest:"+ n1);
                    else if(n2>n1 && n2>n3)
                    System.out.println("Largest:"+ n2);
                    else
                    System.out.println("Largest:"+ n3);
                     break;
            case "f":System.out.println("Reverse");
                     int no=143,res=0,rem;
                     while(no!=0){
                         rem=no%10;
                         res=res*10+rem;
                         no=no/10;
                     }
                     System.out.println("Reverse is:" + res);
                     break;
            default:
                System.out.println("no match");
        }
    }
}
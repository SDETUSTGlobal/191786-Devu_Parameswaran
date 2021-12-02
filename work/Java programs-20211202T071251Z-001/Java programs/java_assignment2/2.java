class Application
{
int findsquare(int n)
{
return n*n;
}
}
public class Square
{
int area_of_square(int side)
{
 Application app=new Application();
  int area=app.findsquare(side);//code reusability (i.e. delegates the method call)
  return area;
}
public static void main(String args[]){
int a[]={10,11,2};
Square sq=new Square();
int result=sq.area_of_square(a[0]);
System.out.println(result);
}
}
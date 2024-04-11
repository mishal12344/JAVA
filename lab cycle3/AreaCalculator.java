import java.util.Scanner;
public class AreaCalculator
{
void calculateArea(float x)
{
System.out.println("Area of the squre:"+x*x+" sq units");
}
void calculateArea(float x,float y)
{
System.out.println("Area of the rectangle:"+x*y+" sq units");
}

void calculateArea(double r)
{
double area=3.14 *r*r;
System.out.println("Area of the circle:"+ area +" sq units");
}
public static void main( String args[])
{
Scanner Scanner = new Scanner(System.in);
AreaCalculator obj =new AreaCalculator();
System.out.println("Thasni noufal\n 06-04-2024\n q10:area of different shapes using overloaded function");
System.out.println("Enter the dimensions:");
System.out.print("Enter side length of the square:");
float side=Scanner.nextFloat();
obj.calculateArea(side);
System.out.print("Enter length of the rectangle:");
float length=Scanner.nextFloat();
System.out.print("Enter width of the rectangle:");
float width=Scanner.nextFloat();
obj.calculateArea(length,width);

System.out.print("Enter radius of the circle:");
double radius=Scanner.nextDouble();
obj.calculateArea(radius);
Scanner.close();
}
}



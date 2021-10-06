import java.io.*;
import java.util.Scanner;
class Shapes
{
int r,l,b,perim,cir;
Scanner sc= new Scanner(System.in);
public void Shapes(int a)
{
 System.out.println("enter the side:");
 a= sc.nextInt();
 perim= 4*a;
 System.out.println("perimeter of square :" +perim);

}

public void Shapes(int l,int b)
{
 System.out.println("Enter the length:");
 l=sc.nextInt();
 System.out.println("Enter the breadth:");
 b=sc.nextInt();
 perim=(2*(l+b));
 System.out.println("perimeter of rectangle:" +perim);
 }
 }
 public class test
 {
public static void main(String args[]) throws IOException
{
  int a,l,b;
  Shapes s= new Shapes();
  s.Shapes(10);
  s.Shapes(10,20);
}
}

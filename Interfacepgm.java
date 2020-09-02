package labexe6;

import java.util.Scanner;
/**
 *
 */
public class interfacepgm {
    public static void main(String[] args)
    {
        rectangle r=new rectangle();
        System.out.println(r.area(10,5));
        System.out.println(r.perimeter(10,5));
        r.resize(5,5);
        
        circle c=new circle();
        System.out.println(c.area());
        System.out.println(c.perimeter());
        c.resize(10,10);
    }
}
interface resizeable
{
    void resize(int x1,int x2);
}
class rectangle implements resizeable
{
    @Override
    
    public void resize(int x1,int x2)
    {
     Scanner obj=new Scanner(System.in);
     System.out.println("Enter the values:");
     int l =obj.nextInt();
     int b =obj.nextInt() ;
     int a=((l+x1)*(b+x2));
     int c=(2*(l+x1))+(2*(b+x2));
     System.out.println("Area:"+a+"Perimeter:"+c);
 
    }
    public int area(int l,int b)
    {
        System.out.println("RECTANGLE'S AREA:");
        int a=l*b;
        return a;
    }
    public int perimeter(int l,int b)
    {
        System.out.println("RECTANGLE'S PERIMETER:");
        int c=(2*l)+(2*b);
        return c;
    }
  
}
class circle implements resizeable 
{
   
    @Override
    public void resize(int x1,int x2)
    {
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter the values:");
    double pi =obj.nextDouble();
    double r =obj.nextDouble();
    double a=(double)(pi*r*r)+x1;
    double c=(double)(2*pi*r)+x2;
    System.out.println("Resized Area:"+a+"Resized Perimeter:"+c); 
    }
      public double area()
    {
        Scanner obj =new Scanner(System.in); 
        System.out.println("Circle's area:");
        System.out.println("Enter the values:");
        double pi=obj.nextDouble();
        double r=obj.nextDouble();
        double a=pi*r*r;
        return a;
    }
    public double perimeter()
    {
       Scanner obj =new Scanner(System.in); 
       System.out.println("Rectangle's area:");
       System.out.println("Enter the values:");
       double pi=obj.nextDouble();
       double r=obj.nextDouble();
       double a=2*pi*r;
       return a;
    }  
}
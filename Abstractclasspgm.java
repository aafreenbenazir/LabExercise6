package labexe6;

import java.util.Scanner;

public class abstractclasspgm {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the value of b");
        int b=obj.nextInt();
        {
            switch(b)
            {
                case 1:
                {
                    System.out.println("Enter the value of n");
                    int n=obj.nextInt();
                    for(int i=0;i<n;i++)
                    {
                      transportVehicles t= new transportVehicles();
                      System.out.println(t);
                    } 
                    break;
                }
                case 2:
                {
                    System.out.println("Enter the value of n");
                    int n=obj.nextInt();
                    for(int i=0;i<n;i++)
                    {
                      privateVehicle t=new privateVehicle();
                      System.out.println(t);  
                    } 
                    break;
                }
                default:
                {
                    System.out.println("Enter only between 1 and 2");
                    break;
                }
            }
        }
       
    }
    
}
abstract class car
{
    String regno;
    String model;
    String regdate;
    car()
    {
        Scanner obj=new Scanner(System.in);
        regno=obj.next();
        model=obj.next();
        regdate=obj.next();
    }
}
class transportVehicles extends car
{
    String validityno;
    String startdate;
    String period;
    transportVehicles()
    {
        super();
        Scanner obj=new Scanner(System.in);
        validityno=obj.next();
        startdate=obj.next();
        period=obj.next();
    }
    @Override
    public String toString()
    {
       return "\nREGISTER NUMBER:"+regno+"\nMODEL:"+model+"\nREGISTER DATE:"+regdate+"\nVALIDITY NUMBER:"+validityno+"\nSTART DATE:"+startdate+"\nPERIOD:"+period;
    }
}
class privateVehicle extends car
{
    String ownername;
    String owneraddress;
    privateVehicle()
    {
        super();
        Scanner obj=new Scanner(System.in);
        ownername=obj.next();
        owneraddress=obj.next();
    }
    @Override
    public String toString()
    {
       return "\nREGISTER NUMBER:"+regno+"\nMODEL:"+model+"\nREGISTER DATE:"+regdate+"\nOWNER NAME:"+ownername+"\nOWNER ADDRESS:"+owneraddress;
    }
}
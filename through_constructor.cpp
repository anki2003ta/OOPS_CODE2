/*Write a java program to create a class named “vehicle” having protected class variables Licence_number, speed, color, owner_name, and a method “showdata()” to show the above details. Inherit the vehicle class and create two subclasses named “Bus” and “Car” having individual private instance variable route_no in “Bus” and manufacturer_name in “Car” and both of them having “showdata()” method showing all details of bus and car respectively with content of the super class’s “showdata()” method. Set the values of the variables 1) through constructor .*/
import java.util.Scanner;
class vehicle
{
    protected int Licence_number;
    protected int speed;
    protected String color;
    protected String owner_name;
    public vehicle()
    {
        System.out.println("vehicle constructor called");
    }
    public vehicle(int l,int s,String c,String o)
    {
        Licence_number=l;
        speed=s;
        color=c;
        owner_name=o;
    }
    public void setdata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Licence_number:");
        Licence_number=sc.nextInt();
        System.out.println("Enter Speed:");
        speed=sc.nextInt();
        System.out.println("Enter Color:");
        color=sc.next();
        System.out.println("Owner_name:");
        owner_name=sc.next();
    }
    public void showdata()
    {
        System.out.println("Licence_number:"+Licence_number);
        System.out.println("Speed:"+speed);
        System.out.println("Color:"+color);
        System.out.println("Owner_name:"+owner_name);
    }
}
class Bus extends vehicle
{
    private int route_no;
    public Bus()
    {
        super();
        System.out.println("Bus constructor called");
    }
    public Bus(int l,int s,String c,String o,int r)
    {
        super(l,s,c,o);
        route_no=r;
    }
    public void setdata()
    {
        Scanner sc=new Scanner(System.in);
        super.setdata();
        System.out.println("Enter Route_no:");
        route_no=sc.nextInt();
    }
    public void showdata()
    {
        super.showdata();
        System.out.println("Route_no:"+route_no);
    }
}
class Car extends vehicle
{
    private String manufacture_name;
    public Car()
    {
        super();
        System.out.println("Car constructor called");
    }
    public Car(int l,int s,String c,String o,String m)
    {
        super(l,s,c,o);
        manufacture_name=m;
    }
    public void setdata()
    {
        Scanner sc=new Scanner(System.in);
        super.setdata();
        System.out.println("Enter Manufacture_name:");
        manufacture_name=sc.nextLine();
    }
    public void showdata()
    {
        super.showdata();
        System.out.println("Manufacture_name:"+manufacture_name);
    }
}
public class Test
{
    public static void main(String[] args)
    {
        Bus b=new Bus(123,23,"Red","Ankita",9);
        //b.setdata();
        b.showdata();
        Car c=new Car(13,3,"Pink","Arpita","Ankita");
        //c.setdata();
        c.showdata();
    }
}

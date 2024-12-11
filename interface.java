/*Create an interface “Department” containing attributes depName and depHead. It also has abstract methods for getting data and printing the attributes. Create a class “Hostel” containing attributes hostelName, hostelLocation and noOfRooms. The class contains methods for getting and printing the attributes. Then write “Student” class extending “Hostel” class and implementing “Department” interface. This class contains attributes studentName, regNo, electiveSubject and avgMarks. Write suitable getdata and printdata methods for this class. Also implement the abstract methods of the “Department” interface. Write a driver class to test the “Student” class. Print all the details of the student including depName and depHead.*/
import java.util.Scanner;
interface Department
{
    String depName="CSE";//public,static and final
    String depHead="SM";
    void getData();//public,abstract
    void printData();
}
class Hostel
{
    String hostelName;
    String hostelLocation;
    String noOfRooms;
    public void getData()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the hostelName:");
        hostelName=sc.next();
        System.out.println("Enter the hostelLocation:");
        hostelLocation=sc.next();
        System.out.println("Enter the noOfRooms:");
        noOfRooms=sc.next();
    }
    public void printData()
    {
        System.out.println("The hostelName:"+hostelName);
        System.out.println("The hostelLocation:"+hostelLocation);
        System.out.println("The noOfRooms:"+noOfRooms);
    }
}
class Student extends Hostel implements Department
{
    String studentName;
    int regNo;
    String electiveSubject;
    int avgMarks;
    public void getData()
    {
        super.getData();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the StudentName:");
        studentName=sc.next();
        System.out.println("Enter the regNo:");
        regNo=sc.nextInt();
        System.out.println("Enter the electiveSubject:");
        electiveSubject=sc.next();
        System.out.println("Enter the avgMarks:");
        avgMarks=sc.nextInt();
    }
    public void printData()
    {
        super.printData();
        System.out.println("Department Name:"+depName);
        System.out.println("Department Head:"+depHead);
        System.out.println("The StudentName:"+studentName);
        System.out.println("The regNo:"+regNo);
        System.out.println("The electiveSubject:"+electiveSubject);
        System.out.println("The avgMarks:"+avgMarks);
    }
    public void print()
    {
        System.out.println("Hello from Student class.");
    }
}
public class Test
{
    public static void main(String[] args)
    {
        Student s=new Student();
        s.getData();
        s.printData();
        s.print();
        Department d=new Student();
        d.getData();
        d.printData();
        //d.print();not allowed
    }
}

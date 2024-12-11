/*Class PersonDetails has methods to accept and show the date of birth of a person. Inner class ageCalculator calculates the age of a person based on the above inputs. Implement the mentioned scenario in a Java program in the following 2 different ways - a. static inner class . Also show how you can create objects of the inner class in the main method.*/
import java.util.Scanner;
class PersonDetails
{
    int d;
    int m;
    int y;
    static int date;
    public void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Date:");
        d=sc.nextInt();
        System.out.println("Enter the Month:");
        m=sc.nextInt();
        System.out.println("Enter the Year:");
        y=sc.nextInt();
        date=y;
    }
    public void show()
    {
        System.out.println("The Date:"+d);
        System.out.println("The Month:"+m);
        System.out.println("The Year:"+y);
        System.out.println("The date of birth:"+y+"-"+m+"-"+d);
    }

    public static class ageCalculator
    {
        public void agecalculate()
        {
            final int current=2024;
            System.out.println("Current date:"+current);
            int calculate_age=current-date;
            System.out.println("Age:"+calculate_age);
        }
    }
}
public class static_class
{
    public static void main(String[] args)
    {
        PersonDetails obj1=new PersonDetails();
        PersonDetails obj2=new PersonDetails();
        obj1.accept();
        obj1.show();
        PersonDetails.ageCalculator obj=new PersonDetails.ageCalculator();
        obj.agecalculate();
        obj1.date++;
        System.out.println(obj2.date);
        obj2.date+=5;
        System.out.println(obj1.date);
        System.out.println(obj2.date);
        System.out.println(PersonDetails. date);
    }
}

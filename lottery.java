/*Write a Java program to play lottery. The program randomly generates a lottery of a 2-digit number, prompts
the user to enter a two-digit number and determines whether the user wins according to the following rule:
  If the user input matches the lottery in exact order, the award is Rs.10000.
  If the user input matches the lottery, the award is Rs.3000
  If one digit in the user input matches a digit in the lottery, the award is Rs. 1000.4.*/
import java.util.Random;
import java.util.Scanner;
public class lottery
{
    public static void main(String[] args)
    {
        System.out.println("Enter a 2-Digit Number:");
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        int r=rand.nextInt(90)+10;
        System.out.println(r);
        int a=sc.nextInt();
        
        //int r=rand.nextInt(90)+10;
        //System.out.println(r);
        int award=0;
        if(a==r)
        {
            award=10000;
        }
            
        else if((a/10==r/10||a/10==r%10)&&(a%10==r/10||a%10==r%10))
        {
            award=3000;
            System.out.println(a%10+r%10);
        }
        else if(a/10==r/10||a/10==r%10||a%10==r/10||a%10==r%10)
        {
            award=1000;
        }
        System.out.println("Award:"+award);
    }
}

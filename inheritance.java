/*Write a program to create an Account class containing acc_no, balance as data members and disp() to display the details. Inherit it in Person class with all mentioned data members and functions. Person class also has name and aadhar_no as extra data members of its own. Override disp() function. Create 5 persons’ details.*/
class Account
{
    String acc_no;
    double balance;
    public Account(String a,double b)
    {
        acc_no=a;
        balance=b;
    }
    void disp()
    {
        System.out.println("Account Number:"+acc_no);
        System.out.println("Balance:"+balance);
    }
}
class Person extends Account
{
    String addhar_no;
    String name;
    public Person(String a,double b,String ad,String n)
    {
        super(a,b);
        addhar_no=ad;
        name=n;
    }
    void disp()
    {
        super.disp();
        System.out.println("Addhar Number:"+addhar_no);
        System.out.println("Name:"+name);
    }
}
public class inheritance
{
    public static void main(String[] args)
    {
        Person obj1=new Person("1237-4569-8890-7889",5000.0,"1233 4566 4778 7889","Ankita");
        obj1.disp();
        Person obj2=new Person("1237-4569-8220-7889",9000.0,"1233 4466 4798 7889","Gita");
        obj2.disp();
        Person obj3=new Person("1237-1169-8890-7889",2000.0,"1233 4966 4778 7889","Raju");
        obj3.disp();
        Person obj4=new Person("1237-1169-8890-7889",9000.0,"9933 4566 4778 7889","Rita");
        obj4.disp();
        Person obj5=new Person("1237-4569-9890-7889",99000.0,"1933 4566 4778 7889","Arpita");
        obj5.disp();
        
    }
}

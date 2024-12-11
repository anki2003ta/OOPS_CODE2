/*variable argument*/
public class variable_argument
{
    static int func(int ...v)
    {
        int sum=0;
        for(int n:v)
        {
            sum=sum+n;
        }
        return sum;
    }
    public static void main(String[] args)
    {
        System.out.println("func(1,2,3)"+func(1,2,3));
        System.out.println("func(1,2)"+func(1,2));
        System.out.println("func(1,2,3,4,5)"+func(1,2,3,4,5));
    }
}

package recursion.basic;

public class SumOfDigits
{
    public static void main(String[] args)
    {
        System.out.println(sumOfDigits(123));
    }

    private static int sumOfDigits(int n)
    {
        if(n < 10)
        {
            return n;
        }
        return (n%10) + sumOfDigits(n/10);
    }
}

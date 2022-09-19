package recursion.tailRecursion;

public class Factorial
{
    /*
    This is a tail recursive code since
    last line of execution is recursion
     */
    public static long fact(int n,int k)
    {
        if(n == 0 || n == 1)
        {
            return k;
        }
        k *= n;
        return fact(n-1,k);
    }

    public static void main(String[] args)
    {
        System.out.println(fact(4,1));
    }
}
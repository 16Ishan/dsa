package recursion.tailRecursion;

/*
S(n) = Theta(n+1)
T(n) = T(n-1) + Theta(1)
 */

public class Print1toN
{
    /*
    This is not a tail recursive code since
    last line of execution is not recursion
     */
    public static void print(int n)
    {
        if(n == 0)
        {
            return;
        }
        print(n-1);
        System.out.print(n+" ");
    }

    /*
    This is a tail recursive code since
    last line of execution is recursion
     */
    public static void print(int n,int k)
    {
        if(n == 0)
        {
            return;
        }
        System.out.print(k+" ");
        print(n-1, k+1);
    }

    public static void main(String[] args)
    {
        print(5);
        System.out.println();
        print(5,1);
    }
}
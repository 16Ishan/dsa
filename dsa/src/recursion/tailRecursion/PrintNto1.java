package recursion.tailRecursion;

/*
S(n) = Theta(n+1)
T(n) = T(n-1) + Theta(1)
 */

public class PrintNto1
{
    /*
    This is a tail recursive code since last line of execution
    is recursion
     */
    public static void print(int n)
    {
        if(n == 0)
        {
            return;
        }
        System.out.print(n+" ");
        print(n-1);
    }
    public static void main(String[] args)
    {
        print(5);
    }
}
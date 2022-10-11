package recursion.basic;

public class PalindromeString
{
    public static void main(String[] args)
    {
        System.out.println(isPalindrome("abba",0,3));
    }

    private static boolean isPalindrome(String s, int start, int end)
    {
        if(start>=end)
        {
            return true;
        }
        return (s.charAt(start) == (s.charAt(end))) &&
                isPalindrome(s,start + 1,end-1);
    }
}

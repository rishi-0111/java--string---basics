
import java.util.*;

class PalindromeString{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        StringBuilder sb = new StringBuilder(s);

        String rev = sb.reverse().toString();

        if(s.equals(rev)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
---------------------------------------------------------------------------------------------------
    import java.util.*;
class Example
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int left=0;
        int n=s.length();
        boolean p=true;
        int right=n-1;
        while(left<right)
        {
            if(s.charAt(left)!=s.charAt(right))
            {
                p=false;
            }
            left++;
            right--;
        }
        if(p)
        {
            System.out.print("Palindrome");
        }
        else{
            System.out.print("Not Palindrome");
        }
        
    }
}

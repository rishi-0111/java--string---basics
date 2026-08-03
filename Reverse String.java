



 1️⃣ Reverse String


import java.util.*;

class ReverseString{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        StringBuilder sb = new StringBuilder(s);

        System.out.println(sb.reverse().toString());
    }
}
-----------------------------
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

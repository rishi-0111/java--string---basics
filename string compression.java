import java.util.*;
class Example
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char [] a=s.toCharArray();
        String output="";
        int count=1;
        for(int i=0;i<a.length;i++)
        {
            if((i+1)<a.length&&a[i]==a[i+1])
            {
                count++;
            }
            else{
                output=output+a[i]+count;
                count=1;
            }
        }
        System.out.print(output);
    }
}
--------------------------------------------------------
  /*
  Sample Input
rriiisshhhhii

Your Output
r2i3s2h4i2
  */

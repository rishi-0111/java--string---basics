
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

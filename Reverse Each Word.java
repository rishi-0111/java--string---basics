
import java.util.*;

class ReverseEachWord{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        String[] words = s.split(" ");

        for(int i=0;i<words.length;i++){

            StringBuilder sb = new StringBuilder(words[i]);

            System.out.print(sb.reverse().toString()+" ");
        }
    }
}

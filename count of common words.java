import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] s1 = sc.nextLine().split("\\s+");
        String[] s2 = sc.nextLine().split("\\s+");

        Set<String> set = new HashSet<>();

        int count = 0;

        for (int i = 0; i < s1.length; i++) {
            set.add(s1[i]);
        }

        for (int i = 0; i < s2.length; i++) {
            if (set.contains(s2[i])) {
                count++;
                set.remove(s2[i]);
            }
        }

        System.out.println(count);
    }
}
------------------------------------------------
/*Input Format:
The first line contains the string S1.
The second line contains the string S2.

Output Format:
The first line contains the count of common words in the string values S1 and S2.

Example Input/Output 1:
Input:
hi how are you
are you fine

Output:
2

Explanation:
The common words are "are" and "you".
Here the count of common words is 2.
Hence the output is 2

Example Input/Output 2:
Input:
aabcd isdfk mxcv s hwncs pqts
hwncs tky ogdfo pqts erlp s bdr hwncs dufkna bevfz

Output:
3
*/

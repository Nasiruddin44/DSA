/* 
package BackTracking;

public class Program2 {

    public static void findSubsets(String str, int i, String ans) {
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
            return;
        }
        findSubsets(str, i + 1, ans);
        findSubsets(str, i + 1, ans + str.charAt(i));
    }

    public static void main(String[] args) {
        String str = "abc";
        findSubsets(str, "", 0);
    }
}

*/
public class Program2 {
    public static void findSubsets(String str, int i, String ans) {

        // base case
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
            return;
        }
        findSubsets(str, i + 1, ans);
        findSubsets(str, i + 1, ans + str.charAt(i));

    }

    public static void main(String[] args) {

    }
}
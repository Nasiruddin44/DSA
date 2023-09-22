/*
Dynamic Programming

Dynamic Programming is a technique in  computer programming that helps 
to efficiently solve a class of problems that have overlapping subproblem and optimal substructure property

 
way of DP
1:Memoization(Top Down)
2:Tabulation(Bottom Up)

 */
public class Intro {
    public static int fibTabulation(int n) {
        int dp[] = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];// ans
    }

    public static void main(String[] args) {
        int n = 5;
        int f[] = new int[n + 1];
        System.out.println(fibTabulation(n));
    }
}

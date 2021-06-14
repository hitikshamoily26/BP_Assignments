import java.util.*;
class Solution {
    public boolean isMatch(String s, String p) {
        char[] str = s.toCharArray();
        char[] pattern = p.toCharArray();
        int m = str.length;
        int n = pattern.length;
        boolean dp[][] = new boolean[m + 1][n + 1];
        dp[0][0] = true;
        for (int i = 1; i <= n; i++) {
            if (pattern[i - 1] == '*') {
                dp[0][i] = dp[0][i - 1];
            }
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (str[i - 1] == pattern[j - 1] || pattern[j - 1] == '?') {
                    dp[i][j] = dp[i - 1][j - 1];
                }
                if (pattern[j - 1] == '*') {
                    dp[i][j] = dp[i - 1][j] || dp[i][j - 1] || dp[i - 1][j - 1];
                }
            }
        }
        return dp[m][n];
    }
}
class WildCardPatternMatching{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str = s.next();
        System.out.println("Enter pattern: ");
        String pattern = s.next();
        Solution sol = new Solution();
        boolean b =sol.isMatch(str,pattern);
        System.out.println(b);
    }
}

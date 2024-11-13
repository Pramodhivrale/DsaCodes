package com.recurssion;

// FIND ALL THE VALID PARENTHESES
public class ValidParentheses {

    public static void main(String[] args) {
        int n = 3;
        int index = 0;
        int open = 0;
        int close = 0;
        char[] ch = new char[2 * n];
        solve(n, ch, index, open, close);
    }

    private static void solve(int n, char[] ch, int index, int open, int close) {
        if (index == n * 2) {
            System.out.println(new String(ch)); // Print the valid parentheses combination
            return; // Important to return here to avoid further recursive calls
        }
        
        if (open < n) {
            ch[index] = '(';
            solve(n, ch, index + 1, open + 1, close);
        }
        
        if (close < open) {
            ch[index] = ')';
            solve(n, ch, index + 1, open, close + 1);
        }
    }
}

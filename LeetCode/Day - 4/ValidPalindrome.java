// https://leetcode.com/problems/valid-palindrome/description/

class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder clean = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = Character.toLowerCase(s.charAt(i));

            if (Character.isLetterOrDigit(ch)) {
                clean.append(ch);
            }
        }

        String original = clean.toString();
        String reversed = clean.reverse().toString();
        return original.equals(reversed);
    }
}
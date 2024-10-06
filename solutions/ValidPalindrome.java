class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder();

        for(char ch: s.toCharArray()) {
            if(Character.isLetterOrDigit(ch)) {
                str.append(Character.toLowerCase(ch));
            }
        }

        String normalStr = str.toString();
        String reverseStr = str.reverse().toString();
        return normalStr.equals(reverseStr);
    }
}
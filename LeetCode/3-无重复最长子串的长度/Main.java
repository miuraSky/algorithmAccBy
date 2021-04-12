import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

    }

    static class Solution {

        public int lengthOfLongestSubstring(String s) {
            if (s == null || s.length() == 0) {
                return 0;
            }

            int maxLength = 0;
            int left = 0;
            HashMap<Character, Integer> winm = new HashMap<>();

            for (int i = 0; i < s.length(); i++) {
                if (winm.containsKey(s.charAt(i))) {
                    left = Math.max(left, winm.get(s.charAt(i)) + 1);
                }

                winm.put(s.charAt(i), i);
                maxLength = Math.max(maxLength, i - left + 1);
            }

            return maxLength;

        }
    }
}


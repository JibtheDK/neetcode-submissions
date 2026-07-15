class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] sFreqs = new int[26];
        int[] tFreqs = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int sCode = s.charAt(i) - 'a';
            int tCode = t.charAt(i) - 'a';
            sFreqs[sCode]++;
            tFreqs[tCode]++;
        }

        for (int i = 0; i < 26; i++) {
            if (sFreqs[i] != tFreqs[i]) {
                return false;
            }
        }

        return true;

    }
}

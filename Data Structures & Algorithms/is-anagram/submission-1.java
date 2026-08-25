class Solution {
    public boolean isAnagram(String s, String t) {
        // HashMap<Character, Integer> hms = new HashMap<Character, Integer>();
        // HashMap<Character, Integer> hmt = new HashMap<Character, Integer>();
        int[] scount = new int[26];
        int[] tcount = new int[26];

        if (s.length() != t.length() ) return false;

        for (int i = 0; i < s.length() ; i++){
            scount[s.charAt(i) - 'a'] += 1;
            tcount[t.charAt(i) - 'a'] += 1;
        }

        if (Arrays.equals(scount, tcount)) return true;
        return false;
    }
}

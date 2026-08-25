class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> hm = new HashMap<Character,Integer>(); //store the characters
        int ans = 0;
        int N = s.length();
        int lastRepeatedPosition = 0;
        int i = 0;

        while (i<N ){
            
            char charAtPositionI = s.charAt(i);
            
            if (hm.containsKey(charAtPositionI)){
                //max between last repeated character and the current repeated position 
                lastRepeatedPosition = Math.max(lastRepeatedPosition, hm.get(charAtPositionI) + 1 ); 
            }

            hm.put(charAtPositionI , i);
            ans = Math.max(ans, i - lastRepeatedPosition + 1);  
            i++;
        }
        return ans;
    }
}
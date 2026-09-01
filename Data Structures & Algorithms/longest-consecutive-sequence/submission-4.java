class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs = new HashSet<Integer>();
        int length = 0;
        int ans = 0;
        for (int num : nums){
            hs.add(num);
        }

        for (Integer i : hs){
            if (hs.contains(i-1)){
                continue;
            }
            else {
                length = 1;
                while (hs.contains(i + length)){
                    ans = Math.max(ans, length);
                    length++;
                }
                ans = Math.max(ans, length);
            }
        }

        return ans; 
           
    }
}
class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        int ans = 0;
        int length = 0;

        for(int num : nums){
            hs.add(num);
        }

        for(int num : nums){
            if(hs.contains(num - 1)) continue;
            else{
                length = 1;
                while(hs.contains(num + length)){
                    length++;    
                }
                ans = Math.max(ans, length);
            }
        }

        return ans;
    }
}


class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        int ans = 0;
        int count = 0;
        
        for (int i : nums){
            hs.add(i);
        }
        for(Integer num : hs){
            if(hs.contains(num - 1)){
                continue;
            }
            count = 1;
            while(hs.contains(num + count) ){
                count++;
            }
            ans = Math.max(ans, count);
        }
        return ans;
    }
}


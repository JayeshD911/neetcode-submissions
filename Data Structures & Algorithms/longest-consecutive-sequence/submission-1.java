class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>(); //value, count
        int length = 0;
        int offset = 0;
        int ans = 0;
        for (int num : nums){
            if (hm.containsKey(num)) hm.put(num , hm.get(num) + 1 );
            else hm.put(num, 1);
        }

        for (Integer i : hm.keySet()){
            if (hm.containsKey(i-1)){
                continue;
            }
            else {
                offset = 1;
                while (hm.containsKey(i + offset)){
                    offset = offset + 1;
                    ans = Math.max(ans, offset);
                }
                ans = Math.max(ans, offset);
            }
        }

        return ans;
        
    }
}
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();

        // Step 1: Count frequencies
        for(int i : nums){
            if (hm.containsKey(i)) hm.put(i, hm.get(i)+1);
            else hm.put(i,1);
        }

        // Step 2: Create buckets
        // Index = frequency, value = list of numbers with that frequency
        List<Integer>[] bucket = new List[nums.length + 1];

        //create empty bucket of frequency
        for (int i = 0; i <= nums.length; i++) {
            bucket[i] = new ArrayList<>();
        }

        //fill the bucket 
        for (int num : hm.keySet()){
            int frequency = hm.get(num);
            bucket[frequency].add(num);
        }

        // create answer list
        int count = 0;
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for (int x = nums.length ; x >= 0 && count < k ; x-- ){
            for (int i : bucket[x]) {
                ans.add(i);
                count += 1;
            }
        }

        int[] result = new int[count];

        //convert into int
        for (int y = 0 ; y < count ; y++){
            result[y] = (int) ans.get(y);
        }
        return result;

    }
}

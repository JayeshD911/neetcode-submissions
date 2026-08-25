class Solution {

    public String toFrequencyString(String word){
        int[] count = new int[26];
        for (int i = 0; i < word.length() ; i++){
            count[word.charAt(i) - 'a'] += 1;
        }
        return Arrays.toString(count);
    }


    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> hm = new HashMap<String, ArrayList<String>>();
        String key;

        for (String word : strs){
            key = toFrequencyString(word);
            if (hm.containsKey(key)){
                hm.get(key).add(word);
            }
            else{
                ArrayList<String> temp = new ArrayList<>();
                hm.put(key,temp);
                hm.get(key).add(word);
            }
        }

        return new ArrayList<>(hm.values());
        
    }
}

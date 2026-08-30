class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str : strs){
            char ch = (char)str.length();
            sb.append(ch).append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        ArrayList<String> ans = new ArrayList();
        
        int pointer = 0;
        while(pointer<str.length()){
            int len = (int)str.charAt(pointer);
            pointer++;

            ans.add(str.substring(pointer,pointer+len));

            pointer+=len;
        }
        return ans;
    }
}
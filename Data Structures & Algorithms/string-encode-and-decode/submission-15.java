class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String str : strs){
            sb.append(str.length()).append("*").append(str);
        }
        
        return sb.toString();
    }

    public List<String> decode(String str) {

        List<String> ans = new ArrayList<String>();
        int indexOfDelimiter = 0;
        int i = 0;
        int count = 0;

        while( i <str.length()){
            indexOfDelimiter = str.indexOf('*',i);
            count = Integer.parseInt(str.substring(i, indexOfDelimiter));
            ans.add(str.substring(indexOfDelimiter+1, count + indexOfDelimiter+1 ));
            i = count + indexOfDelimiter+1;
        }
        return ans;

        // while(i < str.length()){

        //     indexOfDelimiter = str.indexOf("*", i);

        //     count = Integer.parseInt(str.substring(i,indexOfDelimiter));

        //     ans.add(str.substring(indexOfDelimiter + 1 , indexOfDelimiter + 1 + count));

        //     i = indexOfDelimiter + count + 1;
        // }
        // return ans;
    }   
}

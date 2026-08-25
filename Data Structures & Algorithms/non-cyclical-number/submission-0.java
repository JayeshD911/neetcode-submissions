class Solution {
    public boolean isHappy(int n) {
        Set<Integer> hs = new HashSet<>();

        while(!hs.contains(n)){
            hs.add(n);
            n = helper(n);
            if (n == 1) return true;
        }
        return false;
    }
    
    public int helper(int a){
        int result = 0;
        while(a > 0){
            int digit = a % 10;
            result = result + (digit * digit) ;
            a = a / 10;
        }
        return result;
    }
}

class Solution {
    public boolean checkValidString(String s) {
        int minC=0, maxC=0;
        for(int i=0;i<s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == '(') {
                minC++; maxC++;
            } else if(ch == ')') {
                minC--; maxC--;
                if(minC < 0) {
                    if(maxC < 0) return false;
                    minC = 0;
                }
            } else {
                maxC++;
                if(minC > 0) minC--;
            }
        }
        return minC == 0;
    }
}

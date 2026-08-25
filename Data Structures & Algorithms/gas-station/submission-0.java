class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {

        int total = 0;
        int currSum = 0;
        int start = 0;
        for (int i = 0 ; i < gas.length ; i++){
            currSum = currSum + gas[i] - cost[i];
            total = total + gas[i] - cost[i];
            if(currSum < 0){
                currSum = 0;
                start = i+1;
            }
        }

        if (total < 0) return -1;

        return start;
    }
}
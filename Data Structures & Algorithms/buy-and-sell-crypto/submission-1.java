class Solution {
    public int maxProfit(int[] prices) {
        int N = prices.length;
        int profit = 0;
        int l = 0;
        int r = 1;
        int latest_min = prices[0];
        int ans = 0;

        // if (N == 0) return 0;

        while (r < N ){
            if(prices[l] > prices[r]){
                latest_min = Math.min(latest_min , prices[r]);
                l = r;
            }
            else if(prices[l] < prices[r]){
                ans = Math.max(ans , prices[r] - latest_min);
            }
            r++;
        }
        return ans;
    }
}

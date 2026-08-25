class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length % groupSize != 0) return false;

        Map<Integer,Integer> hm = new HashMap<>();
        for (int card : hand){
            hm.put(card, hm.getOrDefault(card,0) + 1);
        }

        Arrays.sort(hand);

        for( int card : hand){
            if(hm.get(card) == 0 ) continue;
            
            for(int i = 0 ; i < groupSize ; i++){
                int currCard = card + i;
                if(hm.getOrDefault(currCard, 0 ) == 0) return false;
                hm.put(currCard, hm.get(currCard) - 1);
            }
            
        }
        return true;
    }
}
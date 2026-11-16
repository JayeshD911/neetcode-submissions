class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int N = position.length;
        int ans = 1;

        int[][] position_speed = new int[N][2];

        for(int i = 0; i < N; i++){
            position_speed[i][0] = position[i];
            position_speed[i][1] = speed[i];
        }

        Arrays.sort(position_speed, (a,b) -> a[0] -b[0]);

        double time_taken_by_last_slowest = (double) (target - position_speed[N-1][0] ) / position_speed[N-1][1] ;

        for(int i = N-2; i >= 0; i--){
            double time_taken_by_i = (double) (target - position_speed[i][0] ) / position_speed[i][1];
            
            if (time_taken_by_i > time_taken_by_last_slowest){
                ans++;
                time_taken_by_last_slowest = time_taken_by_i;
            }
        }

        return ans;

































        // int N = position.length;
        // int[][] cars = new int [N][2];

        // for( int i = 0 ; i< N ; i++){
        //     cars[i][0] = position[i];
        //     cars[i][1] = speed[i];
        // }

        // Arrays.sort(cars, (a,b) -> a[0] - b[0]);

        // double time_taken_by_last_slowest = (double)(target - cars[N-1][0]) / cars[N-1][1];
        // int ans = 1;

        // for(int i = N-2 ; i >= 0  ; i--){
        //     double time_to_reach_target =  (double)(target - cars[i][0]) / cars[i][1] ;

        //     if(time_taken_by_last_slowest < time_to_reach_target){
        //         ans++;
        //         time_taken_by_last_slowest = time_to_reach_target;
        //     }

        // }
        // return ans;

        // Deque<Double> stack = new ArrayDeque<>(); //store -> (target - position) / speed

        // for(int i = N-1 ; i >= 0  ; i--){
        //     double time_to_reach_target =  (double)(target - cars[i][0]) / cars[i][1] ;

        //     if(stack.isEmpty() || stack.peek() < time_to_reach_target){
        //         stack.push(time_to_reach_target);
        //     }

        // }

        // return stack.size();
    }
}
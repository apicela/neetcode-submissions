class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        int[][] cars = new int[n][2];
        for(int i =0; i < n; i++){
            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        }
        Arrays.sort(cars, (a, b) -> Integer.compare(b[0], a[0]));
        int fleets = 1;
        double lastTime = timeToTarget(cars[0][0], cars[0][1], target);

        for(int i  = 1; i < n; i++){
            double currTime = timeToTarget(cars[i][0], cars[i][1], target);

            if (currTime > lastTime) {
                fleets++;
                lastTime = currTime;
            }
        }
        return fleets;
    }

    private double timeToTarget(int position, int speed, int target){
        return (double) (target - position) / speed;
    }
}


class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        if (n == 0) return 0;

        int[][] cars = new int[n][2];
        for (int i = 0; i < n; i++) {
            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        }

        // Ordena por posição decrescente (do mais próximo do destino ao mais distante)
        Arrays.sort(cars, (a, b) -> Integer.compare(b[0], a[0]));

        int fleets = 0;
        double lastTime = 0;

        for (int i = 0; i < n; i++) {
            // Declarada como double para evitar o erro de sintaxe
            double currTime = timeToTarget(cars[i][0], cars[i][1], target);
            
            // Se o tempo do carro atual for maior que o tempo da frota da frente,
            // ele não consegue alcançá-la e forma uma nova frota.
            if (currTime > lastTime) {
                fleets++;
                lastTime = currTime;
            }
        }

        return fleets;
    }

    private double timeToTarget(int position, int speed, int target) {
        // Cast para double antes da divisão para manter a precisão decimal
        return (double) (target - position) / speed;
    }
}
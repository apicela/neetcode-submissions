class Solution {
    public List<List<Integer>> generate(int numRows) {
        int[][] matrix = new int[numRows][numRows];
List<List<Integer>> res = new ArrayList<>();
        for (int[] row : matrix) {
            Arrays.fill(row, 1);
        }
        for(int i =0; i < numRows; i++){
            for(int j = 1; j < i; j++){
                // Valida se as posições de 'i' e 'j' estão seguras para i-1 e j-1
                if (i - 1 >= 0 && j - 1 >= 0 && i - 1 < matrix.length && j < matrix[i - 1].length) {
                    // Agora é seguro acessar e fazer a sua lógica
if (matrix[i - 1][j - 1] != 0 && matrix[i - 1][j] != 0) {
                        matrix[i][j]= matrix[i - 1][j - 1] + matrix[i - 1][j];
                    }
                }    
          }
// Converte apenas os elementos válidos da linha atual (de 0 até i) para Lista
            ArrayList<Integer> list = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                list.add(matrix[i][j]);
            }
            res.add(list);
        }
        return res;
    }
}
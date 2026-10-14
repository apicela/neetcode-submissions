class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String, Integer> hMap = new HashMap<>();
        ArrayList<String> distintos = new ArrayList<String>();
        for(int i =0; i < arr.length; i++){
            if(!hMap.containsKey(arr[i])){ 
                hMap.put(arr[i], 1); // Se não existe, começa com 1
            } else {
                hMap.put(arr[i], hMap.get(arr[i]) + 1); // Se existe, soma 1 ao valor atual
            }   
        }
        for(int i =0; i < arr.length; i++){
            if(hMap.get(arr[i]) == 1) distintos.add(arr[i]);
        }   
        System.out.println(hMap);
        int target = k - 1;
        return (k >= 0 && target < distintos.size()) ? distintos.get(target) : "";

    }
}
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
        int min = nums.length/3;
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < nums.length; i++){
            int key = nums[i];
            if (!hmap.containsKey(key)) {
                hmap.put(key, 1);
            } else {
                hmap.put(key, hmap.get(key) + 1);
            }
        }

    for (Map.Entry<Integer, Integer> entry : hmap.entrySet()) {
        int key = entry.getKey();
        int value = entry.getValue();
        
        if (value > min) {
            list.add(key);
            }
        }
    return list;
    }
}
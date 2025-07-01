// Last updated: 7/1/2025, 11:04:15 PM
class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        Map<Integer, Integer> frequencyMap = new HashMap<>(); 
        for(int num : nums){
            frequencyMap.put(num , frequencyMap.getOrDefault(num, 0) + 1); 
        }
        List<List<Integer>> result = new ArrayList<>(); 
            
        while (!frequencyMap.isEmpty()) {
            List<Integer> row = new ArrayList<>();
            
            Iterator<Map.Entry<Integer, Integer>> iterator = frequencyMap.entrySet().iterator();
            
            while (iterator.hasNext()) {
                Map.Entry<Integer, Integer> entry = iterator.next();
                int num = entry.getKey();
                int count = entry.getValue();
                
                row.add(num);
                
                if (count == 1) {
                    iterator.remove();
                } else {
                    entry.setValue(count - 1);
                }
            }
            
            result.add(row);
        }
        
        return result;
    }
}
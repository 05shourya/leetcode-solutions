class Solution {
    public int romanToInt(String s) {
        Map<Character , Integer> romanMap = new HashMap<>(); 
        
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int sum = 0; 

        for(int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i); 
            if(i + 1 < s.length() && romanMap.get(c) < romanMap.get(s.charAt(i + 1))){
                sum += romanMap.get(s.charAt(i + 1)) - romanMap.get(c); 
                i += 1;  
            }else{
                sum += romanMap.get(c); 
            }
        }

        return sum; 
    }
}
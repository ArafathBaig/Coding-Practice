class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        
        Map<String, Integer> ogFreq = new HashMap<>();
        
        for(String k : words)
            ogFreq.put(k,ogFreq.getOrDefault(k,0)+1);
        
        List<Integer> result = new ArrayList<>();
        
        int patternLen = words[0].length() * words.length;
        int wordLen = words[0].length();
        
        // System.out.println(s.length());
        for(int i = 0; i <= s.length()-patternLen ;i++){
            
            Map<String, Integer> tempFreq = new HashMap<>(ogFreq);
            
            // System.out.println(i);
            for(int j = i; j < i+patternLen ;j+=wordLen){
                
                String temp = s.substring(j,j+wordLen);
                // System.out.println(temp);
                if(tempFreq.containsKey(temp)){
                    tempFreq.put(temp, tempFreq.get(temp) - 1);
                    
                    if(tempFreq.get(temp) == 0)
                        tempFreq.remove(temp);
                }else{
                    break;
                }    
                    if(tempFreq.size() == 0 && j == i+patternLen-wordLen)
                        result.add(i);
                
            }
        }
        
        return result;
    }
}
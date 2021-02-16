package RomanToInteger;

class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap();
        map.put('M',1000);
        map.put('D',500);
        map.put('C',100);
        map.put('L',50);
        map.put('X',10);
        map.put('V',5);
        map.put('I',1);

        int temp = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = s.length()-1 ; i >= 0; i--){
            char ch = s.charAt(i);

            if(map.containsKey(ch) && map.get(ch) < temp){
                sum-=map.get(ch);
            }else{
                sum += map.get(ch);
            }
            temp = map.get(ch);
        }
        return sum;
    }
}

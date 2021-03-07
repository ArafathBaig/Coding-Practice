package BeautifulSubarray;

class Solution {
    public int beautySum(String s) {



        int result = 0;

        for(int i = 0; i < s.length(); i++){

            int a[] = new int[26];
            for(int j = i ; j < s.length(); j++){
                char c = s.charAt(j);
                int n = c-'a';
                a[n]++;

                int max =0;
                int min = s.length()+1;
                for(int k = 0 ; k < 26 ;k++){
                    max = Math.max(max, a[k]);

                    if(a[k] == 0)
                        continue;

                    min = Math.min(min, a[k]);
                }

                result+= max- min;
            }
        }

        return result;

    }
}
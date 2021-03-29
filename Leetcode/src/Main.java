import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String a = "aabc";

        int dp[] = new int[27];

        Map<Character, Integer> map = new HashMap<>();

        for(char c : a.toCharArray())
            map.put(c,0);

        int n = map.size();

        for(int i =1 ;i <= n ;i++){
            dp[i] = atMost(a, i) - dp[i-1];
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 26 ; i >= 1; i--){
            dp[i] += dp[i+1];
        }

        for(int i = 1 ; i< 27 ;i++){
            sb.append(dp[i]);
        }

        System.out.println(sb);

    }

    private static int atMost(String s, int k){

        Map<Character, Integer> map = new HashMap<>();

        int j = 0;
        int n = s.length();
        int ans = 0;
        for(int i = 0; i < n ;i++){

            char c = s.charAt(i);

            if(map.containsKey(c))
                map.put(c, 0);

            map.put(c, map.get(c)+1);

            while(j < n && map.size() > k){

                char t = s.charAt(j);
                map.put(t, map.get(j--)-1);

                if(map.get(t) == 0)
                    map.remove(t);
            }

            int f = i-j +1;
            ans += n;
        }

        return 0;
    }
}

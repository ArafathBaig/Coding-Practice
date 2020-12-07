package SmallestWindowSubstring;

// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();

        while(test > 0){
            String s = scan.next();
            String t = scan.next();

            System.out.println(new solve().smallestWindow(s, t));
            test--;
        }
    }
}// } Driver Code Ends


class solve
{
    // return+******** = "-1";
        for(int j = 0; j < m ; j++){
            char c = s.charAt(j);

            if(map.containsKey(c)){
                map.put(c, map.get(c)-1);

                if(map.get(c)==0)
                    candidate--;
            }


            while(candidate == 0){

                if(max > j-i+1){
                    res = s.substring(i,j+1);
                    max = j-i+1;
                }

                char t = s.charAt(i++);

                if(map.containsKey(t)){
                    map.put(t, map.get(t)+1);

                    if(map.get(t)>0)
                        candidate++;
                }

            }
        }

        return res;
    }
}
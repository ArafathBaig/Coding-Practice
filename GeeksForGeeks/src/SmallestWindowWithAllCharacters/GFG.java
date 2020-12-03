package SmallestWindowWithAllCharacters;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main (String[] args)
    {

        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        while(t!=0){
            String s = scan.next();

            Map<Character, Integer> set = new HashMap<>();

            for(int i = 0; i < s.length(); i++){
                char c = s.charAt(i);

                if(!set.containsKey(c))
                    set.put(c,0);

                set.put(c, set.get(c)+1);
            }

            int d = set.size();

            set = new HashMap<>();
            int min = s.length();
            int i = 0, j = 0;
            while( i < s.length() && j < s.length()){
                char c = s.charAt(j++);


                if(!set.containsKey(c))
                    set.put(c,0);

                set.put(c, set.get(c)+1);


                while(i < s.length() && set.size() >= d){
                    min = Math.min(min, j-i);

                    char temp = s.charAt(i++);

                    set.put(temp, set.get(temp)-1);

                    if(set.get(temp)== 0)
                        set.remove(temp);



                }


            }

            System.out.println(min);
            t--;
        }

    }
}
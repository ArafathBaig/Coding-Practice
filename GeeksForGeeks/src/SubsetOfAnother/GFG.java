package SubsetOfAnother;

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
            int n = scan.nextInt();
            int m = scan.nextInt();
            Set<Integer> set = new HashSet<>();
            int a[] = new int[n];

            for(int i = 0; i < n ;i++){
                a[i] = scan.nextInt();
            }

            for(int i = 0 ; i < m ; i++){
                set.add(scan.nextInt());
            }

            for(int k : a){

                if(set.contains(k))
                    set.remove(k);

                if(set.isEmpty())
                    break;
            }

            System.out.println(set.isEmpty() == true ? "Yes" : "No");
            t--;
        }

    }
}

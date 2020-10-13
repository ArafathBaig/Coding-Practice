package NumberTheory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SegmentedSeive {

    public static void main(String[] args) {
        int l = 0;
        int r = 50;

        int sieve[] = new int[r-l+1];

        solve(sieve,l, r);

        System.out.println(Arrays.toString(sieve));
        for(int i= 0 ;i < sieve.length ;i++) {
            if(sieve[i] == 0)
                System.out.println(l+i);
        }
    }

    private static void solve(int s[],int l,  int r){

        int temp[] = new int[(int) Math.sqrt(r)];

//        for(int i = 2; i*i < r;i++){
//
//            if(temp[i] == 0){
//                for(int j = i*i ; j<r ;j+=i)
//                    temp[j] = 1;
//            }
//        }
        for(int i = 2 ;i*i <= r ;i++){
                for(int j = (i*i) > l ? i*i : l ; j<=r ;j+=i){

                    System.out.println(j-l);
                    if(j%i == 0)
                    s[j-l] = 1;
                }
            }

        }
    }



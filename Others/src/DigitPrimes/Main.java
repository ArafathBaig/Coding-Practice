package DigitPrimes;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int max=1000000;
        int digPrime[] = new int[max];

        solve(digPrime,max);
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        while(n--!= 0){
            int l = scan.nextInt();
            int r = scan.nextInt();

            System.out.println(digPrime[r] - digPrime[l]);
        }
    }

    private static void solve(int dp[] , int max){

        int prime[] = new int[max+1];
        prime[0] = 1;
        prime[1] = 1;

        int digP = 0;
        for(int i = 2; i*i < max ; i++){

            if(prime[i]==0){
                for(int j = i*i ; j < max ; j+=i){
                    prime[j] = 1;
                }

                int temp = i;

                if(prime[getSum(temp)] == 0)
                    digP++;
            }

            dp[i] = digP;
        }

        for(int i = 1000 ; i < max ; i++){
            int temp = i;
            if(prime[i] == 0 && prime[getSum(temp)] == 0)
                digP++;

            dp[i] = digP;

        }
    }

    private static int getSum(int t){
        int sum = 0;
        while(t != 0){
            sum += (t%10);
            t/=10;
        }
        return sum;
    }
}

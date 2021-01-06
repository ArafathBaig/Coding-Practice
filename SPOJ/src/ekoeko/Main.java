package ekoeko;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){

        Scanner scan = new Scanner(
                System.in
        );

        int n = scan.nextInt();
        long m = scan.nextLong();

        int a[] = new int[n];
        int sum = 0;
        for(int i = 0; i < n ;i++ ){
            a[i] = scan.nextInt();
            sum = Math.max(sum,a[i]);
        }

        int ans = 0;
        int l = 0;

        while(l < sum){

            int mid = l + (sum - l) /2;

            long s= 0;

            for(int i = 0; i < n ;i++){

                if(a[i] > mid){
                    s += a[i] - mid;
                }

                if(s>=m){
                    break;
                }
            }

            if(s < m){
                sum = mid-1;
            }else{
                ans = mid;
                l = mid+1;
            }
        }

        System.out.println(ans);
    }
}

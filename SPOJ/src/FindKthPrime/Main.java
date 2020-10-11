package FindKthPrime;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    static List<Integer> primes = new ArrayList<>();
    public static void main(String[] args) throws java.lang.Exception {


        boolean[] sieve = new boolean[900000001];
        solve(sieve);

        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        while (t-- != 0) {
            int n = scan.nextInt();
            System.out.println(primes.get(n-1));
        }
    }

    private static void solve(boolean[] sieve) {

        sieve[1] = true;
        int count = 1;
        int maxN = 900000000;
        for (int i = 2; i * i <= maxN; i++) {

            if (!sieve[i]) {
                for (int j = i * i; j <= maxN; j += i) {
                    sieve[j] = true;
                }
            }
        }

        for(int i = 2; i <=maxN ;i++){
            if(!sieve[i])
                primes.add(i);
        }
    }
}
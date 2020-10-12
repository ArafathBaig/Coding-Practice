package MacroPrimePrime;

/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here

        boolean[] sieve = new boolean[1000002];
        int[] presum = new int[1000002];

        solve(sieve, presum);
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();

        // System.out.println(Arrays.toString(sieve));
        // System.out.println(Arrays.toString(presum));

        while(t-- != 0){
            int l = scan.nextInt();
            int r= scan.nextInt();

            System.out.println(presum[r]-presum[l-1]);
        }


    }

    private static void solve(boolean[] s, int prefix[]){

        s[0] = true;
        s[1] = true;
        int max = 1000001;
        int count = 0;
        for(int i = 2; i*i <= max ;i++ ){

            if(!s[i]){
                count++;
                for(int j = i*i ; j<=max; j+=i){
                    s[j] = true;
                }
            }
        }

        count = 0;

        for(int i = 2 ; i<= max ;i++){
            if(!s[i])
                count++;

            if(!s[count])
                prefix[i] = 1;
            else
                prefix[i] = 0;
        }

        for(int i=  2; i <= max; i++){
            prefix[i] += prefix[i-1];
        }
    }
}


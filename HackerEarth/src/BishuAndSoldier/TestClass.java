package BishuAndSoldier;

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

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int a[] = new int[n];

        for(int i = 0; i < n ;i++){
            a[i] = scan.nextInt();
        }

        int q = scan.nextInt();

        Arrays.sort(a);

        int presum[] = new int[n];
        int sum =0;

        for(int i = 0; i < n ;i++){
            sum+= a[i];
            presum[i] = sum;
        }

        StringBuilder sb = new StringBuilder();
        while(q-- != 0){

            int t = scan.nextInt();

            int l = 0, r = n-1;
            int ans=-1;
            while(l<=r){
                int mid = l + (r-l)/2;

                if(a[mid] > t){
                    r=mid-1;
                }else{
                    ans = mid;
                    l = mid+1;
                }


            }

            sb.append((ans+1)+" ").append(presum[ans]).append("\n");
        }

        System.out.println(sb);

    }
}


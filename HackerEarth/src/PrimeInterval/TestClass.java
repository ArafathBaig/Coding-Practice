package PrimeInterval;


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

        int l = scan.nextInt();
        int r = scan.nextInt();

        for(int i = l ; i <= r;i++){

            int flag = 0;

            if(i == 1)
                flag = 1;

            for(int j = 2 ; j*j <= i ;j++){

                if(i%j == 0){
                    flag = 1;
                    break;
                }

            }

            if(flag == 0)
                System.out.print(i+" ");
        }


        System.out.println();

    }
}

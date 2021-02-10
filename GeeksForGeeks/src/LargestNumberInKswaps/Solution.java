package LargestNumberInKswaps;

// { Driver Code Starts
import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int k = sc.nextInt();
            String str = sc.next();
            Sol obj = new Sol();
            System.out.println(obj.findMaximumNum(str, k));
        }
    }
}// } Driver Code Ends


class Sol
{
    static String max ="" ;
    public static String findMaximumNum(String str, int k)
    {
        //code here.
        char[] ch = str.toCharArray();
        max = "";
        recursion(ch,0,k);

        return max;
    }

    private static void recursion(char[] c, int i, int k){

        String s = String.valueOf(c);

        if(max.compareTo(s) < 0){
            max =s ;
        }

        if(i>=c.length || k == 0){
            return;
        }

        // System.out.println(Arrays.toString(c));
        for(int z = i+1 ; z < c.length ;z++){


            swap(c,i,z);
            recursion(c,i+1,k-1);
            swap(c,z,i);

        }
        recursion(c,i+1,k);
    }

    private static void swap(char[] c, int i , int j){
        char temp = c[i];
        c[i] = c[j];
        c[j] = temp;
    }
}
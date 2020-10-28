package SubaaraySum0;
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main (String[] args)
    {

        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        while(t--!=0){
            int n = scan.nextInt();

            Set<Integer> set = new HashSet<>();
            set.add(0);
            int sum = 0;
            int flag = 0;

            for(int i = 0 ;i < n;i++){
                int a = scan.nextInt();
                sum += a;
                System.out.println(sum);

                if(set.contains(sum)){
                    flag=  1;
                    break;
                }

                set.add(sum);
            }

            if(flag == 0)
                System.out.println("No");
            else
                System.out.println("Yes");
        }

    }
}
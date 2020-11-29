package minimumReversals;

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
            String s = scan.next();
            Deque<Character> deq = new LinkedList<>();

            for(int i = 0 ; i < s.length() ; i++){
                char c = s.charAt(i);

                if(!deq.isEmpty() && deq.peekLast() == '[' && c == ']')
                    deq.pollLast();
                else
                    deq.addLast(c);
            }

            System.out.println(deq.size());
            if(deq.size()%2 == 1){
                System.out.println(-1);
                continue;
            }
            int count = 0;

            boolean open = true;
            char check = '[';
            while(!deq.isEmpty()){

                char c = deq.peekFirst();
                if(c != check)
                    count++;

                open = !open;

                check = open ? '[' : ']';

                deq.pollFirst();
            }
            System.out.println(count);
        }


    }
}
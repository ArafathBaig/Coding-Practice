package ReverseStack;

// { Driver Code Starts
import java.util.Scanner;
import java.util.Stack;
class SortedStack{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            Stack<Integer> s=new Stack<>();
            int n=sc.nextInt();
            while(n-->0)
                s.push(sc.nextInt());
            GfG g=new GfG();
            Stack<Integer> a=g.sort(s);
            while(!a.empty()){
                System.out.print(a.peek()+" ");
                a.pop();
            }
            System.out.println();
        }
    }
}// } Driver Code Ends


/*Complete the function below*/
class GfG{
    public Stack<Integer> sort(Stack<Integer> s)
    {
        //add code here.
        reverse(s);

        return s;
    }

    private void insert(int x,Stack<Integer> stack){

        if(stack.isEmpty()){
            stack.push(x);
            return;
        }else if(stack.peek() > x){

            int temp = stack.pop();

            insert(x,stack);

            stack.push(temp);
        }else{
            stack.push(x);
        }
    }

    private void reverse(Stack<Integer> stack){

        if(!stack.isEmpty()){

            int temp = stack.pop();

            reverse(stack);

            insert(temp,stack);

        }

    }
}
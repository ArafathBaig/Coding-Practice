package SearchArrayWhereAdjacentDifferByK;

public class GFG {
    public static void main(String[] args) {
        int a[] = {20,40,50,70,70,50,30,10,20,30,40,60,70,70,70,60};
        int k = 20, x= 60;
        int flag = 0;
        for(int i = 0; i < a.length;){

            if(a[i] == x){
                System.out.println(i);
                flag = 1;
                break;
            }

            int next = Math.max(x-a[i], 0);


            i += (next/k) == 0 ? 1 : next/k;



        }

        if(flag == 0)
            System.out.println(-1);
    }
}

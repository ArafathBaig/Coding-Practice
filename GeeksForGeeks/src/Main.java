import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String temp = sc.nextLine();
        String s =temp.toLowerCase();
        System.out.println(s);
        char c = sc.next().toLowerCase().charAt(0);
        int f = -1 , l = -1;
        for(int i = 0; i < s.length() ; i++){

            char t = s.charAt(i);

            if(c == t) {
                if (f == -1)
                    f = i;

                l = i;
            }
        }

        if(f==-1){
            System.out.println(s);
            return;
        }

        char[] st = temp.toCharArray();

        st[f] = '*';
        st[l] = '*';

        String result = "";

        for(int i = 0 ; i < st.length ;i++){
            result+= st[i];
        }

        System.out.println(result);
    }
}





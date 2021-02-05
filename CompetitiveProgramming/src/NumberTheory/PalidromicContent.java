package NumberTheory;

public class PalidromicContent {

    public static void main(String[] args) {


        for (int i = 999; i > 99; i--) {
            boolean isRev = false;
            StringBuilder s = new StringBuilder();
            for (int j = 999; j > 99; j--) {

                s.append(i*j);
                StringBuilder temp = s.reverse();

                if(temp.compareTo(s)==0){
                   isRev = true;
                    break;
                }
            }

            if(isRev) {
                System.out.println(s);
                break;
            }
        }
    }
}

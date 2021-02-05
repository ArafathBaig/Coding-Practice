package NumberTheory;

public class LargestPrimeFactor {
    public static void main(String[] args) {
        long num = 600851475143L;

        long ans = -1;

        for(long i = 2 ; i*i <= 600851475143L; i++) {

            if (num % i == 0) {
                System.out.println(i);
                int flag = 0;
                for (long j = 2; j * j < i; j++) {

                    if (i % j == 0) {
                        flag = 1;
                        break;
                    }

                }

                if (flag == 0 && num % i == 0) {
                    ans = num;
                }
            }
        }
        System.out.println(ans == -1 ? num :ans);
    }
}

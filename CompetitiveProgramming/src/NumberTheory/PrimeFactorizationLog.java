package NumberTheory;

public class PrimeFactorizationLog {

    public static void main(String[] args) {
        int sieve[] = new int[100001];
        solve(sieve);

        int prime = 50571;

        while(prime > 1){

            int count = 0;
            int cur = sieve[prime];

            if(sieve[prime] == 0){
                System.out.print("("+prime+"^"+1+") ");
                prime/=prime;
                continue;
            }

            while(prime > 1 && sieve[prime] == cur){
                count++;
                prime/=sieve[prime];
            }

            System.out.print("("+cur+"^"+count+") ");
        }
    }

    private static void solve(int [] s){

        for(int i = 2 ; i*i < s.length ;i++){

            if(s[i] == 0){
                for(int j = i*i ; j< s.length ;j+=i){
                    if(s[j] == 0)
                        s[j] = i;
                }
            }
        }
    }
}

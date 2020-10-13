package NumberTheory;

public class PrimeFactorizationSQRT {

    public static void main(String[] args) {

        int prime = 42;

        for(int i = 2 ; i*i<= prime ;i++){

            if(prime%i == 0){

                int count = 0;

                while(prime%i == 0){
                    prime/= i;
                    count++;
                }

                System.out.print("("+i+"^"+count+") ");
            }
        }

        System.out.println("("+prime+"^"+1+")");
    }
}

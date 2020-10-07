package CodeChefJulyChallenge.ChefAndCardGame;

import java.util.Scanner;

class Codechef {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        while(t-- != 0){
            int n = scan.nextInt();
            int chef = 0, morty = 0;
            while(n-- != 0){
                int  dig1 = scan.nextInt();
                int dig2 = scan.nextInt();
                int sum1 = 0 , sum2 = 0;
                while(dig1 != 0){
                    sum1 += dig1%10;
                    dig1 /= 10;
                }

                while(dig2 != 0){
                    sum2 += dig2%10;
                    dig2/=10;
                }

                if(sum1 > sum2){
                    chef++;
                }else if(sum1 < sum2){
                    morty++;
                }else{
                    chef++;
                    morty++;
                }

            }

            if(chef > morty){
                System.out.println(0+" "+chef);
            }else if(morty > chef){
                System.out.println(1+" "+morty);
            }else{
                System.out.println(2+" "+chef);
            }
        }
    }
}

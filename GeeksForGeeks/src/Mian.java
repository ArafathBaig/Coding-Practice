import java.util.Scanner;

public class Mian {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true){


            System.out.println("Enter the number:");
            int num = scan.nextInt();
            switch(num){

                case 1:
                    System.out.println("Book");
                    break;

                case 2:
                    System.out.println("cancel");
                    break;

                case 3:
                    System.out.println("update");
                    break;

                case 4:
                    System.out.println("exit");
                    System.exit(0);

                default:
                    System.out.println("Wrong choice");

            }
        }
    }
}

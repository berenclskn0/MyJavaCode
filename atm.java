import java.util.Scanner;

public class atm {
    public static void main(String[] args){
        double berenBalance = 2500;
        String berenAccount = "beren1";
        String berenPassword = "1234";

        String operationOptions = "Balance View --> 1"
                +" Withdraw Money --> 2"
                +" Exit the application --> q";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to ATM");
        System.out.println("Please enter your information");

        System.out.print("Account Name: ");
        String accountName = scanner.nextLine();

        System.out.print("Password: ");
        String password = scanner.nextLine();

        if(accountName.equals(berenAccount) && password.equals(berenPassword)){
            System.out.println("Logging in...");

            System.out.print("Please enter operation: ");
            String choice = scanner.nextLine();

            switch(choice){
                case "1":
                    System.out.print("Balance: " + berenBalance);
                    break;

                case "2":
                    System.out.print("The amount you want to withdraw: ");
                    int amountWithdraw = scanner.nextInt();

                    if(berenBalance >= amountWithdraw){
                        berenBalance -= amountWithdraw;
                        System.out.println("Money has been withdrawn from your account.");
                        System.out.print("Remaining amount: " + berenBalance);
                    }
                    else{
                        System.out.println("You cannot withdraw more money than your balance");
                    }
                    break;

                case "q":
                    System.out.println("Exiting the application. Thank you!");
                    break;

                default:
                    System.out.println("Invalid option. Please select again");
            }
        }
        else{
            System.out.println("Your account name or password is incorrect");
        }
    }
}

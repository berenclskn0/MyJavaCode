import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to our bank.");
        System.out.println("Interest rate is 6%");

        System.out.print("Enter the amount you want to deposit: ");
        int principal = scanner.nextInt();

        System.out.print("For how many years do you want to invest your money: ");
        int years = scanner.nextInt();

        double totalAmount = principal;
        double interestRate = 0.06;

        for(int i = 1 ; i <= years ; i++){
            totalAmount = (totalAmount * interestRate) + totalAmount;

            System.out.println("Total amount at the end of year " + i + ": " + (int)totalAmount);
        }
    }
}

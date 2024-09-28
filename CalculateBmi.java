import java.util.Scanner;

public class CalculateBmi {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Pleas enter your Weight: ");
        int weight = scanner.nextInt();

        System.out.print("Please enter your height(example 1,80): ");
        double height = scanner.nextDouble();

        double bmi = (weight / (height * height));

        if (bmi < 18.5){
            System.out.println("You are thin");
        }
        else if (bmi >= 18.5 && bmi < 25){
            System.out.println("You are normal");
        }
        else if (bmi >= 25 && bmi < 30){
            System.out.println("You are overweight");
        }
        else{
            System.out.println("You are obese");
        }
    }
}

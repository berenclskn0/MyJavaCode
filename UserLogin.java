import java.util.Scanner;
public class UserLogin {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        int loginAttempts = 3;

        String systemUsername = "Yasemin";
        String systemPassword = "1234";

        System.out.println("******************");
        System.out.println("Welcome to the login system...");
        System.out.println("******************");

        while(true) {
            System.out.print("Username: ");
            String username = scanner.nextLine();

            System.out.print("Password: ");
            String password = scanner.nextLine();

            if(username.equals(systemUsername) && password.equals(systemPassword)){
                System.out.println("Welcome...");
                break;
            }
            else if (username.equals(systemUsername) && !password.equals(systemPassword)){
                System.out.println("Your password is incorrect");
                loginAttempts -= 1;
            }
            else if (!username.equals(systemUsername) && password.equals(systemPassword)){
                System.out.println("Your username is incorrect");
                loginAttempts -= 1;
            }
            else{
                System.out.println("Both your username and password are incorrect");
                loginAttempts -= 1;
            }

            System.out.println("Remaining login attempts: " + loginAttempts);

            if (loginAttempts == 0){
                System.out.println("You have run out of login attempts");
                break;
            }
        }
    }
}

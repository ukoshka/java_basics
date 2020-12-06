import java.util.Scanner;
class Password{
    public static void main (String[] args) {
        System.out.println("Please, enter your password: ");
        Scanner scanner = new Scanner(System.in);
        String password1 = scanner.nextLine();
        
        System.out.println("Please, repeat password:");
        String password2 = scanner.nextLine();
        
        if (password1.equals(password2) && password1.length() >= 8) {
            System.out.println("Passwords are OK");
        } else if (!password1.equals(password2)) {
            System.out.println("Passwords should be the same!");
        } else if (password1.length() < 8) {
            System.out.println("Passwords should be at least 8 characters long!");
        }
    }
}

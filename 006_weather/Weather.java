import java.util.Scanner;
class Weather{
public static void main (String[] args) {
    System.out.println("Is it raining now?");
    Scanner scanner = new Scanner(System.in);
    String answear = scanner.nextLine();
    if (answear.equalsIgnoreCase("yes")) {
        System.out.println("Do not forget umbrella!");
    } else if (answear.equalsIgnoreCase("no")) {
        System.out.println("Leave umbrella at home.");
    } 
    else {
        System.out.println("Enter correct answear, please");
    }
}
}
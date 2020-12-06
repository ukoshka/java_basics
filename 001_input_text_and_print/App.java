import java.util.Scanner;

class App {
	public static void main(String[] args) {
		System.out.println("Hello. Please, input your name: ");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		System.out.println("Nice to meet you, " + name + "!");
		
	}
}

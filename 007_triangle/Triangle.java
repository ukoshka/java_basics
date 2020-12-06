import java.util.Scanner;

class Triangle {
    public static void main(String[] args) {
        double[] sides = new double[3];
        System.out.println("Enter the first side length");
        Scanner scanner = new Scanner(System.in);
        sides[0] = scanner.nextDouble();
        System.out.println("Enter the second side length");
        sides[1] = scanner.nextDouble();
        System.out.println("Enter the third side length");
        sides[2] = scanner.nextDouble();

        boolean isTriangle = true;
        for (int i = 0; i < 3; i++) {
             isTriangle = isTriangle && ((sides[i % 3] + sides[(i + 1) % 3]) > sides[(i + 2) % 3]);
        }

        if (isTriangle) {System.out.println("It's a triangle");}
        else System.out.println("It is impossible to build a triangle with this sides length");
    }
}
class PrimeNumbers {
    public static void main(String[] args) {
        int n = 3;
        int i = 2;

        while (n <= 100) {
            i = 2;
            while (i < n) {
                if (n % i == 0) {
                    //System.out.println("Not a prime number");
                    break;
                } else {
                    i ++;
                    if (n == i) System.out.print("2" + " " + n + " ");
                }
            }
            n++;
        }

    }
}
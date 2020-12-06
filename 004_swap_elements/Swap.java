class Swap{
    public static void main(String[] args) {
        int[] numbers = new int[2];
        numbers[0] = 10;
        numbers[1] = 20;
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("%s ", numbers[i]);
        }
        System.out.println();
        int buf = numbers[0];
        numbers[0] = numbers[1];
        numbers[1] = buf;
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("%s ", numbers[i]);
        }
        System.out.println();  

    }
}
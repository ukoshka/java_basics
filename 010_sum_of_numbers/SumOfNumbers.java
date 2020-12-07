class SumOfNumbers {
    public static void main(String[] args) {
        Integer sum = 0;
        for (String arg : args) sum += Integer.parseInt(arg);
        System.out.println (sum);
    }
}
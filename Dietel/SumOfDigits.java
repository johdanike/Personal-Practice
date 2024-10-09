public class SumOfDigits {
    public static void main(String[] args) {
        sumOfDigits(7631);
    }
    public static void sumOfDigits(int number) {
        int sum = 0;
        for(int index = 0; index <= number; index++) {
            sum += index;
        }
        System.out.println(sum);
    }

}

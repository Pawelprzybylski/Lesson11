public class Numbers {

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }

    public static int add(int number) {
        int sum = 0;
        while (number > 0) {
            sum = sum + number % 10;
            number = number / 10;
        }
        return sum;
    }

}

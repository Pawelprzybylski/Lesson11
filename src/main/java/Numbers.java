public class Numbers {

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }

    public static int add(int number) {
        int sum = 0;
        int element=number;
        while (element > 0) {
            sum = sum + element % 10;
            element = element / 10;
        }
        return sum;
    }

}

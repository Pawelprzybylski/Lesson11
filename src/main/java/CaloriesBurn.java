public class CaloriesBurn {

    private static int calories;

    public static int getCalories() {
        return calories;
    }

    public static int getBurnCaloriesEfficiency() {
        if (calories <= 300) {
            return 1;
        } else if (calories > 300 && calories < 400) {
            return 2;
        } else if (calories >= 400) {
            return 3;
        } else {
            throw new IllegalArgumentException("Input value is not correct ");
        }
    }

}


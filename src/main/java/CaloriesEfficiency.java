public class CaloriesEfficiency {

    public int getCaloriesEfficiency(int calories) {

        if (calories <= 0) {
            throw new IllegalArgumentException("Input value " + calories + " is not correct");
        }
        if (calories <= 300) {
            return 1;
        } else if (calories > 300 && calories < 400) {
            return 2;
        } else {
            return 3;
        }

    }

}


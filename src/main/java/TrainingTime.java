public class TrainingTime {

    private static int timeInMinutes;

    public int getTimeInMinutes() {
        return timeInMinutes;
    }

    public static int getTrainingTimeEfficiency() {
        if (timeInMinutes < 30) {
            return 1;
        } else if (timeInMinutes >= 30 && timeInMinutes <= 60) {
            return 2;
        } else if (timeInMinutes > 60) {
            return 3;
        } else {
            throw new IllegalArgumentException("Input value is not correct ");
        }
    }

}






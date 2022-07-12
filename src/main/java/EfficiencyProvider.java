public class EfficiencyProvider {

    final private static int TRAINING_TIME_RATING = 1;
    final private static int CALORIES_BURN_RATING = 2;
    final private static int AVERAGE_PULSE_RATING = 3;

    TimeEfficiency trainingTime;

    CaloriesEfficiency caloriesBurn;

    PulseEfficiency averagePulse;

    EfficiencyProvider(TimeEfficiency trainingTime, CaloriesEfficiency caloriesBurn, PulseEfficiency averagePulse) {
        this.trainingTime = trainingTime;
        this.caloriesBurn = caloriesBurn;
        this.averagePulse = averagePulse;
    }


    public String getTrainingEfficiency(int time, int calories, int pulse) {

        double fractionNumerator = ((trainingTime.getTimeEfficiency(time) * TRAINING_TIME_RATING) +
                (caloriesBurn.getCaloriesEfficiency(calories) *
                        CALORIES_BURN_RATING) + (averagePulse.getPulseEfficiency(pulse) * AVERAGE_PULSE_RATING));

        double fractionDenominator = (TRAINING_TIME_RATING + CALORIES_BURN_RATING + AVERAGE_PULSE_RATING);

        double result = fractionNumerator / fractionDenominator;

        if (result <= 0) {
            throw new RuntimeException("Check your training data");
        }
        if (result < 1.2) {
            return "low";
        } else if (result >= 1.2 && result < 2) {
            return "good";
        } else if (result >= 2 && result < 3) {
            return "very good";
        } else {
            return "perfect";
        }

    }

}

public class TrainingEfficiency implements TrainingUtils {

    final private static int trainingTimeRating = 1;
    final private static int caloriesBurnRating = 2;
    final private static int averagePulseRating = 3;

    @Override
    public double calculateWeightedAverage() {
        return ((TrainingTime.getTrainingTimeEfficiency() * trainingTimeRating) +
                (CaloriesBurn.getBurnCaloriesEfficiency() *
                        caloriesBurnRating) + (AveragePulse.getaAveragePulseEfficiency() * averagePulseRating)) / (trainingTimeRating + caloriesBurnRating + averagePulseRating);
    }

    @Override
    public void getTrainingEfficiency() {
        if (calculateWeightedAverage() < 1.2) {
            System.out.println("low");
        } else if (calculateWeightedAverage() >= 1.2 && calculateWeightedAverage() < 2) {
            System.out.println("good");
        } else if (calculateWeightedAverage() >= 2 && calculateWeightedAverage() < 3) {
            System.out.println("very good");
        } else if (calculateWeightedAverage() == 3) {
            System.out.println("perfect");
        }
    }

}

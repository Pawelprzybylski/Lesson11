public class TimeEfficiency {

    public int getTimeEfficiency(int timeInMinutes) {

        if (timeInMinutes <= 0) {
            throw new IllegalArgumentException("Input value " + timeInMinutes + " is not correct");
        } else if (timeInMinutes < 30) {
            return 1;
        } else if (timeInMinutes >= 30 && timeInMinutes <= 60) {
            return 2;
        } else {
            return 3;
        }

    }

}






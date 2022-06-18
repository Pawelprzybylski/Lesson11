public class AveragePulse {

    private static int pulse;

    public static int getPulse() {
        return pulse;
    }

    public static int getaAveragePulseEfficiency() {
        if (pulse > 175) {
            return 1;
        } else if (pulse >= 160 && pulse <= 175) {
            return 2;
        } else if (pulse < 160) {
            return 3;
        } else {
            throw new IllegalArgumentException("Input value is not correct ");
        }
    }

}

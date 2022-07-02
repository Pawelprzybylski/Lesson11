public class PulseEfficiency {

    public int getPulseEfficiency(int pulse) {

        if (pulse <= 0) {
            throw new IllegalArgumentException("Input value " + pulse + "is not correct ");
        }
        if (pulse > 175) {
            return 1;
        } else if (pulse >= 160 && pulse <= 175) {
            return 2;
        } else {
            return 3;
        }

    }

}

public class CurrentRateProvider {

public double get(Currency currency) {

    switch (currency) {
        case EURO: return 1;
        case BRITISH_POUNDS: return 2;
        case DOLLARS: return 3;
    }
    return 0;
}

}

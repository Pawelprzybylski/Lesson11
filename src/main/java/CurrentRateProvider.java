public class CurrentRateProvider {

public double get(Currency currency) {
try{
    switch (currency) {
        case EURO: return 1;
        case BRITISH_POUNDS: return 2;
        case DOLLARS: return 3;
    }
} catch (IllegalArgumentException e){
        System.out.println("Waluta nie jest obsługiwana");
    }
    return 0;
}

}

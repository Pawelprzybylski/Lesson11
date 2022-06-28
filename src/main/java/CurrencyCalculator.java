public class CurrencyCalculator {

    CurrentRateProvider provider;

    public CurrencyCalculator(CurrentRateProvider currentRateProvider) {
        this.provider = currentRateProvider;
    }

    public double convertZlotyToEuro(double value) {
        return value * provider.get(Currency.EURO);
    }

    public double convertZlotyToDollars(double value) {
        return value * provider.get(Currency.DOLLARS);
    }

    public double convertZlotyToBritishPounds(double value) {
        return value * provider.get(Currency.BRITISH_POUNDS);
    }

}

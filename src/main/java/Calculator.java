public class Calculator implements CurrencyUtils {

    CurrentRateProvider provider;

    public Calculator(CurrentRateProvider currentRateProvider) {
        this.provider = currentRateProvider;
    }

    public double convertZlotyToEuro(double zl) {
        return zl * getEuroRate();
    }

    public double convertZlotyToDollars(double zl) {
        return zl * getDollarsRate();
    }

    public double convertZlotyToBritishPounds(double zl) {
        return zl * getBritishPoundsRate();
    }

    @Override
    public double getEuroRate() {
        return new CurrentRateProvider().get(Currency.EURO);
    }

    @Override
    public double getDollarsRate() {
        return new CurrentRateProvider().get(Currency.DOLLARS);
    }

    @Override
    public double getBritishPoundsRate() {
        return provider.get(Currency.BRITISH_POUNDS);
    }

}

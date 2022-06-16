public class Calculator implements CurrencyUtils {

public double convertZlotyToEuro(double zl){
    return zl*getEuroRate();
}

public  double convertZlotyToDollars(double zl){
    return zl*getDollarsRate();
}

public  double convertZlotyToBritishPounds(double zl){
    return  zl*getBritishPoundsRate();
}

    @Override
    public double getEuroRate() {
        return CurrentRate.getEuro();
    }

    @Override
    public double getDollarsRate() {
        return CurrentRate.getDollars();
    }

    @Override
    public double getBritishPoundsRate() {
        return CurrentRate.getBritishPounds();
    }

}

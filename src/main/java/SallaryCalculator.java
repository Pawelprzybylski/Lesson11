public class SallaryCalculator implements BaseSallaryAndSaturdayBonus {

    BonusAndSaturday bonusAndSaturday= new BonusAndSaturday();

    public  double calculateTotalSalary() {
        return getBaseSallary() + bonusAndSaturday.getBonus() + (getSaturdayRemuneration() * bonusAndSaturday.getNumbersOfSaturdays());
    }

    @Override
    public double getBaseSallary() {
        return 0;
    }

    @Override
    public double getSaturdayRemuneration() {
        return 0;
    }

}

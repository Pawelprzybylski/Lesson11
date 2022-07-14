public class SalaryCalculator {
    private final BaseSalaryUtils baseSalary;
    private final SaturdayBonusUtils saturdayBonus;

  public SalaryCalculator(BaseSalaryUtils baseSalaryUtils, SaturdayBonusUtils saturdayBonusUtils) {
        this.baseSalary = baseSalaryUtils;
        this.saturdayBonus = saturdayBonusUtils;
    }

    public double calculateTotalSalary(int bonus, int saturdays) {
        return this.baseSalary.getBaseSalary() + bonus + this.saturdayBonus.getSaturdayBonus() * saturdays;
    }

}

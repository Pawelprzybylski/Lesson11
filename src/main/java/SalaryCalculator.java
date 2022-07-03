public class SalaryCalculator {
    BaseSalaryUtils baseSalary;
    SaturdayBonusUtils saturdayBonus;

    SalaryCalculator(BaseSalaryUtils baseSalaryUtils, SaturdayBonusUtils saturdayBonusUtils) {
        this.baseSalary = baseSalaryUtils;
        this.saturdayBonus = saturdayBonusUtils;
    }

    public double calculateTotalSalary(int bonus, int Saturdays) {
        return this.baseSalary.getBaseSalary() + bonus + this.saturdayBonus.getSaturdayBonus() * Saturdays;
    }

}

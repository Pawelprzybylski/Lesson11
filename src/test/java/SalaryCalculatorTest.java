import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;
import org.testng.annotations.Test;

public class SalaryCalculatorTest {
    @Test
    public void shouldCalculateTotalSalary() {

        //given
        BaseSalaryUtils salary = Mockito.mock(BaseSalaryUtils.class);
        SaturdayBonusUtils bonus = Mockito.mock(SaturdayBonusUtils.class);
        SalaryCalculator salaryCalculator = new SalaryCalculator(salary, bonus);

        Mockito.when(salary.getBaseSalary()).thenReturn(2000.0);
        Mockito.when(bonus.getSaturdayBonus()).thenReturn(500.0);

        //when
        double result = salaryCalculator.calculateTotalSalary(200, 2);

        //then
        Assertions.assertEquals(3200, result);

    }

}

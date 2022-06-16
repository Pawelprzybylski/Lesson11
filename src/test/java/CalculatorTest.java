import org.mockito.Mockito;
import org.testng.annotations.Test;

public class CalculatorTest {

    @Test
    public static void shouldConvertZlotyToEuro() {
        Calculator calculator = Mockito.mock(Calculator.class);
        Mockito.when(calculator.convertZlotyToEuro(24)).thenReturn(113.4);
    }

    @Test
    public static void shouldConvertZlotyToDollars() {
        Calculator calculator = Mockito.mock(Calculator.class);
        Mockito.when(calculator.convertZlotyToDollars(24)).thenReturn(107.49);
    }

    @Test
    public static void shouldConvertZlotyToBritishPounds() {
        Calculator calculator = Mockito.mock(Calculator.class);
        Mockito.when(calculator.convertZlotyToBritishPounds(24)).thenReturn(132.74);
    }

}

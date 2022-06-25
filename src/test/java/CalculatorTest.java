import org.mockito.Mockito;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public static void shouldConvertZlotyToEuro() {
        // given
        CurrentRateProvider provider = Mockito.mock(CurrentRateProvider.class);
        Mockito.when(provider.get(Currency.EURO)).thenReturn(2.0);

        // when
        double result = new Calculator(provider).convertZlotyToEuro(5.0);

        // then
        assertEquals(10, result);
    }

    @Test
    public static void shouldConvertZlotyToDollars() {
        // given
        CurrentRateProvider provider = Mockito.mock(CurrentRateProvider.class);
        Mockito.when(provider.get(Currency.DOLLARS)).thenReturn(3.0);

        // when
        double result = new Calculator(provider).convertZlotyToDollars(5.0);

        // then
        assertEquals(15, result);
    }

    @Test
    public static void shouldConvertZlotyToBritishPounds() {
        // given
        CurrentRateProvider provider = Mockito.mock(CurrentRateProvider.class);
        Mockito.when(provider.get(Currency.BRITISH_POUNDS)).thenReturn(4.0);

        // when
        double result = new Calculator(provider).convertZlotyToBritishPounds(5.0);

        // then
        assertEquals(20, result);
    }

}

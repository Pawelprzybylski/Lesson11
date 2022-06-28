import org.mockito.Mockito;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void shouldConvertZlotyToEuro() {
        // given
        CurrentRateProvider provider = Mockito.mock(CurrentRateProvider.class);
        Mockito.when(provider.get(Currency.EURO)).thenReturn(2.0);

        // when
        CurrencyCalculator currencyCalculator = new CurrencyCalculator(provider);
        double result = currencyCalculator.convertZlotyToEuro(5.0);

        // then
        assertEquals(10, result);
    }

    @Test
    public void shouldConvertZlotyToDollars() {
        // given
        CurrentRateProvider provider = Mockito.mock(CurrentRateProvider.class);
        Mockito.when(provider.get(Currency.DOLLARS)).thenReturn(3.0);

        // when
        CurrencyCalculator currencyCalculator = new CurrencyCalculator(provider);
        double result = currencyCalculator.convertZlotyToDollars(5.0);

        // then
        assertEquals(15, result);
    }

    @Test
    public void shouldConvertZlotyToBritishPounds() {
        // given
        CurrentRateProvider provider = Mockito.mock(CurrentRateProvider.class);
        Mockito.when(provider.get(Currency.BRITISH_POUNDS)).thenReturn(4.0);

        // when
        CurrencyCalculator currencyCalculator = new CurrencyCalculator(provider);
        double result = currencyCalculator.convertZlotyToBritishPounds(5.0);

        // then
        assertEquals(20, result);
    }

}

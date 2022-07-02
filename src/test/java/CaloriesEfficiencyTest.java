import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class CaloriesEfficiencyTest {

    @ParameterizedTest
    @CsvSource(value = {"150:1", "350:2", "450:3",}, delimiter = ':')
    public void shouldCalculatePulseEfficiency(int input, int expected) {
        //given
        CaloriesEfficiency caloriesEfficiency = new CaloriesEfficiency();

        //when
        int result = caloriesEfficiency.getCaloriesEfficiency(input);

        //then
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @ValueSource(ints = {0, -2})
    public void shouldThrowExceptionWhenInvalidInput(int input) {
        //given
        CaloriesEfficiency caloriesEfficiency = new CaloriesEfficiency();

        //when
        IllegalArgumentException exception = Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> caloriesEfficiency.getCaloriesEfficiency(input)
        );

        //then
        Assertions.assertEquals("Input value " + input + " is not correct", exception.getMessage());
    }

}

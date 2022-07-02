import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class TimeEfficiencyTest {

    @ParameterizedTest
    @CsvSource(value = {"20:1", "35:2", "70:3",}, delimiter = ':')
    public void shouldCalculateTrainingTimeEfficiency(int input, int expected) {
        TimeEfficiency timeEfficiency = new TimeEfficiency();
        int result = timeEfficiency.getTimeEfficiency(input);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @ValueSource(ints = {0, -2})
    public void shouldThrowExceptionWhenInvalidInput(int input) {
        TimeEfficiency timeEfficiency = new TimeEfficiency();
        IllegalArgumentException exception = Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> timeEfficiency.getTimeEfficiency(input)
        );
        Assertions.assertEquals("Input value " + input + " is not correct", exception.getMessage());
    }

}

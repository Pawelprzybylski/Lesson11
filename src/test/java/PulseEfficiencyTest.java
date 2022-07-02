import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class PulseEfficiencyTest {

    @ParameterizedTest
    @CsvSource(value = {"180:1", "165:2", "140:3",}, delimiter = ':')
    public void shouldCalculatePulseEfficiency(int input, int expected) {
        //given
        PulseEfficiency pulseEfficiency = new PulseEfficiency();

        //when
        int result = pulseEfficiency.getPulseEfficiency(input);

        //then
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @ValueSource(ints = {0, -2})
    public void shouldThrowExceptionWhenInvalidInput(int input) {
        //given
        PulseEfficiency pulseEfficiency = new PulseEfficiency();

        //when
        IllegalArgumentException exception = Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> pulseEfficiency.getPulseEfficiency(input)
        );

        //then
        Assertions.assertEquals("Input value " + input + " is not correct", exception.getMessage());
    }

}

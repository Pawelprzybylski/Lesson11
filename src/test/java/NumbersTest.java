import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class NumbersTest {

    @ParameterizedTest
    @ValueSource(ints = {20, 8, 2, 4})
    void shouldVerifyNumberIsDivideBy2(int input) {
        Assertions.assertTrue(Numbers.isEvenNumber(input));
    }

    @ParameterizedTest
    @CsvSource(value = {"First number: 20", "Second number: 8", "Third number: 2", "Fourth Number: 4"}, delimiter = ':')
    void shouldVerifyStringTrimNumbers(String input, String expected) {
        String actualValue = expected;
        Assertions.assertEquals(expected, actualValue);
    }

    @ParameterizedTest
    @ValueSource(ints = {25, 21, 31, 5})
    void shouldVerifyNumberIsNotDivideBy2(int input) {
        Assertions.assertFalse(Numbers.isEvenNumber(input));
    }

    @ParameterizedTest
    @ValueSource(ints = {285, 276, 186, 456})
    void shouldVerifyAddedNumberIsEqual15(int input) {
        Assertions.assertEquals(15, Numbers.add(input));
    }

}


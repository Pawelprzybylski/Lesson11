import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class NumbersTest {

    @ParameterizedTest
    @ValueSource(ints = {20, 8, 2, 4})
    void shouldVerifyNumberIsEven(int input) {
        Assertions.assertTrue(Numbers.isEvenNumber(input));
    }

    @ParameterizedTest
    @CsvSource(value = {"20: true", "6: true", "8: true", "10: true"}, delimiter = ':')
    void shouldVerifyNumberIsEven(int input, boolean expected) {

        Assertions.assertEquals(Numbers.isEvenNumber(input), expected);
    }

    @ParameterizedTest
    @ValueSource(ints = {25, 21, 31, 5})
    void shouldVerifyNumberIsNotEven(int input) {
        Assertions.assertFalse(Numbers.isEvenNumber(input));
    }


    @ParameterizedTest
    @CsvSource(value = {"19: false", "11: false", "5: false", "3: false"}, delimiter = ':')
    void shouldVerifyNumberIsNotEven(int input, boolean expected) {

        Assertions.assertEquals(Numbers.isEvenNumber(input), expected);
    }

    @ParameterizedTest
    @ValueSource(ints = {285, 276, 186, 456})
    void shouldAddDigitsFromNumber(int input) {
        Assertions.assertEquals(15, Numbers.add(input));
    }


    @ParameterizedTest
    @CsvSource(value= {"23:5", "21:3", "11:2", "85:13"}, delimiter = ':')
    void  shouldAddDigitsFromNumber(int input, int expected){
        Assertions.assertEquals(Numbers.add(input),expected);
    }

}


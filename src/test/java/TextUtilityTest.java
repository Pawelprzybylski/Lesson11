import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TextUtilityTest {
    @ParameterizedTest
    @MethodSource("provideStringsForCheckLengthText")
    void shouldVerifyingLengthString(String input, int expected) {
        int actualValue = TextUtility.checkLengthText(input);
        Assertions.assertEquals(expected, actualValue);
    }

    private static Stream<Arguments> provideStringsForCheckLengthText() {
        return Stream.of(
                Arguments.of("Ala ma kota", 11),
                Arguments.of("Janek ma psa", 12),
                Arguments.of("Ola ma królika", 14));
    }

}

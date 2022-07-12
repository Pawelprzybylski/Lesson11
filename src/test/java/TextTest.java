import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

public class TextTest {

    @ParameterizedTest
    @ValueSource(strings = {"Ala ma kota", "ala ma kota"})
    void shouldTextToUpperCase(String input) {
        Assertions.assertEquals("ALA MA KOTA", Text.toUpperCase(input));
    }

    @ParameterizedTest
    @NullSource
    void shouldReturnNullWhenNull(String input) {
        Assertions.assertNull(Text.toUpperCase(input));
    }

    @ParameterizedTest
    @EmptySource
    void shouldConvertEmptyStringToUpperCase(String input) {
        Assertions.assertEquals("", Text.toUpperCase(input));
    }

}
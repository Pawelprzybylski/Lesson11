import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.platform.commons.util.StringUtils;

public class TextTest {

    @ParameterizedTest
    @ValueSource(strings = {"Ala ma kota", "ala ma kota"})
    void shouldTextToUpperCase(String input) {
        Assertions.assertEquals("ALA MA KOTA", Text.toUpperCase(input));
    }

    @ParameterizedTest
    @NullSource
    void shouldVerifyNullStringToUpperCase(String input) {
        Assertions.assertEquals(input, null);
    }

    @ParameterizedTest
    @EmptySource
    void shoulsdVerifyEmptyStringToUpperCase(String input) {
        Assertions.assertTrue(StringUtils.isBlank(input));
    }

}
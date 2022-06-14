import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.platform.commons.util.StringUtils;

public class TextTest {
    @ParameterizedTest
    @ValueSource(strings = {"Ala ma kota", "ala ma kota"})
    void shouldVerifyTextToUpperCase(String input) {
        Assertions.assertEquals("ALA MA KOTA", Text.toUpperCase(input));
    }

    @ParameterizedTest
    @NullAndEmptySource
    void shouldVerifyChangeEmptyStringToUpperCase(String input) {
        Assertions.assertTrue(StringUtils.isBlank(Text.toUpperCase(input)));
    }

}
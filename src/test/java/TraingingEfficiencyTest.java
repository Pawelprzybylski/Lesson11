
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;

import java.util.stream.Stream;


public class TraingingEfficiencyTest {

  @ParameterizedTest
  @NullAndEmptySource
 @MethodSource("calculateWeightedAverage")
  private static Stream<Arguments> provideIntToCalculateTrainingEfficiency(){
    return Stream.of(
            Arguments.of()
    )
  }

}

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class EfficiencyProviderTest {

    @Test
    public void shouldCalculateLowTrainingEfficiency() {
        //given
        int time = 1;
        int calories = 2;
        int pulse = 4;

        TimeEfficiency timeEfficiency = Mockito.mock(TimeEfficiency.class);
        Mockito.when(timeEfficiency.getTimeEfficiency(time)).thenReturn(1);

        CaloriesEfficiency caloriesEfficiency = Mockito.mock(CaloriesEfficiency.class);
        Mockito.when(caloriesEfficiency.getCaloriesEfficiency(calories)).thenReturn(1);

        PulseEfficiency pulseEfficiency = Mockito.mock(PulseEfficiency.class);
        Mockito.when(pulseEfficiency.getPulseEfficiency(pulse)).thenReturn(1);

        //when
        EfficiencyProvider efficiencyProvider = new EfficiencyProvider(timeEfficiency, caloriesEfficiency, pulseEfficiency);
        String result = efficiencyProvider.getTrainingEfficiency(time, calories, pulse);

        //then
        Assertions.assertEquals("low", result);
    }

    @Test
    public void shouldCalculateGoodTrainingEfficiency() {
        //given
        int time = 25;
        int calories = 350;
        int pulse = 180;

        TimeEfficiency timeEfficiency = Mockito.mock(TimeEfficiency.class);
        Mockito.when(timeEfficiency.getTimeEfficiency(time)).thenReturn(1);

        CaloriesEfficiency caloriesEfficiency = Mockito.mock(CaloriesEfficiency.class);
        Mockito.when(caloriesEfficiency.getCaloriesEfficiency(calories)).thenReturn(2);

        PulseEfficiency pulseEfficiency = Mockito.mock(PulseEfficiency.class);
        Mockito.when(pulseEfficiency.getPulseEfficiency(pulse)).thenReturn(1);

        //when
        EfficiencyProvider efficiencyProvider = new EfficiencyProvider(timeEfficiency, caloriesEfficiency, pulseEfficiency);
        String result = efficiencyProvider.getTrainingEfficiency(time, calories, pulse);

        //then
        Assertions.assertEquals("good", result);
    }

    @Test
    public void shouldCalculateVeryGoodTrainingEfficiency() {
        //given
        int time = 10;
        int calories = 200;
        int pulse = 110;

        TimeEfficiency timeEfficiency = Mockito.mock(TimeEfficiency.class);
        Mockito.when(timeEfficiency.getTimeEfficiency(time)).thenReturn(1);

        CaloriesEfficiency caloriesEfficiency = Mockito.mock(CaloriesEfficiency.class);
        Mockito.when(caloriesEfficiency.getCaloriesEfficiency(calories)).thenReturn(3);

        PulseEfficiency pulseEfficiency = Mockito.mock(PulseEfficiency.class);
        Mockito.when(pulseEfficiency.getPulseEfficiency(pulse)).thenReturn(2);

        //when
        EfficiencyProvider efficiencyProvider = new EfficiencyProvider(timeEfficiency, caloriesEfficiency, pulseEfficiency);
        String result = efficiencyProvider.getTrainingEfficiency(time, calories, pulse);

        //then
        Assertions.assertEquals("very good", result);
    }

    @Test
    public void shouldCalculatePerfectTrainingEfficiency() {
        //given
        int time = 10;
        int calories = 200;
        int pulse = 110;

        TimeEfficiency timeEfficiency = Mockito.mock(TimeEfficiency.class);
        Mockito.when(timeEfficiency.getTimeEfficiency(time)).thenReturn(1);

        CaloriesEfficiency caloriesEfficiency = Mockito.mock(CaloriesEfficiency.class);
        Mockito.when(caloriesEfficiency.getCaloriesEfficiency(calories)).thenReturn(3);

        PulseEfficiency pulseEfficiency = Mockito.mock(PulseEfficiency.class);
        Mockito.when(pulseEfficiency.getPulseEfficiency(pulse)).thenReturn(4);

        //when
        EfficiencyProvider efficiencyProvider = new EfficiencyProvider(timeEfficiency, caloriesEfficiency, pulseEfficiency);
        String result = efficiencyProvider.getTrainingEfficiency(time, calories, pulse);

        //then
        Assertions.assertEquals("perfect", result);
    }

    @Test
    public void shouldThrowExceptionWhenInvalidInput() {
        //given
        int time = 1;
        int calories = 3;
        int pulse = 1;

        TimeEfficiency timeEfficiency = Mockito.mock(TimeEfficiency.class);
        Mockito.when(timeEfficiency.getTimeEfficiency(time)).thenReturn(-2);

        CaloriesEfficiency caloriesEfficiency = Mockito.mock(CaloriesEfficiency.class);
        Mockito.when(caloriesEfficiency.getCaloriesEfficiency(calories)).thenReturn(-3);

        PulseEfficiency pulseEfficiency = Mockito.mock(PulseEfficiency.class);
        Mockito.when(pulseEfficiency.getPulseEfficiency(pulse)).thenReturn(-2);

        //when
        EfficiencyProvider efficiencyProvider = new EfficiencyProvider(timeEfficiency, caloriesEfficiency, pulseEfficiency);
        RuntimeException exception = Assertions.assertThrows(RuntimeException.class, () -> efficiencyProvider.getTrainingEfficiency(time, calories, pulse));

        //then
        Assertions.assertEquals("Check your training data", exception.getMessage());
    }

}




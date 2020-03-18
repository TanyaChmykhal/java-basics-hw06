import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TemperatureTest {

  @DataProvider(name = "Fahrenheit")
  public static Object[][] fahrenheit() {
    return new Object[][]{
        {212.0, 100.0},
        {32.0, 0.0},
        {-15, -26.11111111111111},
            {1, -17.22222222222222},
            {-34, -36.666666666666664}
    };
  }

  @DataProvider(name = "Celsius")
  public static Object[][] celsius() {
    return new Object[][]{
        {100.0, 212.0},
        {0.0, 32.0},
        {-26.11111111111111, -15},
            {5, 41.0},
            {0.12, 32.216}
    };
  }

  @Test(dataProvider = "Fahrenheit")
  public void testFahrenheitToCelsius(double fahrenheit, double expectedResult) {
    double actulResult = Temperature.fahrenheitToCelsius(fahrenheit);

    assertEquals(actulResult, expectedResult, "Conversion from Fahrenheit to Celsius is wrong");
  }

  @Test(dataProvider = "Celsius")
  public void testCelsiusToFahrenheit(double celsius, double expectedResult) {
    double actulResult = Temperature.celsiusToFahrenheit(celsius);

    assertEquals(actulResult, expectedResult, "Conversion from Celsius to Fahrenheit is wrong");
  }
}
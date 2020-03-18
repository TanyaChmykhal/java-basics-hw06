public class Temperature {

  public static double fahrenheitToCelsius(double fahrenheit) {
    double celsius = 5 * (fahrenheit - 32)/9;
    return celsius;
  }
  public static double celsiusToFahrenheit(double celsius) {
    double fahrenheit = (9 * celsius + 160) / 5;
    return fahrenheit;

  }
}


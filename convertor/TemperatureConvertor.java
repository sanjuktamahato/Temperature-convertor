import java.util.Scanner;

public class TemperatureConvertor{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        double celsius, fahrenheit, kelvin;

        System.out.print("\nEnter Temperature in Celsius : ");
        celsius = sc.nextDouble();

        fahrenheit = celsius*1.8+32;
        kelvin = celsius+273.15;

        System.out.println("\nTemperature in Kelvin : "+kelvin);
        System.out.println("\nTemperature in Fahrenheit : "+fahrenheit);
            }
}
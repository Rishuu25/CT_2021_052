package Q__5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat dff = new DecimalFormat("#.##");

        double temper; //Temperature in Fahrenheit
        System.out.println("Enter Temperature in Fahrenheit (\u00B0F):  ");
        temper = scanner.nextDouble();

        double Celsius = (5.0 / 9.0)*(temper - 32);

        System.out.println(dff.format(Celsius) + "\u00B0C");
    }
}

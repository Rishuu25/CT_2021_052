package Q__3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat dff = new DecimalFormat("#.##");

        double temp;
        System.out.println("Enter temperature in Celsius:  ");
        temp = scanner.nextDouble();

        double fahrenheit = (1.8*temp)+32;

        System.out.println(dff.format(fahrenheit)  + "\u00B0F"); // Temperature in Fahrenheit
    }
}

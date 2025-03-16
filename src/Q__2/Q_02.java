package Q__2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat dff = new DecimalFormat("#.##");

        double length;
        System.out.println("Enter length or height in centimeters: ");
        length = scanner.nextDouble() ;

        double feet = length / 30;
        System.out.println(dff.format(feet)  + " feet"); //feet value

        double inch = length / 2.54;
        System.out.println(dff.format(inch)  + " inch"); //inch value
    }
}

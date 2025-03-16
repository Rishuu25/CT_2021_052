package Q__8;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat dff = new DecimalFormat("#.##");

        double r; //radius
        System.out.println("Enter radius in meters:  ");
        r = scanner.nextDouble();

        double pi = Math.PI;

        double v = ((4.0/3.0)*(pi * Math.pow(r,3))); // volume

        System.out.println("Volume is "+ dff.format(v)+"m\u00B3");
    }
}

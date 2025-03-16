package Q__9;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat dff = new DecimalFormat("#.##");
        double P ; // Principal amount
        double R ; // Interest rate
        double N; // Number of years

        System.out.println("Enter Principal amount: Rs ");
        P = scanner.nextDouble();

        System.out.println("Enter thr interest rate(%): ");
        R = scanner.nextDouble();

        System.out.println("Enter the number of years:  ");
        N = scanner.nextDouble();

        double rate= R/100.0; // rate in decimal form

        double F = P*(Math.pow((1+rate),N));

        double earn = F - P; // Amount of money earned

        System.out.println("Amount of money earned:Rs "+ dff.format(earn));
    }
}

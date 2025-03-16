package Q__10;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat dff = new DecimalFormat("#.##");

        double L ; // Loan amount
        double P; // annual interest rate
        double T; // time period

        System.out.println("Enter the loan amount: Rs ");
        L = scanner.nextDouble();

        System.out.println("Enter the annual interest rate (%):  ");
        P = scanner.nextDouble();

        System.out.println("Enter the loan period in years: ");
        T = scanner.nextDouble();

        double monthlyInterestRate = P / 100.0 / 12;
        double numberofPayments = T * 12;
        double monthlyPayment =  (L * monthlyInterestRate) / (1 - Math.pow(1 / (1 + monthlyInterestRate),numberofPayments));
        double totalPayment = monthlyPayment * numberofPayments;


        System.out.println("Monthly Payment: Rs " + dff.format(monthlyPayment) ); // Monthly payment
        System.out.println("Total Payment: Rs "+dff.format(totalPayment) ); // Total payment
    }
}

package Q__4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat dff = new DecimalFormat("#.##");

        double weight;
        System.out.println("Enter weight in Pounds:  ");
        weight = scanner.nextDouble();

        double calories = weight * 19;

        System.out.println("Number of Calories per one day :"+ dff.format(calories)  +" cal" ); // Required number of calories
    }
}

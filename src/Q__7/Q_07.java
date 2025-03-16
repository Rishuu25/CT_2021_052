package Q__7;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat dff = new DecimalFormat("#.##");

        double w; //weight
        System.out.println("Enter weight in kilograms:  ");
        w = scanner.nextDouble();

        double h; //height
        System.out.println("Enter height in centimeters:  ");
        h = scanner.nextDouble();

        double BMI = w / Math.pow((h / 100.0), 2);
        System.out.println("Your BMI value is :"+dff.format(BMI)); //BMI value

        if (20 <= BMI & BMI<=25){
            System.out.println("BMI of about 20 to 25 is considered \"normal\"");
        }
        else {
            System.out.println("not normal");
        }
    }
}

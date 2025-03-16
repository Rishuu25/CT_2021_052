package Q__6;

import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Q_06 {
    public static void main(String[] args) {

        GregorianCalendar calendar = new GregorianCalendar();
        int current_year = calendar.get(calendar.YEAR);

        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("Enter the year you are born :  ");
        year = scanner.nextInt();

        int age = current_year - year;

        System.out.println("You were born in "+ year+" and will be (are) "+age+" this year.");


    }
}

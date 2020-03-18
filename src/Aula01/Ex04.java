package Aula01;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer year, month, day;

        System.out.println("Insira os anos: ");
        year = scanner.nextInt();

        System.out.println("\nInsira os meses: ");
        month = scanner.nextInt();

        System.out.println("\nInsira os dias: ");
        day = scanner.nextInt();

        calculateDays(day, month, year);
    }

    private static void calculateDays(Integer day, Integer month, Integer year) {
        Calendar cal = Calendar.getInstance();
        Date currentDate = new Date();
        cal.setTime(currentDate);

        cal.add(Calendar.YEAR, -year);
        cal.add(Calendar.MONTH, -month);
        cal.add(Calendar.DAY_OF_YEAR, -day);

        long diff = cal.getTime().getTime() - currentDate.getTime();
        System.out.println(-TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS));
    }
}

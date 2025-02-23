package by.bogdanov.L23_12_2024;

import java.util.Scanner;

public class HomeWorkPdf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите оценки:");
        int socialGrant = 100;
        int grant = 150;
        double ratioForHighGrant = 1.25;
        double ratioForSpecialGrant = 1.75;
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int number = sc.nextInt();
        if ((a < 4 && b < 4 && c < 4) || (b < 4 && c < 4 && d < 4) || (a < 4 && c < 4 && d < 4) || (a < 4 && b < 4 && d < 4)) {
            System.out.println("Студент отчислен за неуспеваемость");
        } else if (a < 4 || b < 4 || c < 4 || d < 4) {
            System.out.println("Студент имеет академическую задолженность");
            System.out.println("Стипендия не начислена");
        } else if (number % 2 != 0) {
            System.out.println("Стипендия не начислена (студент – платник)");
        } else {
            double score = (double) (a + b + c + d) / 4;
            System.out.println("Средний балл в сессию " + score);
            if (score > 9 && a >= 8 && b >= 8 && c >= 8 && d >= 8) { // мб else if
                double SpecialGrant = grant * ratioForSpecialGrant;
                int SpecialGrantRub = (int) SpecialGrant;
                double SpecialGrantKop1 = (SpecialGrant - SpecialGrantRub) * 100;
                int SpecialGrantKop = (int) SpecialGrantKop1;
                System.out.println("Ежемесячная стипендия " + SpecialGrantRub + " руб. " + SpecialGrantKop + " коп.");
            } else if (score > 7 && score < 10) {
                double HighGrant = grant * ratioForHighGrant;
                int HighGrantRub = (int) HighGrant;
                double HighGrantKop1 = (HighGrant - HighGrantRub) * 100;
                int HighGrantKop = (int) HighGrantKop1;
                System.out.println("Ежемесячная стипендия " + HighGrantRub + " руб. " + HighGrantKop + " коп.");
            } else if (score > 5 && score <= 7) {
                System.out.println("Ежемесячная стипендия " + grant + " руб. 00 коп.");
            } else {
                System.out.println("Ежемесячная стипендия " + socialGrant + " руб. 00 коп.");
            }
        }
    }
}

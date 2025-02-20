package by.bogdanov.L23_12_2024;

import java.util.Scanner;

//    День недели
//
//    Ввести с клавиатуры номер дня недели, в зависимости от номера вывести название
//«понедельник», «вторник», «среда», «четверг», «пятница», «суббота», «воскресенье»,
//    если введен номер больше 7 или меньше 1 – вывести «такого дня недели не существует».
//    Пример для номера 5:
//    пятница
//    Пример для номера 10:
//    такого дня недели не существует
public class Task01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        switch (a) {
            case 1:
                System.out.println("понедельник");
                break;
            case 2:
                System.out.println("вторник");
                break;
            case 3:
                System.out.println("среда");
                break;
            case 4:
                System.out.println("четверг");
                break;
            case 5:
                System.out.println("пятница");
                break;
            case 6:
                System.out.println("суббота");
                break;
            case 7:
                System.out.println("воскресенье");
                break;
            default:
                System.out.println("такого дня недели не существует");

        }
    }
}

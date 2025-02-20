package by.bogdanov.L19_12_2024;

public class Task01 {
//    public static void main(String[] args) {
//        int sec = 186385;
//        int day = sec / 86400;
//        int hour = (sec - day * 86400) / 3600;
//        int min = (sec - day * 86400 - hour * 3600) / 60;
//        int second =(sec - day * 86400 - hour * 3600 - min * 60);
//        System.out.println("До нового года осталось " + day + " дней " + hour + " часов " + min + " минут " + second + " секунд");
//    }
public static void main(String[] args) {
    int sec = 186385;
    int day = sec / 86400;
    int hour = sec % 86400 / 3600;
    int min = hour % 60 / 60;
    System.out.println(min);
    System.out.println("До нового года осталось " + day + " дней " + hour + " часов " + min + " минут " + " секунд");
}
}

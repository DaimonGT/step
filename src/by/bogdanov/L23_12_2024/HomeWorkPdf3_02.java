package by.bogdanov.L23_12_2024;

/*Написать программу, которая выводит таблицу умножение в виде таблицы Пифагора:*/
public class HomeWorkPdf3_02 {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 11 ; j++) {
                int a = i * j;
                System.out.print(a + " ");
            }
            System.out.println(" ");
        }
    }
}


package by.bogdanov.L19_12_2024;

public class HomeWork06 {
    static public void main(String[] args){
        int a, b, c;
        a = 12;
        b = 25;
        c = 7;
        if(a > b && a > c){
            System.out.println("Наибольшое число " + a);
        } else if (b > a && b > c){
            System.out.println("Наибольшое число " + b);
        } else {
            System.out.println("Наибольшое число " + c);
        }
    }
}

package by.bogdanov.L16_12_2024;

//Объявление переменных
public class Task01 {
    public static void main(String[] args) {
        int var1; // объявили переменную типа int название переменной var1
        var1 = 1; //присвоили значение переменной
        int var2 = 2;//инициализация переменной
        var1 = var2;
        int i = var1 / 2;
        int a = var1 * 100000;
        int b = var1 + 17;
        int c = b - 3;
        System.out.println(var1);
        System.out.println(var2);
        System.out.println(i);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println("Мы присвоили переменной с " + c);
    }
}

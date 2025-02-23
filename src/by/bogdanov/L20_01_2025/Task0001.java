package by.bogdanov.L20_01_2025;

public class Task0001 {
    public static void main(String[] args) {
        int sum = num();
        System.out.println(nums(sum));
    }
    public static int num(){
      int a = 6;
      int b = 8;
      int sum = a + b;
      return sum;
    }
    public static int nums(int sum) {
        int c = 10;
        int g = c + sum;
        return g;
    }

}

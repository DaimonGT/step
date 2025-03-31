package by.bogdanov.L31_03_2025;

import javax.imageio.IIOException;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Task00 {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("src/by/bogdanov/L31_03_2025/one.txt");
            int i = Integer.parseInt("7");
            System.out.println("Файл не найдет"); // не будет выведено, т.к обработано исключение ниже
        } catch (FileNotFoundException | NumberFormatException e) {
            System.out.println("Файл не найден по такому то пути или не число в строке");
        } /*catch (IIOException e) {
            System.out.println("");
        }*/
        // Основной родитель (Ошибки идут по возрастанию)
        catch (Exception e) {
            System.out.println("Общая ошибка");
        }
        // закрывает потоки
        finally {
            System.out.println("Выполняем в любом случае");
        }
        System.out.println("После try/catch");
        try {
            test2(38);
        }
        catch (AgeException e){
            System.out.println("Что то пошло не так");
        }
        try {
            test3(17);
        } catch (AgeCheckedException e) {
            System.out.println("Меньше 18");
        }

    }

    private static void test() throws FileNotFoundException {
        FileReader fileReader = new FileReader("one.txt");
    }
    private static void test2(int age){
        if(age < 18){
            throw new AgeException("Возраст меньше 18");
        }
    }

    private static void test3(int age) throws AgeCheckedException { // throws AgeCheckedException будет прокидывать выше
        if(age < 18){
            throw new AgeCheckedException("Возраст меньше 18");
        }
    }

    //из непроверяемого сделали проверяемое исключение
    private static void test4() throws NumberException {
        try {
            Integer.parseInt("wewe");
        }
        catch (NumberFormatException e){
            throw new NumberException("У нас не цифра");
        }
    }
}

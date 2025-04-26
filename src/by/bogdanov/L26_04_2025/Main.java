package by.bogdanov.L26_04_2025;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<BankAccount> accounts = List.of(
                new BankAccount("12345", "Иван Иванов", List.of(
                        new Transaction(LocalDate.of(2025, 1, 5), Transaction.Type.DEPOSIT, 500.0),
                        new Transaction(LocalDate.of(2025, 2, 10), Transaction.Type.WITHDRAWAL, 120.0)
                )),
                new BankAccount("67890", "Мария Петрова", List.of(
                        new Transaction(LocalDate.of(2025, 3, 1), Transaction.Type.DEPOSIT, 1500.0),
                        new Transaction(LocalDate.of(2025, 3, 5), Transaction.Type.WITHDRAWAL, 200.0),
                        new Transaction(LocalDate.of(2025, 3, 7), Transaction.Type.DEPOSIT, 300.0)
                )),
                new BankAccount("54321", "Олег Смирнов", List.of(
                        new Transaction(LocalDate.of(2025, 4, 1), Transaction.Type.WITHDRAWAL, 50.0)
                ))
        );

        //Все суммы транзакций
        List<Double> sumTran = accounts.stream()
                .flatMap(bankAccount -> bankAccount.getTransactions()
                        .stream()
                        .map(Transaction::getAmount))
                .toList();
        System.out.println(sumTran);

        //Получите List<Transaction> только депозитов:
        List<Transaction> transactions = accounts.stream()
                .flatMap(bankAccount -> bankAccount.getTransactions()
                        .stream())
                .filter(transaction -> transaction.getType() == Transaction.Type.DEPOSIT)
                .toList();

        System.out.println(transactions);

        //Соберите List<LocalDate> дат снятий:
        List<LocalDate> list3 = accounts.stream()
                .flatMap(bankAccount -> bankAccount.getTransactions()
                        .stream())
                .filter(transaction -> transaction.getType() == Transaction.Type.WITHDRAWAL)
                .map(Transaction::getDate)
                .toList();

        System.out.println(list3);

        //Распечатайте всех владельцев:
        List<String> list4 = accounts.stream().map(bankAccount -> bankAccount.getOwnerName())
                .toList();
        System.out.println(list4);

        //Найдите транзакции больше 1000Br:
        List<Transaction> more1000 = accounts.stream().flatMap(bankAccount -> bankAccount.getTransactions()
                        .stream())
                .filter(transaction -> transaction.getAmount() > 1000).toList();
        System.out.println(more1000);

        //Отсортируйте все транзакции по возрастанию суммы:
        List<Transaction> list = accounts.stream().flatMap(bankAccount -> bankAccount.getTransactions()
                        .stream())
                .sorted(Comparator.comparing(Transaction::getAmount))
                .toList();
        System.out.println(list);

        //Выберите List top2, два самых крупных снятия:
        List<Transaction> list1 = accounts.stream().flatMap(bankAccount -> bankAccount.getTransactions()
                        .stream())
                .sorted(Comparator.comparing(Transaction::getAmount).reversed())
                .limit(2)
                .toList();
        System.out.println(list1);

        //Выведите accountNumber и число транзакций: (ожно без .stream)
        accounts.forEach(bankAccount -> System.out.println(bankAccount.getAccountNumber() + " " + bankAccount.getTransactions().size()));

        // Проверьте, есть ли счёт без транзакций:
        Optional<BankAccount> any = accounts.stream()
                .filter(bankAccount -> bankAccount.getTransactions().isEmpty())
                .findAny();
        boolean b = accounts.stream().anyMatch(bankAccount -> bankAccount.getTransactions().isEmpty());
        System.out.println(any);
        System.out.println(b);

        //Соберите Set<String> имён владельцев, которые делали депозиты:
    }
    }
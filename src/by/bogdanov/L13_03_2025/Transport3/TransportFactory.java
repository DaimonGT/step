package by.bogdanov.L13_03_2025.Transport3;

import java.util.List;
import java.util.Random;

public class TransportFactory {
    private static final Random num = new Random();
    private static final List<String> models = List.of("Honda", "Suzuki", "BMW", "Mercedes");
    private static final List<String> typeOfFuels = List.of("Бензин", "Дизель", "Газ");

    // нельзя изменить конструктов
   private TransportFactory() {
   }

    static Transport next() {
        int countTransport = num.nextInt(3);
        if (countTransport == 1) {
            return new Bike(models.get(num.nextInt(models.size())), num.nextInt(220, 400), String.valueOf(num.nextInt(1111, 9999)), num.nextBoolean(), num.nextInt(1965, 2024), UserFactory.next());
        } else if (countTransport == 2) {
            return new Car(models.get(num.nextInt(models.size())), num.nextInt(180, 360), String.valueOf(num.nextInt(1111, 9999)), typeOfFuels.get(num.nextInt(typeOfFuels.size())), num.nextInt(1965, 2024), UserFactory.next());
        } else {
            return new Truck(models.get(num.nextInt(models.size())), num.nextInt(120, 160), String.valueOf(num.nextInt(1111, 9999)), num.nextInt(1, 4), num.nextInt(1965, 2024), UserFactory.next());
        }
    }
}

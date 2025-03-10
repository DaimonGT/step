package by.bogdanov.L06_03_2025.Transport;

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
            return new Bike(models.get(num.nextInt(models.size())), num.nextInt(220, 400), num.nextBoolean());
        } else if (countTransport == 2) {
            return new Car(models.get(num.nextInt(models.size())), num.nextInt(180, 360), typeOfFuels.get(num.nextInt(typeOfFuels.size())));
        } else {
            return new Truck(models.get(num.nextInt(models.size())), num.nextInt(120, 160), num.nextInt(1, 4));
        }
    }
}

package by.bogdanov.L06_03_2025.Transport;

import by.bogdanov.L03_03_2025.Student.Student;

import java.util.Objects;

public abstract class Transport {
    private String model;
    private final int speed;

    public Transport(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Objects.equals(model, transport.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getClass() , model);
        //return Objects.hashCode(model);
    }

    @Override
    public String toString() {
        return "Модель: " + model + " максимальная скорость: " + speed;
    }
}

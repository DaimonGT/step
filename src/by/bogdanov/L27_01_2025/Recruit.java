package by.bogdanov.L27_01_2025;

import java.util.ArrayList;
import java.util.List;

public class Recruit {
    private int id;
    private String firstName;
    private String middleName;
    private String lastName;
    private List<Boolean> valid = new ArrayList<>(); // годен
    private String diagnosis; // диагноз
    private double visionCoeff; // уровень зрения
    private boolean flatFeet; // наличие плоскостопия
    private int implantCount; // кол-во зубных протезов
    private int cardiogram; // результаты кардиограммы
    private static int totalRecruits = 0;

    public Recruit(String lastName, String firstName, String middleName, double visionCoeff, boolean flatFeet, int implantCount, int cardiogram) {
        this.id = ++totalRecruits;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.visionCoeff = visionCoeff;
        this.flatFeet = flatFeet;
        this.implantCount = implantCount;
        this.cardiogram = cardiogram;
    }

    public String getLastName() {
        return lastName;
    }

    public int getImplantCount() {
        return implantCount;
    }

    public void setValid(boolean val) {
        this.valid.add(val);
    }

    // Если хотя бы одно значение false, возвращаем false
    public boolean isValid() {
        for (Boolean value : valid) {
            if (!value) {
                return false;
            }
        }
        return true;
    }

    public double getVisionCoeff() {
        return visionCoeff;
    }

    public void setVisionCoeff(double visionCoeff) {
        this.visionCoeff = visionCoeff;
    }

    public boolean isFlatFeet() {
        return flatFeet;
    }

    public void setFlatFeet(boolean flatFeet) {
        this.flatFeet = flatFeet;
    }

    public String isDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        if(this.diagnosis == null) {
            this.diagnosis = diagnosis;
        } else {
            this.diagnosis += " " + diagnosis;
        }
    }

    public int getCardiogram() {
        return cardiogram;
    }

    public void setCardiogram(int cardiogram) {
        this.cardiogram = cardiogram;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return isValid() ? firstName + " " + middleName + " " + lastName + " — годен" : firstName + " " + middleName
                + " " + lastName + " — не годен " + "(" + diagnosis + ")";
    }

    // метод для проверки новобранца
    public String displayInfo() {
        return "ID: " + id + ". ФИО: " + lastName + " " + firstName + " " + middleName
                + "\nКоэффициент зрения: " + visionCoeff + "; плоскостопие: " + (flatFeet ? "Да" : "Нет")
                + "; количество имплантов: " + implantCount + "; кардиограмма: " + cardiogram;
    }
}

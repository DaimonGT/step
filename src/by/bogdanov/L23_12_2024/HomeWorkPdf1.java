package by.bogdanov.L23_12_2024;

import java.util.Scanner;

public class HomeWorkPdf1 {
    public static void main(String[] args) {
        double costGas = 0.5477; // стоимость газа
        double costHotWater = 1.5553; // стоимость воды
        double costColdWater = 1.5553; // стоимость воды
        double sewageSystem = 1.3095; // стоимость водоотведения
        double waterHeating = 24.7187; // тариф подогрева воды
        double Heating1m3 = 0.0753; // стоимость подогрева 1м3 воды
        double costElectricity = 0.2537; // стоимость электричества
        double costTechnicalMaintenance = 0.1771; // стоимость технического обслуживания
        double costOverhaul = 0.2335; // стоимость капитального ремонта
        double costElevator = 0.0801; // техническое обслуживание лифта
        double costWastes = 2.96; // отходы
        double costMaintenanceOfAdditionalPremises = 0.056; // содержание вспомог. помещений
        double costLighting = 0.029; // освещение вспомог. помещений
        double costElectricityForElevator = 0.67; // электроэнергия на работу лифта
        double costTechnicalMaintenanceHome = 1.36; // тех. обслуживание устройств дома
        double costVideoControl = 5.2; // видеонаблюдение
        double costPropertyManagement = 0.0318; // управление общим имуществом
        // Ввод данных
        Scanner sc = new Scanner (System.in);
        System.out.println("Программа расчёта квартплаты и коммунальных платежей");
        System.out.println("-------------------------------------------------------------");
        System.out.print("Введите объём потреблённого газа (м. куб.)............: ");
        int gas = sc.nextInt();
        System.out.print("Введите объём потреблённой горячей воды (м. куб.).....: ");
        int hotWater = sc.nextInt();
        System.out.print("Введите объём потреблённой холодной воды (м. куб.)....: ");
        int coldWater = sc.nextInt();
        System.out.print("Введите объём потреблённой электроэнергии (кВт * ч)...: ");
        int electricity = sc.nextInt();
        System.out.print("Введите площадь квартиры (м. кв.).....................: ");
        int square = sc.nextInt();
        // Расчёт за газ
        double payForGas = costGas * gas;
        int payForGasRub = (int) payForGas;
        double payForGasKop1 = (payForGas - payForGasRub) * 100;
        int payForGasKop = (int) payForGasKop1;
        // Расчёт за воду
        double payForColdWater = costColdWater * coldWater;
        double payForHotWater = costHotWater * hotWater;
        double payForSewageSystem = (coldWater + hotWater) * sewageSystem;
        double payForWater = payForColdWater + payForHotWater + payForSewageSystem;
        int payForWaterRub = (int) payForWater;
        double payForWaterKop1 = (payForWater - payForWaterRub) * 100;
        int payForWaterKop = (int) payForWaterKop1;
        // Расчёт электроэнергии
        double payForElectricity = costElectricity * electricity;
        int payForElectricityRub = (int) payForElectricity;
        double payForElectricityKop1 = (payForElectricity - payForElectricityRub) * 100;
        int payForElectricityKop = (int) payForElectricityKop1;
        // Расчёт подогрева воды
        double payForWaterHeating = Heating1m3 * hotWater * waterHeating;
        int payForWaterHeatingRub = (int) payForWaterHeating;
        double payForWaterHeatingKop1 = (payForWaterHeating - payForWaterHeatingRub) * 100;
        int payForWaterHeatingKop = (int) payForWaterHeatingKop1;
        // Расчёт за квартиру
        double payForFlat = (costTechnicalMaintenance + costOverhaul + costElevator + costMaintenanceOfAdditionalPremises + costLighting + costPropertyManagement) * square + costWastes + costElectricityForElevator + costTechnicalMaintenanceHome + costVideoControl;
        int payForFlatRub = (int) payForFlat;
        double payForFlatKop1 = (payForFlat - payForFlatRub) * 100;
        int payForFlatKop = (int) payForFlatKop1;
        // Итого:
        double total = payForGas + payForWater + payForElectricity + payForWaterHeating + payForFlat;
        int totalRub = (int) total;
        double totalKop1 = (total - totalRub) * 100;
        int totalKop = (int) totalKop1;
        // Вывод расчёта
        System.out.println();
        System.out.println("Сумма Ваших платежей:");
        System.out.println("За газ..............: " + payForGasRub + " руб. " + payForGasKop + " коп.");
        System.out.println("За воду.............: " + payForWaterRub + " руб. " + payForWaterKop + " коп.");
        System.out.println("За электроэнергию...: " + payForElectricityRub + " руб. " + payForElectricityKop + " коп.");
        System.out.println("За подогрев воды....: " + payForWaterHeatingRub + " руб. " + payForWaterHeatingKop + " коп.");
        System.out.println("За квартиру.........: " + payForFlatRub + " руб. " + payForFlatKop + " коп.");
        System.out.println("--------------------------------------");
        System.out.println("Итого...............: " + totalRub + " руб. " + totalKop + " коп.");
    }
}

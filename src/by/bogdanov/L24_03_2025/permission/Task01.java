package by.bogdanov.L24_03_2025.permission;

import java.util.EnumMap;
import java.util.Map;

public class Task01 {
    public static void main(String[] args) {
        EnumMap<Role, Integer> roleIntegerEnumMap = new EnumMap<>(Role.class);
        roleIntegerEnumMap.put(Role.USER, 10);
        roleIntegerEnumMap.put(Role.GUEST, 30);
        roleIntegerEnumMap.put(Role.ADMIN, 3);

        for (Map.Entry<Role, Integer> entry : roleIntegerEnumMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        // вывести все роли у юзера
        Role user = Role.USER;
        for (Permission permission : user.getPermissions()) {
            System.out.println(permission + " " + permission.getDescription());
        }

        // проверить есть ли роль
        boolean hasPermission = user.hasPermission(Permission.DELETE);
        System.out.println(hasPermission);

        // возвращает все роли
        for (Role value : Role.values()) {
            System.out.println(value.name());
        }
        // порядковый номер в Enum
        int ordinal = user.ordinal();
        System.out.println(ordinal);
    }
}


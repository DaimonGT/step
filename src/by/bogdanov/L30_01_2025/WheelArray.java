package by.bogdanov.L30_01_2025;

import java.util.Arrays;

public class WheelArray {

    Wheel[] wheels;
    int size;

    public WheelArray(int capacity) {
        wheels = new Wheel[capacity];
    }

    public void add(Wheel wheel) {
        if(size < wheels.length) {
            wheels[size++] = wheel;
        }
        else {
            Wheel[] wheels1 = new Wheel[wheels.length + 1];
            for (int i = 0; i < wheels.length; i++) {
                wheels1[i] = wheels[i];
            }
            wheels1[size++] = wheel;
            wheels = wheels1;
        }
    }

    public Wheel get(int index) {
        return wheels[index];
    }

    public void sortByDiameter() {
      int num;
        boolean sort = false;
        while (!sort) {
            for (int i = 1; i < wheels.length; i++) {
                sort = true;
                if (wheels[i].diameter < wheels[i - 1].diameter) {
                    num = wheels[i - 1].diameter;
                    wheels[i - 1].diameter = wheels[i].diameter;
                    wheels[i - 1].diameter = num;
                    sort = false;
                }
            }
        }

    }
    public void sortByType () {
        for(int i = 0; i < wheels.length -1; i++) {
            for (int j = 0; j < wheels.length - i -1; j++) {
                if (wheels[j] == null || wheels[j + 1] == null) {
                    continue;
                }
                if (wheels[j].type.compareTo(wheels[j+1].type) > 0) {
                    Wheel temp = wheels[j];
                    wheels[j] = wheels[j+1];
                    wheels[j+1] = temp;
                }
            }
        }
/*        int num;
        boolean sort = false;
        while (!sort ) {
            for (int i = 1; i < wheels.length; i++) {
                sort = true;
                if (wheels[i].type.compareTo(wheels[i - 1].type) > 0) {
                    num = wheels[i - 1].diameter;
                    wheels[i - 1].diameter = wheels[i].diameter;
                    wheels[i - 1].diameter = num;
                    sort = false;
                }
            }
        }*/
    }
    public int getSize() {
        return size;
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    @Override
    public String toString() {
        return "WheelArray{" +
                "wheels=" + Arrays.toString(wheels) +
                ", size=" + size +
                '}';
    }
}

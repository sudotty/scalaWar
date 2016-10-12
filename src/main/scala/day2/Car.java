package day2;

/**
 * Created by sin13cos14 on 16/10/13  00:42.
 */
public class Car {
    private final int year;
    private int miles;

    public Car(int yearOfMake) {
        year = yearOfMake;
    }

    public int getYear() {
        return year;
    }

    public int getMiles() {
        return miles;
    }

    public void drive(int distance) {
        miles += Math.abs(distance);
    }
}

package Examples;

public class CarDemo {
    public static void main(String[] args) {
        Car newCar = new Car();
        newCar.aboutCar("Green", "BMW", 2001);
        System.out.println("model; " + newCar.model);
        System.out.println("year; " + newCar.year);
        Car newCar1 = new Car();
        newCar1.aboutCar("Red", "Mercedes", 1997);
        System.out.println("Year; " + newCar1.year);
    }
}

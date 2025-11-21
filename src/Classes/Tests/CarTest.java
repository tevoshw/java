package Classes.Tests;

import Classes.dominium.Car;

public class CarTest {
    static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        car1.Name = "Devil Mustang";
        car1.Model = "GT 500";
        car1.Year = 2025;

        car2.Name = "Lamborghini";
        car2.Model = "Garllhardo";
        car2.Year = 2020;

        System.out.println("Car 1: " + car1.Name + car1.Model + car1.Year);
        System.out.println("Car 2: " + car2.Name + car2.Model + car2.Year);

        System.out.println();
        System.out.println("Changes!");
        car1 = car2;
        System.out.println("Car 1: " + car1.Name + car1.Model + car1.Year);
        System.out.println("Car 2: " + car2.Name + car2.Model + car2.Year);




    }
}

package DefinndingClasses;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Car car = new Car();
        car.brand="Mercedes";
        car.model="E270";
        car.hoursePower=177;
        car.setHoursePower(200);

        System.out.printf("The car is: %s %s - %d HP%n",car.brand,car.model,car.hoursePower);
        System.out.println(String.format("The car is: %s %s - %d HP",car.brand,car.model,car.hoursePower));

        Car car2=new Car();
        car.setName("Djaro");
        System.out.println(car.getName());

    }
}

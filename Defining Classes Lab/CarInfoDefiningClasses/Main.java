package CarInfoDefiningClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Car car = new Car();

        car.setBrand("Chevrolet");
        car.setModel("Impala");
        car.setHorsePower(390);

//        System.out.println(String.format("The car is %s %s - %d HP",car.getBrand(),car.getModel(),car.getHorsePower()));
        int n=Integer.parseInt(scanner.nextLine());
        List<Car>myListWithCar=new ArrayList<>();
        for(int i=1 ;i<=n ;i++){
            String[] carData=scanner.nextLine().split(" ");
            String brand=carData[0];
            String model=carData[1];
            int horsePower=Integer.parseInt(carData[2]);

            Car car2=new Car();
            car2.setBrand(brand);
            car2.setModel(model);
            car2.setHorsePower(horsePower);
            myListWithCar.add(car2);
        }
        myListWithCar.forEach(element -> System.out.println(element.carInfo()));
    }
}

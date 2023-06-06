package Vehicle;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String,BaseVechicle>vehicleMap=new LinkedHashMap<>();

        String[] tokens=scanner.nextLine().split("\\s+");
       double carQuantity=Double.parseDouble(tokens[1]);
       double carFuelConsumption=Double.parseDouble(tokens[2]);

        Car car=new Car(carQuantity,carFuelConsumption);
        vehicleMap.put("Car",car);

        tokens=scanner.nextLine().split("\\s+");
        double truckQuantity=Double.parseDouble(tokens[1]);
        double truckFuelConsumption=Double.parseDouble(tokens[2]);

        Truck truck=new Truck(truckQuantity,truckFuelConsumption);
        vehicleMap.put("Truck",truck);

        int n=Integer.parseInt(scanner.nextLine());

        for(int i=0 ;i<n ;i++){
            tokens=scanner.nextLine().split("\\s+");
            String command=tokens[0];
            String vechihleType=tokens[1];

            switch (command){
                case "Drive":
            //Drive Car 500
                    double distance=Double.parseDouble(tokens[2]);
                    if(vechihleType.equals("Car")){
                        System.out.println(car.drive(distance));
                    }else{
                        System.out.println(truck.drive(distance));
                    }
                    break;
                case "Refuel":
                    double liters=Double.parseDouble(tokens[2]);
                    if(vechihleType.equals("Car")){
                        car.refuel(liters);
                    }else{
                        truck.refuel(liters);
                    }
                    break;
            }
        }

//        Finally, print the remaining fuel for both car and truck rounded 2 digits after the floating point in the format:
        vehicleMap.values().stream().forEach(System.out::println);

    }
}
